#!/bin/bash

################################################################################
# Copyright (c) 2015 HiDensity. All Rights Reserved.
#
# This program is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License
# as published by the Free Software Foundation; either version 2
# of the License, or (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
# ##############################################################################
#
# config-iwad.sh
#
# Tool to automatically create symobilc links to existing IWAD files.
# This is needed for testing purposes of the DOOMlauncher project.
#
# Created by: dennis 2015/11/13

DIALOG_CANCEL=1
DIALOG_ESC=255
HEIGHT=0
WIDTH=0
BACKTITLE="DOOMlauncher - Configure IWAD Files"
LOCAL_IWAD_DIR="lalala"

dir_iwad=""

#
# Displays a little Welcome screen.
#
display_welcome() {
	whiptail --backtitle "$BACKTITLE" \
		--title "Info" \
		--clear \
		--yesno "This tool lets you configure the IWAD files for testing purposes.\n
For licensing issues it will NOT create copies of the original IWAD files, but only
create symbolic links to them.\n
Do you want to continue?" 0 0
}

#
# Displays an error, if the local IWAD directory could not be created.
#
display_local_IWAD_error() {
	# Get error from passed in paramter.
	# The expected error message structure is "mkdir: cannot create directory...: [error reason]"
	# Extract the text after the last ": ".
	local message=${1##*: }
	if [ -z "$message" ]; then
		message="*unknown error*"
	fi
	whiptail --backtitle "$BACKTITLE" \
		--title "Error" \
		--clear \
		--msgbox "An error occurred, when trying to create the local IWAD directory!\n
The operating system returned the following error: $message\n
The tool will terminate now." 0 0
	exit
}

#
# Checks, if the local IWAD directory exists and creates it, if needed.
#
check_local_IwAD_directory() {
	if [ ! -d "$LOCAL_IWAD_DIR" ]; then
		if (whiptail --backtitle "$BACKTITLE" \
			--title "Local IWAD Directory" \
			--clear \
			--yesno "The local IWAD directory (\"$LOCAL_IWAD_DIR\") does not exist.\n
To continue the set-up process, it needs to be created.
Do you want to create the directory automatically now?" 0 0) then
			# Try to create local IWAD directory and send error message to result variable.
			local result=$(mkdir $LOCAL_IWAD_DIR 2>&1)
			if [ ! -z "$result" ]; then 
				display_local_IWAD_error "$result"
			fi
		fi
	fi
}

set_directory() {
	whiptail --backtitle "$BACKTITLE" \
		--title "Set IWAD Directory" \
		--clear \
		--inputbox "Enter the fully qualified path, where the IWAD
files resist, this tool shall be able to create local links for:" 10 72 "$1"
}

#
# Shows a directory browser.
# TODO: A lot!
#
Filebrowser() {
	if [ -z $1 ]; then
		imgpath=$(ls -lhp / | awk -F ' ' ' { printf "%20s" "$9" " " $5 } ')
	else
		imgpath=$(ls -lhp "/$1" | awk -F ' ' ' { printf $9 " " $5 } ')
	fi
	if [ -z $1 ]; then
		pathselect=$(whiptail --menu "Select Image File" 40 70 30 --cancel-button Done --ok-button Select $imgpath 3>&1 1>&2 2>&3)
	else
		pathselect=$(whiptail --menu "Select Image File" 40 70 30 --cancel-button Done --ok-button Select ../ BACK $imgpath 3>&1 1>&2 2>&3)
	fi
	
	RET=$?
	if [ $RET -eq 1 ]; then
		# This is the section where you control what happens when the user hits Cancel
		AdvancedMenu
		exit 0
	elif [ $RET -eq 0 ]; then
		if [[ -d "/$1$pathselect" ]]; then
			Filebrowser "/$1$pathselect"
		elif [[ -f "/$1$pathselect" ]]; then
			# Do your thing here, this is just a stub of the code I had to do what I wanted the script to do.
			fileout=`file "$1$pathselect"`
			filename=`readlink -m $1$pathselect`
			if [[ $fileout =~ x86\ boot\ sector$ ]]; then
				whiptail --yesno --title "! WARNING !" "About to try and automatically resize $filename. Are you sure ?" 10 50
				if [ $? -ne 0 ]; then
					Filebrowser
				fi
			else
				whiptail --msgbox --title "! ERROR ! ERROR ! ERROR ! " "Selected file is not an image file." 8 44
				Filebrowser
			fi
		else
			echo pathselect $1$pathselect
			whiptail --title "! ERROR !" --msgbox "Error setting path to image file." 8 44
			unset base
			unset imgpath
			Filebrowser
		fi
		exit 0
	fi
}

#
# Displays a "Not implmented yet" dialog.
#
not_implemented_yet() {
	whiptail --backtitle "$BACKTITLE" \
		--title "Oh, no! :(" \
		--clear \
		--msgbox "Sorry, but the feature you are lookin for,
has not been implemented yet." 0 0
}

#
# Displays the main menu.
#
display_menu() {
	while true; do
		exec 3>&1
			selection=$(eval `resize`
				whiptail --backtitle "$BACKTITLE" \
				--title "Main Menu" \
				--clear \
				--menu "Choose an option" 16 75 7 \
				--cancel-button "Exit" \
					"set dir" "Enter game's IWAD directory." \
					"browse dir" "Browse for game's IWAD directory." \
					"import all" "Create links for all IWAD files in IWAD directory." \
					"select" "Select IWAD files to create links for." \
					"list" "List all IWADs, local links exist" \
				2>&1 1>&3)
			exit_status=$?
		exec 3>&-
		case $exit_status in
			$DIALOG_CANCEL)
				exit
				;;
			$DIALOG_ESC)
				echo "Program aborted." >&2
				exit 1
				;;
		esac
		case $selection in
			"set dir")
				local path=$(set_directory "$dir_iwad" 3>&1 1>&2 2>&3)
				exit_status=$?
				if [ ! -z "$path" ]; then
					dir_iwad=${path[@]}
				fi
				;;
			"browse dir")
				not_implemented_yet
#				Filebrowser $(pwd)
				;;
			"import all")
				echo "Import all"
				exit
				;;
			"select")
				echo "Select IWADs"
				exit
				;;
			"list")
				echo "List IWADs"
				exit
				;;
		esac
	done
}

#
# Main method
#
configure_main() {
	if (! display_welcome 3>&1 1>&2 2>&3) then
		exit
	fi
	check_local_IwAD_directory
	display_menu
}

configure_main
