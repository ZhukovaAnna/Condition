package ru.netology;

public class Condition {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature() {
        if (!this.isOn())
            return;
        if (this.getCurrentTemperature() + 1 >= this.maxTemperature)
            return;
        this.setCurrentTemperature(this.currentTemperature + 1);

    }

    public void decreaseCurrentTemperature() {
        if (!this.isOn())
            return;
        if (this.getCurrentTemperature() - 1 <= this.minTemperature)
            return;
        this.setCurrentTemperature(this.currentTemperature - 1);
    }
}


