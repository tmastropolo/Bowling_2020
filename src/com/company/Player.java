package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
    Integer playerNum;
    Integer Score[];
    Integer pins;

    public Integer[] getScore() {
        return Score;
    }

    public void setScore(Integer[] score) {
        int frame = 0;
        frame ++;
        int pins = 0;
        score[frame] = pins;
        Score = score;
    }

    public Integer getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(Integer playerNum) {
        this.playerNum = playerNum;

    }






}
