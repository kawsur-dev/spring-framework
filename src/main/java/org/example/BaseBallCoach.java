package org.example;

public class BaseBallCoach implements Coach {

    private int distance;

    public String getInstruction() {
        return "Run " + this.getDistance() + " KM Daily";
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
