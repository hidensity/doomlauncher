package org.dbb.doom;

/**
 * Game compatibility constants.
 *
 * Created by dennis on 19.10.15.
 */
public class GameCompatibility {

    public static final int GI_NONE = 0x00000000;
    public static final int GI_MAPxx = 0x00000001;
    public static final int GI_SHAREWARE = 0x00000002;
    public static final int GI_MENUHACK_EXTENDED = 0x00000004;      // Heretic.
    public static final int GI_TEASER2 = 0x00000008;                // Alternative Strife 2 teaser.
    public static final int GI_COMPATSHORTTEX = 0x00000010;         // Always force COMPAT_SHORTTEX for IWAD maps.
    public static final int GI_COMPATSTAIRS = 0x00000020;           // Same for stair building.
    public static final int GI_COMPATPOLY1 = 0x00000040;            // Hexen's MAP36 needs old polyobject drawing.
    public static final int GI_COMPATPOLY2 = 0x00000080;            // So does HEXDD's MAP47.
    public static final int GI_NOEXTCOLOR = 0x00000100;             // Chex Quest 3 would have everything green.
}
