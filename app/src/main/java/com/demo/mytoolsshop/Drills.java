package com.demo.mytoolsshop;

import androidx.annotation.NonNull;

public class Drills {

    private String title;
    private String info;
    private int imageResourseId;

    public Drills(String title, String info, int imageResourse) {
        this.title = title;
        this.info = info;
        this.imageResourseId = imageResourse;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
