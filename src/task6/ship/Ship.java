package task6.ship;

import task6.deck.Deck;

public abstract class Ship {
    protected String nameShip;
    protected int countDeck;
    public double allWaterShip;

    public Ship(String nameShip) {
        this.nameShip = nameShip;
    }

    public String getNameShip(){
        return nameShip;
    }

    public abstract void addDeck(Deck deck);

    public abstract double getWeighWaterShips();




}


