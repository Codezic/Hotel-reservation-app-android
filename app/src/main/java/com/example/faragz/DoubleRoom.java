package com.example.faragz;

class DoubleRoom extends Room {
    double price;

    DoubleRoom(int roomNumber) {
        super();
        this.setroomNumber(roomNumber);
    }

    @Override
    public double getPrice(double price) {
        this.price = price;
        return this.price;
    }
    public String toString(){
        return  String.format("%d",this.getroomNumber());
    }
}