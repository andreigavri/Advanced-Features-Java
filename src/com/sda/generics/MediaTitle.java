package com.sda.generics;

public abstract class MediaTitle  {
    private String title;

    public MediaTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return
                "title='" + title;

    }
}
