package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStationNumberTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(5);
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentStationNumberOverMaxStationTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(5);
        radio.setCurrentStationNumber(10);
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentStationNumberUnderMinStationTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(5);
        radio.setCurrentStationNumber(-1);
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void nextStationTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    void nextStationEqualMaxStationTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(9);
        radio.nextStation();
        assertEquals(radio.getMinStationNumber(), radio.getCurrentStationNumber());
    }

    @Test
    void prevStationTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStationNumber());
    }

    @Test
    void prevStationUnderMinStationTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void volumeUpTest() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void volumeUpOverMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void volumeDownTest() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void volumeDownUnderMinVolumeTest() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}