package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldIncreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 21;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        int expected = 19;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentMaxTemperature() {
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentMinTemperature() {
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}