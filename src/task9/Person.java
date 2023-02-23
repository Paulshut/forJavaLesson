package task9;

public class Person {
    private int age;
    private String nickName;

    public void setAge(int age) {
        try {
            if (age <= 0) {
                throw new MinAgeOutException("Введен слишком маленький возраст");
            } else if (age >= 100) {
                throw new MaxAgeOutException("Введен слишком большой возраст");
            } else
                this.age = age;
        } catch (MinAgeOutException e) {
            System.err.println(e.getMessage());

        } catch (MaxAgeOutException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Работа программы завершина");
        }
    }

    public void setNickName(String nickName) throws NickNameLengthOutException {
        int lengthName = nickName.length();
        if (lengthName <= 5 || lengthName > 10) {
            throw new NickNameLengthOutException("Некорректное число символов в имени");
        } else
            this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public String getNickName() {
        return nickName;
    }

}