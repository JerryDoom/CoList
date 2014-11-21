package com.jerry.colist;

import android.app.Application;
import android.graphics.drawable.Drawable;

/**
 * Created by jerry on 16/11/14.
 */
public class ListItem extends Application {

    //Variable
    private String coName = null;
    private String coDedicated = null;
    private Drawable coImage = null;

    //Setters & Getters
    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getCoDedicated() {
        return coDedicated;
    }

    public void setCoDedicated(String coDedicated) {
        this.coDedicated = coDedicated;
    }

    public Drawable getCoImage() {
        return coImage;
    }

    public void setCoImage(Drawable coImage) {
        this.coImage = coImage;
    }

}
