package task6.deck;

import task6.container.Container;
import java.util.Arrays;

public class Deck {
    int count = 0;
    boolean checkContainerSize = true;
    public Container[] containers = new Container[4];
    private static final int MAX_COUNT_BIG = 2;
    private static final int MAX_COUNT_MIN = 4;
    public double sumWater;

    public Deck() {

    }

    @Override
    public String toString() {
        return "Deck{" +

                ", containers=" + Arrays.toString(containers) +
                '}';
    }

    public void tryPutContainer(Container container) {
        if (count < MAX_COUNT_BIG) {
            if (container.getIsBig() && checkContainerSize) {
                containers[count] = container;
                count++;
            }
        }
        if (count < MAX_COUNT_MIN) {
            if (container.getIsBig() == false) {
                containers[count] = container;
                checkContainerSize = false;
                count++;
            }
        }
    }

    public double getSumWaterOnDeck() {
        if (containers[0].isBig) {
            for (int i = 0; i < 2; i++) {
                sumWater += Math.round(containers[i].getWeightWater());
            }
        } else {
            for (int i = 0; i < containers.length; i++) {
                sumWater += Math.round(containers[i].getWeightWater());
            }
        }
        return sumWater;
    }

}




