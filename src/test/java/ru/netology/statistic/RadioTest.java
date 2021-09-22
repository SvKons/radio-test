package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCountTheNumberOfStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getLastStation());
        radio.nextNumberStation();

        int expected = radio.getFirstStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationAgain() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getLastStation() + 2);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToTheNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getFirstStation());
        radio.nextNumberStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToTheNextStationAgain() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getFirstStation() +2);
        radio.nextNumberStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getFirstStation());
        radio.prevNumberStation();

        int expected = radio.getLastStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationAgain() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getFirstStation() - 3);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToThePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getLastStation());
        radio.prevNumberStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToThePrevStationAgain() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getLastStation() -6);
        radio.prevNumberStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.setCurrentStation(19);

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToTheNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume() + 7);
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToTheNextAgain() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(200);

        int expected = 100;
        int actual = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMaxAgain() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeUnderMinAgain() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume() -3);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToThePrev() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToThePrevAgain() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume() -6);
        radio.reduceVolume();

        int expected = 93;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
