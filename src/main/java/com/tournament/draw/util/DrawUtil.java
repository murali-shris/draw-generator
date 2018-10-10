package com.tournament.draw.util;

public class DrawUtil {

    public int getDrawSize(int numberOfPlayers) {
        int count = 2;
        while(count < numberOfPlayers) {
            count = count * 2;
        }
        return count;
    }
}
