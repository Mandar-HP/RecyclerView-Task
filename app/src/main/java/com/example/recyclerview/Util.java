package com.example.recyclerview;

public class Util {


    private int PositionValue;


    public int getPositionValue() {
        return PositionValue;
    }

    public int setPositionValue(int positionValue) {
        PositionValue = positionValue;
        return positionValue;
    }




    public int POsition_Value_Method(int x){
        if (x%3 != 0) {
            return x;
        }
        return 0;
    }

}
