package task6.container;

public class ConeContainer extends Container {
    private double coneVolume;
    private double weightWater;

    public ConeContainer(boolean isBig, int densityType) {
        super(isBig, densityType);
        this.coneVolume = getVolume();
        this.weightWater = getWeightWater();
    }

    @Override
    public double getVolume() {
        return coneVolume = Math.round((1.0 / 3.0) * (Math.PI * Math.pow(getRadius(), 2) * getHigh()));

    }

    public double getWeightWater() {
        return coneVolume * densityType;

    }


    @Override
    public String toString() {
        return "ConeContainer{" +
                "coneVolume=" + coneVolume +
                ", isBig=" + isBig +
                '}';
    }

}