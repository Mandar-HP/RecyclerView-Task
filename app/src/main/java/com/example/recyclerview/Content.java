package com.example.recyclerview;

import java.io.Serializable;

public class Content implements Serializable {

    private String title, content;
    private int imgid;

    public Content(String title, String content, int imgid) {
        this.title = title;
        this.content = content;
        this.imgid = imgid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
