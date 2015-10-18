package org.dbb.doom;

/**
 * Game type constants.
 *
 * Created by dbarzen on 16.10.15.
 */
public enum GameType {

    ANY(0),
    DOOM(1),
    HERETIC(2),
    HEXEN(4),
    STRIFE(8),
    CHEX(16),
    RAVEN(HERETIC.getValue() | HEXEN.getValue()),
    DOOM_CHEX(DOOM.getValue() | CHEX.getValue()),
    STRIFE_CHEX(DOOM.getValue() | STRIFE.getValue() | CHEX.getValue());

    private final int value;

    GameType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
