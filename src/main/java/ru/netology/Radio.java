package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
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
