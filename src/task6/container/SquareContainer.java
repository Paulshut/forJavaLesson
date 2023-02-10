package task6.container;

public class SquareContainer extends Container {
    public double squareVolume;
    private double weightWater;

    public SquareContainer(boolean isBig, int densityType) {
        super(isBig, densityType);
        this.squareVolume = getVolume();
        this.weightWater = getWeightWater();

    }

    @Override
    public double getVolume() {
        return squareVolume = Math.pow(getRadius(), 2) * getHigh();
    }

    public double getWeightWater() {
        return squareVolume * densityType;
    }

    @Override
    public String toString() {
        return "SquareContainer{" +
                "isBig=" + isBig +
                ", squareVolume=" + squareVolume +
                '}';
    }
}

