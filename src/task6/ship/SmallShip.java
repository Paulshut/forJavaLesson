package task6.ship;

import task6.deck.Deck;


public class SmallShip extends Ship {
    Deck[] decks = new Deck[1];


    @Override
    public void addDeck(Deck deck) {
        if (countDeck >= 1){
            System.out.println("Нельзя добавить больше палуб для " + nameShip);
        }else {
            decks[countDeck] = deck;
            countDeck++;
        }
    }

    public SmallShip(String nameShip) {
        super(nameShip);

    }

    public double getWeighWaterShips(){

        return allWaterShip = decks[0].getSumWaterOnDeck();
    }


}
