package task6.container;

import java.util.Random;

public abstract class Container {
    public static final int BIG_RADIUS = 10;
    public static final int SMALL_RADIUS = 5;
    public static final int SMALL_DENSITY_WATER = 1000;
    public static final int BIG_DENSITY_WATER = 2000;
    public int densityType;
    private int high;
    private int radius;
    public boolean isBig;

    public Container(boolean isBig, int densityType) {
        this.isBig = isBig;
        this.high = getHigh();
        this.radius = getRadius();
        if (densityType == SMALL_DENSITY_WATER) {
            this.densityType = densityType;
        } else if (densityType == BIG_DENSITY_WATER) {
            this.densityType = densityType;
        } else {
            System.out.println("Плотность может быть только 1000 или 2000");
        }

    }

    public int getHigh() {
        int min = 10;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        high = random.nextInt(diff + 1);
        return high = high + min;
    }

    public boolean getIsBig() {
        return isBig;
    }

    public int getRadius() {
        if (getIsBig()) {
            radius = BIG_RADIUS;
        } else {
            radius = SMALL_RADIUS;
        }
        return radius;
    }

    public abstract double getVolume();

    public abstract double getWeightWater();

}