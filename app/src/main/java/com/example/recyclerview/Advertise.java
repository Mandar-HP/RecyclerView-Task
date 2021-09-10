package com.example.recyclerview;

import java.io.Serializable;



public class Advertise implements Serializable {



    private int AdvImgView;
    private String AdTitle;


    public Advertise(int advImgView, String adTitle) {
        AdvImgView = advImgView;
        AdTitle = adTitle;
    }

    public int getAdvImgView() {
        return AdvImgView;
    }

    public void setAdvImgView(int advImgView) {
        AdvImgView = advImgView;
    }

    public String getAdTitle() {
        return AdTitle;
    }

    public void setAdTitle(String adTitle) {
        AdTitle = adTitle;
    }
}
