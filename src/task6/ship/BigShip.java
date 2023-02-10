package task6.ship;

import task6.deck.Deck;

import java.util.Arrays;

public class BigShip extends Ship {
    Deck[] decks = new Deck[2];

    public BigShip(String nameShip) {
        super(nameShip);

    }

    @Override
    public String toString() {
        return "BigShip{" +
                "decks=" + Arrays.toString(decks) +
                ", count=" + countDeck +
                ", nameShip='" + nameShip + '\'' +
                '}';
    }

    public void addDeck(Deck deck) {
        if (countDeck >= 2) {
            System.out.println("Нельзя добавить больше палуб " + nameShip);
        } else {
            decks[countDeck] = deck;
            countDeck++;
        }


    }

    public double getWeighWaterShips() {
        return allWaterShip = decks[0].getSumWaterOnDeck() + decks[1].getSumWaterOnDeck();
    }
}
