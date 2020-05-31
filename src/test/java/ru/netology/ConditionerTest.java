package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void setCurrentTemperatureUnderMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.setCurrentTemperature(0);
        assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void setCurrentTemperatureOverMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(31);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureEqualMaxTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureUnderMinTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureEqualMinTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(1);
        conditioner.decreaseCurrentTemperature();
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(14, conditioner.getCurrentTemperature());
    }


}