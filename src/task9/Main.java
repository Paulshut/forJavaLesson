package task9;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(34);
        try {
            person.setNickName("Mynick");
        } catch (NickNameLengthOutException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(person.getAge());
        System.out.println(person.getNickName());
    }
}