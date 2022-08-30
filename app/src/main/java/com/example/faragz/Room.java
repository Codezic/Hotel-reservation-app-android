package com.example.faragz;

import java.lang.reflect.Array;
import java.util.Arrays;

abstract class Room {
    private int roomNumber;
    private boolean reserved;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room() {
    }

    public int getroomNumber() {
        return this.roomNumber;
    }

    public void setroomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean getreserved() { // check again
        return this.reserved;
    }

    public void setreserved(boolean reserved) {
        this.reserved = reserved;
    }

    public abstract double getPrice(double price);
}