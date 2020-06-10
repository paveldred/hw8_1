package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);


    @Test
    void setCurrentStationNumberTest() {
        radio.setMinStationNumber(0);
        radio.setCurrentStationNumber(5);
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentStationNumberOverMaxStationTest() {
        radio.setCurrentStationNumber(radio.getMaxStationNumber());
        assertEquals(radio.getMaxStationNumber(), radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentStationNumberUnderMinStationTest() {
        radio.setCurrentStationNumber(-1);
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void nextStationTest() {
        radio.nextStation();
        assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    void nextStationEqualMaxStationTest() {
        radio.setCurrentStationNumber(radio.getMaxStationNumber());
        radio.nextStation();
        assertEquals(radio.getMinStationNumber(), radio.getCurrentStationNumber());
    }

    @Test
    void prevStationTest() {
        radio.prevStation();
        assertEquals(4, radio.getCurrentStationNumber());
    }

    @Test
    void prevStationUnderMinStationTest() {
        radio.setCurrentStationNumber(radio.getMinStationNumber());
        radio.prevStation();
        assertEquals(radio.getMaxStationNumber(), radio.getCurrentStationNumber());
    }

    @Test
    void volumeUpTest() {
        radio.volumeUp();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void volumeUpOverMaxVolumeTest() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.volumeUp();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void volumeDownTest() {
        radio.volumeDown();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void volumeDownUnderMinVolumeTest() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}