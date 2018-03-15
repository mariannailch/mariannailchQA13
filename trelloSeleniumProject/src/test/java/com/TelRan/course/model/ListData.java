package com.TelRan.course.model;

import java.io.File;

public class ListData {
    private String name;
    private String newname;
    File photo;

    public File getPhoto() {
        return photo;
    }

    public ListData setPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListData setName(String name) {
        this.name = name;
        return this;
    }

    public String getNewname() {
        return newname;
    }

    public ListData setNewname(String newname) {
        this.newname = newname;
        return this;
    }
}
