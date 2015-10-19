package org.dbb.doom;

/**
 * Game compatibility constants.
 *
 * Created by dbarzen on 19.10.15.
 */
public enum GameCompatibility {

    GI_NONE(0x00000000),
    GI_MAPxx(0x00000001),
    GI_SHAREWARE(0x00000002),
    GI_MENUHACK_EXTENDED(0x00000004),       // Heretic.
    GI_TEASER2(0x00000008),                 // Alternative Strife 2 teaser.
    GI_COMPATSHORTTEX(0x00000010),          // Always force COMPAT_SHORTTEX for IWAD maps.
    GI_COMPATSTAIRS(0x00000020),            // Same for stair building.
    GI_COMPATPOLY1(0x00000040),             // Hexen's MAP36 needs old polyobject drawing.
    GI_COMPATPOLY2(0x00000080),             // So does HEXDD's MAP47.
    GI_NOEXTCOLOR(0x00000100);              // Chex Quest 3 would have everything green.

    private final int value;

    GameCompatibility(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
