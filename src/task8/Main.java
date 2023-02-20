package task8;


public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> numbers = new MyArrayList<>();
        MyArrayList<Integer> test = new MyArrayList<>();
        numbers.add(1);
        numbers.add(2);
        test.add(3);
        numbers.addAll(test);
        System.out.println(numbers);
    }
}