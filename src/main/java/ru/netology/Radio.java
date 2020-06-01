package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int maxStationNumber;
    private int minStationNumber;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > 9) {
            return;
        }

        if (currentStationNumber < 0) {
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
