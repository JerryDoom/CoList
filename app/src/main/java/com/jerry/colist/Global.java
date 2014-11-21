package com.jerry.colist;

import java.util.ArrayList;

/**
 * Created by jerry on 18/11/14.
 */
public class Global {
    //Variables
    private static Global instance;
    private ArrayList <ListItem> arrayListItem = new ArrayList<ListItem>();

    public Global() {}

    public ArrayList<ListItem> getArrayListItem() {
        return arrayListItem;
    }

    public void setArrayListItem(ArrayList<ListItem> arrayListItem) {
        this.arrayListItem = arrayListItem;
    }

    //Get instance
    public static synchronized Global getInstance() {
        if (instance == null){
            instance = new Global();
        }
        return instance;
    }
}
