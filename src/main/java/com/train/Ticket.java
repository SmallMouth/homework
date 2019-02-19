package com.train;

public class Ticket {
    int numTicket;
    int numRoundTrip;
    final int priceT = 1000;
    final int priceRT = 2000;
    final float discount = 0.9f;


    public Ticket(int numT, int numRT) {
        this.numTicket = numT;
        this.numRoundTrip = numRT;
    }

    public void printPrice() {
        System.out.println("Total tickets: " + numTicket);
        System.out.println("Round-trip: " + numRoundTrip);
        System.out.println("Total: " + getTotalPrice());
    }

    private float getTotalPrice() {
        return getTPrice() + getRTPrice();
    }

    private float getRTPrice() {
        return numRoundTrip * priceRT * discount;
    }

    private int getTPrice() {
        return (numTicket - numRoundTrip) * priceT;
    }
}
