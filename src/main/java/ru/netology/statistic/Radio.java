package ru.netology.statistic;

public class Radio {
    private String name;
    private int currentStation;
    private int lastStation = 10;
    private int firstStation = 0;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    private boolean on;

    public Radio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > lastStation) {
            return;
        }
        if (currentStation < firstStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int nextNumberStation() {
        if (currentStation < lastStation) {
            this.currentStation++;
        } else {
            this.currentStation = firstStation;
        }
        return this.currentStation;
    }

    public int prevNumberStation() {
        if (currentStation > firstStation) {
            this.currentStation--;
        } else {
            this.currentStation = lastStation;
        }
        return this.currentStation;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume++;
        }
        return this.currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume--;
        }
        return this.currentVolume;
    }
}