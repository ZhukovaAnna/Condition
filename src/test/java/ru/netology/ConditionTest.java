package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {


    @Test
    public void shouldGetAndSetName() {

        Condition condition = new Condition();
        String expected = "Кондишн";
        assertNull(condition.getName());
        condition.setName(expected);
        assertEquals(expected, condition.getName());
    }

    @Test
    public void shouldGetAndSetOn() {
        Condition condition = new Condition();
        boolean expected = true;
        condition.setOn(expected);
        assertEquals(expected, condition.isOn());
    }

    @Test
    public void shouldGetAndSetCurrentT() {
        Condition condition = new Condition();
        condition.setMaxTemperature(40);
        condition.setMinTemperature(10);
        int expected = 20;
        condition.setCurrentTemperature(expected);
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @Test
    public void shouldGetAndSetMinTemperature() {
        Condition condition = new Condition();
        int expected = 10;
        condition.setMinTemperature(expected);
        assertEquals(expected, condition.getMinTemperature());
    }

    @Test
    public void shouldGetAndSetMaxTemperature() {
        Condition condition = new Condition();
        int expected = 40;
        condition.setMaxTemperature(expected);
        assertEquals(expected, condition.getMaxTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setOn(true);
        condition.setMaxTemperature(40);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(20);
        int expected = 21;
        condition.increaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setOn(true);
        condition.setMaxTemperature(40);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(20);
        int expected = 19;
        condition.decreaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @Test
    public void shouldCheckMaxTemperature() {
        Condition condition = new Condition();
        condition.setOn(true);
        condition.setMaxTemperature(40);
        condition.setCurrentTemperature(20);
        int expected = 21;
        condition.increaseCurrentTemperature();
        ;
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @Test
    public void shouldCheckMinTemperature() {
        Condition condition = new Condition();
        condition.setOn(true);
        condition.setMinTemperature(10);
        condition.setMaxTemperature(40);
        condition.setCurrentTemperature(10);
        int expected = 10;
        condition.decreaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(40);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(10);
        condition.decreaseCurrentTemperature();
        assertEquals(10, condition.getCurrentTemperature());
    }

    @Test
    public void shouldNotMaxTemperature() {
        Condition condition = new Condition();
        condition.setOn(true);
        int expected = 40;
        condition.setMaxTemperature(expected);
        condition.setCurrentTemperature(expected);
        condition.increaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @Test
    public void shouldNotIncreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(40);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(10);
        condition.increaseCurrentTemperature();
        assertEquals(10, condition.getCurrentTemperature());
    }

    @Test
    public void shouldNotMinTemperature() {
        Condition condition = new Condition();
        condition.setOn(true);
        int expected = 10;
        condition.setMaxTemperature(40);
        condition.setMinTemperature(expected);
        condition.setCurrentTemperature(expected);
        condition.decreaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }
}
