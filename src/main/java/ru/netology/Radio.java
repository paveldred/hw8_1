package ru.netology;

public class Radio {
    private int currentStationNumber = 5;
    private int maxStationNumber = 10;
    private int minStationNumber = 0;
    private int currentVolume = 50;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            return;
        }

        if (currentStationNumber < minStationNumber) {
            return;
        }

        this.currentStationNumber = currentStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void nextStation() {
        if (currentStationNumber == maxStationNumber) {
            this.currentStationNumber = minStationNumber;
            return;
        }

        else {
            this.currentStationNumber++;
        }
    }

    public void prevStation() {
        if (currentStationNumber == minStationNumber) {
            this.currentStationNumber = maxStationNumber;
            return;
        }

        else {
            this.currentStationNumber--;
        }
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }

        else {
            this.currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }

        else {
            this.currentVolume--;
        }
    }
}
