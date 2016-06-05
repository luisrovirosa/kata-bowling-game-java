package com.luisrovirosa.katas.bowling;

public class Strike extends Turn {

    public Strike(Roll roll) {
        super(roll);
    }

    @Override
    public boolean isStrike() {
        return true;
    }
}