package com.company;

import java.awt.*;

public class Room {
    private Door door;
    private TV tv;
    private Table table;

    public Room(Door door, TV tv, Table table) {
        this.door = door;
        this.tv = tv;
        this.table = table;
    }

    public Door getDoor() {
        return door;
    }

    private TV getTv() {
        return tv;
    }

    private Table getTable() {
        return table;
    }

    public void turnOnTV(){
        tv.powerOn();
    }
}
