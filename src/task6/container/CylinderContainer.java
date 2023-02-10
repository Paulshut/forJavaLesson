package task6.container;

public class CylinderContainer extends Container {
    private double cylinderVolume;
    private double weightWater;


    public CylinderContainer(boolean isBig,int densityType) {
        super(isBig, densityType);
        this.cylinderVolume = getVolume();
        this.weightWater = getWeightWater();
    }

    public double getWeightWater(){
        return cylinderVolume * densityType;
    }



    @Override
    public double getVolume() {
        return cylinderVolume = Math.round(Math.PI * Math.pow(getRadius(), 2) * getHigh());
    }
    @Override
    public String toString() {
        return "CylinderContainer{" +
                "cylinderVolume=" + cylinderVolume +
                '}';
    }
}