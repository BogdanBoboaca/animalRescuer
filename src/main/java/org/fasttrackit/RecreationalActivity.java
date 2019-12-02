package org.fasttrackit;

public class RecreationalActivity {

    String name;
    String outdoorOrIndoor;
    String type;
    double price;
    String training;

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutdoorOrIndoor() {
        return outdoorOrIndoor;
    }

    public void setOutdoorOrIndoor(String outdoorOrIndoor) {
        this.outdoorOrIndoor = outdoorOrIndoor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }
}
