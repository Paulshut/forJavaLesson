package task3;

import java.util.Scanner;

public class Rainbow {
    final String RED = "Красный";
    final String ORANGE = "Оранжевый";
    final String YELLOW = "Желтый";
    final String GREEN = "Зеленый";
    final String LIGHT_BLUE = "Голубой";
    final String BlUE = "Синей";
    final String VIOLET = "Фиолетовый";
    final String HALF_RED = "Красно-";
    final String HALF_ORANGE = "Оранжево-";
    final String HALF_YELLOW = "Желто-";
    final String HALF_GREEN = "Зелено-";
    final String HALF_LIGHT_BLUE = "Голубо-";
    final String HALF_BLUE = "Сине-";
    final String HALF_VIOLET = "Фиолетово-";
    String result;
    String changeColor1;
    String changeColor2;


    //метод получения цвета по номеру
    public void getColor() {
        System.out.println("Введите номер цвета от 1 до 7");
        String attachment = "Вы выбрали: ";
        Scanner scanner = new Scanner(System.in);
        int numColor = scanner.nextInt();

        if (numColor == 1) {
            result = attachment + RED;
        } else if (numColor == 2) {
            result = attachment + ORANGE;
        } else if (numColor == 3) {
            result = attachment + YELLOW;
        } else if (numColor == 4) {
            result = attachment + GREEN;
        } else if (numColor == 5) {
            result = attachment + LIGHT_BLUE;
        } else if (numColor == 6) {
            result = attachment + BlUE;
        } else if (numColor == 7) {
            result = attachment + VIOLET;
        } else {
            System.out.println("Такого цвета нет");
        }
        System.out.println(result);
    }

    // метод получения полуцвета
    public void getSetColor() {
        int numColor1;
        int numColor2;
        System.out.println("Введите числа от 1 до 7, что бы получить полуцвет!!!");
        System.out.println("Выбирете первый цвет");
        Scanner inPutNum = new Scanner(System.in);
        numColor1 = inPutNum.nextInt();
        System.out.println("Выбирети второй цвет:");
        numColor2 = inPutNum.nextInt();

        if (numColor1 == 1) {
            changeColor1 = HALF_RED;
        } else if (numColor1 == 2) {
            changeColor1 = HALF_ORANGE;
        } else if (numColor1 == 3) {
            changeColor1 = HALF_YELLOW;
        } else if (numColor1 == 4) {
            changeColor1 = HALF_GREEN;
        } else if (numColor1 == 5) {
            changeColor1 = HALF_LIGHT_BLUE;
        } else if (numColor1 == 6) {
            changeColor1 = HALF_BLUE;
        } else if (numColor1 == 7) {
            changeColor1 = HALF_VIOLET;
        } else {
            System.out.println("Такого цвета нет!!!");
        }

        if (numColor2 == 1) {
            changeColor2 = RED;
        } else if (numColor2 == 2) {
            changeColor2 = ORANGE;
        } else if (numColor2 == 3) {
            changeColor2 = YELLOW;
        } else if (numColor2 == 4) {
            changeColor2 = GREEN;
        } else if (numColor2 == 5) {
            changeColor2 = LIGHT_BLUE;
        } else if (numColor2 == 6) {
            changeColor2 = BlUE;
        } else if (numColor2 == 7) {
            changeColor2 = VIOLET;
        } else {
            System.out.println("Такого цвета нет!!!");
        }
        System.out.println(changeColor1 + changeColor2);
    }

    // попытка создания метода вывода полуцветов с помощью switch
    public void getSetColorSwitch() {
        int cases;
        System.out.println("Для выбора номера полуцвета, введите две цифры от 1 до 7:");
        Scanner scan = new Scanner(System.in);
        cases = scan.nextInt();

        switch (cases) {
            case 12:
            case 21:
                System.out.println(HALF_RED + ORANGE);
                break;
            case 13:
            case 31:
                System.out.println(HALF_RED + YELLOW);
                break;
            case 14:
            case 41:
                System.out.println(HALF_RED + GREEN);
                break;
            case 15:
            case 51:
                System.out.println(HALF_RED + LIGHT_BLUE);
                break;
            case 16:
            case 61:
                System.out.println(HALF_RED + BlUE);
                break;
            case 17:
            case 71:
                System.out.println(HALF_RED + VIOLET);
                break;
            case 23:
            case 32:
                System.out.println(HALF_ORANGE + YELLOW);
                break;
            case 24:
            case 42:
                System.out.println(HALF_ORANGE + GREEN);
                break;
            case 25:
            case 52:
                System.out.println(HALF_ORANGE + LIGHT_BLUE);
                break;
            case 26:
            case 62:
                System.out.println(HALF_ORANGE + BlUE);
                break;
            case 27:
            case 72:
                System.out.println(HALF_ORANGE + VIOLET);
                break;
            case 34:
            case 43:
                System.out.println(HALF_YELLOW + GREEN);
                break;
            case 35:
            case 53:
                System.out.println(HALF_YELLOW + LIGHT_BLUE);
                break;
            case 36:
            case 63:
                System.out.println(HALF_YELLOW + BlUE);
                break;
            case 37:
            case 73:
                System.out.println(HALF_YELLOW + VIOLET);
                break;
            case 45:
            case 54:
                System.out.println(HALF_LIGHT_BLUE + GREEN);
                break;
            case 46:
            case 64:
                System.out.println(HALF_LIGHT_BLUE + BlUE);
                break;
            case 47:
            case 74:
                System.out.println(HALF_LIGHT_BLUE + VIOLET);
                break;
            case 56:
            case 65:
                System.out.println(HALF_BLUE + BlUE);
                break;
            case 67:
            case 76:
                System.out.println(HALF_BLUE + VIOLET);
                break;

            default:
                System.out.println("Не правильно выбран цвет");

        }


    }
}










