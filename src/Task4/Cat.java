package Task4;

import java.util.Random;

/**
 * Назанчение: Создание Котов, генерация случайного имени и возраста.
 *
 * @author Shutov Pavel
 * Task 4
 */

public class Cat {
    private int age = 0;
    private String name = "Default";

    //конструкторы
    public Cat( String nameCat, int ageCat) {
        this.name = getRandomName();
        this.age = getRandomAge();

        this.name = nameCat;  //определяют имя и возраст вручную
        this.age = ageCat;
    }

    public Cat() {
        //пустой конструктор
    }

    /* Метод создания случайного имени для кота */
    private String getRandomName() {
        int i = 1;
        char charRandom;
        Random random = new Random();
        name = String.valueOf((char) (random.nextInt(26) + 'A')); //первая буква Uppercase

        //получение отсальных букв имени
        while (i < 7) {
            charRandom = (char) (random.nextInt(26) + 'a');
            name = name + String.valueOf(charRandom);
            i++;
        }
        return name;
    }

    /* метод создания случайного возраста кота */
    private int getRandomAge() {
        int min = 1;
        int max = 28;
        int raz = max - min;
        Random random = new Random();

        age = random.nextInt(raz + 1) + min;
        return age;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // метод toString
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /* метод создание котов через while */
    public void createCatWhile() {
        int i = 0;

        while (i < 10) {
            Cat cat = new Cat();
            System.out.println(cat);
            i++;
        }

    }

    /* метод создание котов через цикл for */
    public void createCatFor() {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();

            cat.setName(cat.getRandomName());
            cat.setAge(cat.getRandomAge());
            cat.getName();
            cat.getAge();
            System.out.println(cat);
        }
    }

    /* метод создание котов через цикл doWhile */
    public void createCatDoWhile() {
        int i = 0;

        do {
            Cat cat = new Cat(getRandomName(), getRandomAge());
            System.out.println(cat);
            i++;
        } while (i < 10);
    }

    /* метод создание котов через цикл forEach */
    public void createCatForEach() {
        Cat[] cat = new Cat[5];

        for (Cat arrayCats : cat) {
            arrayCats = new Cat(getRandomName(), getRandomAge());
            System.out.println(arrayCats);
        }
    }
}