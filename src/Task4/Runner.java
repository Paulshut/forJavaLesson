package Task4;

public class Runner {
    public static void main(String[] args) {

        Cat cat = new Cat("Snow",23);
        System.out.println(cat + "\n");

        cat.createCatWhile();
        System.out.println();

        cat.createCatFor();
        System.out.println();

        cat.createCatDoWhile();
        System.out.println();

        cat.createCatForEach();
    }
}