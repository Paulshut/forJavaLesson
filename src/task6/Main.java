package task6;

import task6.container.ConeContainer;
import task6.container.CylinderContainer;
import task6.container.SquareContainer;
import task6.deck.Deck;
import task6.port.Port;
import task6.ship.BigShip;
import task6.ship.SmallShip;

public class Main {
    public static void main(String[] args) {
        SquareContainer squareContainer = new SquareContainer(false, 1000);
        ConeContainer coneContainer = new ConeContainer(false, 1000);
        CylinderContainer cylinderContainer = new CylinderContainer(false, 2000);
        SquareContainer squareContainer1 = new SquareContainer(false, 2000);
        SquareContainer squareContainer2 = new SquareContainer(true, 1000);
        ConeContainer coneContainer1 = new ConeContainer(true, 1000);
        SquareContainer squareContainer3 = new SquareContainer(true, 2000);
        CylinderContainer cylinderContainer1 = new CylinderContainer(true, 1000);

        Deck deck = new Deck();
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        deck.tryPutContainer(squareContainer);
        deck.tryPutContainer(coneContainer);
        deck.tryPutContainer(cylinderContainer);
        deck.tryPutContainer(squareContainer1);

        deck1.tryPutContainer(squareContainer2);
        deck1.tryPutContainer(coneContainer);

        deck2.tryPutContainer(coneContainer1);
        deck2.tryPutContainer(squareContainer3);


        BigShip bigShip = new BigShip("Аврора");
        SmallShip smallShip = new SmallShip("Титан");

        bigShip.addDeck(deck2);
        bigShip.addDeck(deck1);

        smallShip.addDeck(deck);

        Port port = new Port();

        port.addShip(smallShip);
        port.addShip(bigShip);

        System.out.println(port.getAllWeightWaterPort());


    }

}





















