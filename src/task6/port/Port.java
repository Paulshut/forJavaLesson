package task6.port;

import task6.ship.BigShip;
import task6.ship.Ship;

public class Port {
    int countShip = 0;
    private String name;
    public Ship[] ships = new Ship[10];
    public double allWater;

    public void addShip(Ship ship) {
        if (countShip >= 10) {
            System.out.println("В порту нету места");
        } else {
            ships[countShip] = ship;
            countShip++;
        }
    }

    public void deleteShip(String name) {
        if (countShip <= 0) {
            System.out.println("Ошибка кораблей нет");
        } else {
            for (int i = 0; i < ships.length; i++) {
                if (ships[i].getNameShip() == name) {
                    System.out.println("Корабль " + ships[i].getNameShip() + " удален");
                    ships[i] = null;
                }
            }
        }
    }

    public double getAllWeightWaterPort() {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] != null) {
                allWater += ships[i].getWeighWaterShips();
            }

        }
        return allWater;
    }
}