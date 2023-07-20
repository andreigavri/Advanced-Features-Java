package com.sda.generics;

public class Newspaper extends MediaTitle {
    private String editor;

    public String getEditor() {
        return editor;
    }

    public Newspaper(String editor, String title) {
        super(title);
        this.editor = editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "editor='" + editor  + " , " + super.toString() + " }";
    }
}
