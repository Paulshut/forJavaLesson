package task5;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Назанчение: Создание матрицы и работа с ее диагоналями.
 *
 * @author Shutov Pavel
 * Task 5
 */

public class Matrix {
    private String[][] matrix = new String[10][10];
    private String[] basicDiagonal = new String[10];
    private String[] secondlyDiagonal = new String[10];
    private String[] unitedArray = new String[20];

    public void start() {
        createMatrix();         // Создает матрицу со случайными значениями
        getBasicDiagonal();     // Получить прямую диагональ
        getSecondaryDiagonal(); // Получить побочную диагональ
        createUnitedArray();    // Создать новый массив с диагоналями
        showStringResult();     // Вывести на экран массив строк
        parseDouble();          // Извлечить чилсл из массива и их округление
        showNumberResult();     // Вывести на экран массив чисел
        showMatrix();           // Показать матрицу
    }

    private void createMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (((j + 1) % 3 == 0)) {
                    matrix[i][j] = generateRandomDouble();
                } else {
                    matrix[i][j] = generateRandomString();
                }
            }
        }
    }

    private void getBasicDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == i) {
                    basicDiagonal[i] = matrix[i][j];
                }
            }
        }
    }

    private void getSecondaryDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j + i == matrix.length - 1)
                    secondlyDiagonal[i] = matrix[i][j];
            }
        }
    }

    private void createUnitedArray() {
        for (int i = 0; i < unitedArray.length; i++) {
            if (i < 10) {
                unitedArray[i] = basicDiagonal[i];
            } else {
                unitedArray[i] = secondlyDiagonal[i - 10];
            }
        }
    }

    private String[] getOnlyNumbers() {
        String[] onlyNumArray = new String[6];
        int j = 0;
        Pattern pattern = Pattern.compile("^[0-9]*[.,][0-9]+$");
        for (int i = 0; i < unitedArray.length; i++) {
            Matcher matcher = pattern.matcher(unitedArray[i]);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                onlyNumArray[j] = unitedArray[i].substring(start, end);
                j++;
            }
        }
        return onlyNumArray;
    }

    private int[] parseDouble() {
        Double[] doubleArray = new Double[6];
        int[] arrayResult = new int[6];
        for (int i = 0; i < getOnlyNumbers().length; i++) {
            doubleArray[i] = Double.parseDouble(getOnlyNumbers()[i]);
            if (doubleArray[i] > 1.7) {
                arrayResult[i] = (int) Math.ceil(doubleArray[i]);
            } else {
                arrayResult[i] = (int) Math.floor(doubleArray[i]);
            }
        }
        return arrayResult;
    }

    private String[] getOnlyString() {
        String[] arrString = new String[14];
        int j = 0;
        Pattern pattern = Pattern.compile("[a-z]{7}");
        for (int i = 0; i < unitedArray.length; i++) {
            Matcher matcher = pattern.matcher(unitedArray[i]);
            while (matcher.find()) {
                arrString[j] = (unitedArray[i].substring(2, 5));
                j++;
            }
        }
        return arrString;
    }

    private void showNumberResult() {
        int i = 0;
        for (int result : parseDouble()) {
            System.out.print(result);
            if (i < parseDouble().length - 1) {
                System.out.print("_");
                i++;
            }
        }
    }

    private void showStringResult() {
        String join = Arrays.toString(getOnlyString());
        StringBuilder stringBuilder = new StringBuilder(join);
        System.out.println(stringBuilder);
    }


    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
        }
    }

    private void compareArrays() {
        basicDiagonal.equals(secondlyDiagonal);
    }

    private String generateRandomDouble() {
        return String.valueOf(Math.random() * 10).substring(0, 7);
    }

    private String generateRandomString() {
        int l = 1;
        char ch;
        String randomString;
        Random random = new Random();
        randomString = String.valueOf((char) (random.nextInt(26) + 'a'));
        while (l < 7) {
            ch = (char) (random.nextInt(26) + 'a');
            randomString = randomString + String.valueOf(ch);
            l++;
        }
        return randomString;
    }
}