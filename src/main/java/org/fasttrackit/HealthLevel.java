package org.fasttrackit;

public enum HealthLevel {

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

    private final int healthScore;

    private HealthLevel (int healthScore){
      this.healthScore = healthScore;
    }

    public int getHealthScore() {
        return healthScore;
    }
}
