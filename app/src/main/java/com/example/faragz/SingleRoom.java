package com.example.faragz;

class SingleRoom extends Room {
    double price;

    SingleRoom(int roomNumber) {
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
