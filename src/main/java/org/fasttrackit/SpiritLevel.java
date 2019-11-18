package org.fasttrackit;

public enum SpiritLevel {

    one (1),
    two (2),
    three (3),
    four (4),
    five (5),
    six (6),
    seven (7),
    eight (8),
    nine (9),
    ten (10);

    private final int spiritLevel;

    private SpiritLevel (int spiritLevel){
        this.spiritLevel = spiritLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }
}
