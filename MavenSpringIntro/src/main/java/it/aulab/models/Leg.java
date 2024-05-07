package it.aulab.models;

public class Leg {
    private Side side;

    public Leg(Side side) {
        this.side = side;
    }

    public void walkForward() {
        System.out.println("Mi sposto in avanti");
    }
    public void walkBackward() {
        System.out.println("Mi sposto indietro");
    }
}
