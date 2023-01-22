package ls.task2;

public class First {
    //global variable

    byte bt1;
    short sh1;
    int in1;
    long lg1;
    float fl1;
    double dbl1;
    char ch1;
    boolean bl1;

    Byte byt1;
    Short shr1;
    Integer number1;
    Long lon1;
    Float flt1;
    Double db1;
    Character chart1;
    Boolean bool1;

    public static void main(String[] args) {
        //local variable

        byte bt2 = 2;
        short sh2 = 23;
        int in2 = 343;
        long lg2 = 3456L;
        float fl2 = 34.5F;
        double dbl2 = 3456.45;
        char ch2 = 6;
        boolean bl2 = true;

        byte bt3;
        short sh3;
        int in3;
        int num1;
        int num2;
        int num3;
        long lg3;
        float fl3;
        double dbl3;
        char ch3;
        boolean bl3;

        //Экспиремент с присвоением переменных с разным типом друг в друга
        System.out.println("Присвоение переменных с разными типом друг в друга:");

        sh3 = bt2;
        System.out.println("присвоение byte в shot =  " + sh3);

        in3 = sh2;
        System.out.println("присвоение shot в int = " + in3);

        lg3 = in2;
        System.out.println("присвоение int в long = " + lg3);

        num1 = ch2;
        System.out.println("присвоение char в int = " + num1);

        num2 = (int)dbl2;
        System.out.println("присвоение double в int = " + num2);

        num3 = (int)fl2;
        System.out.println("присвоение float в int = " + num3);

        dbl3 = fl2;
        System.out.println("присвоение float в double = " + dbl3 + "\n");




        // Определние и иницилизация оболочек а так же их вывод
        Byte bit8 = 8;
        Short shorty = 12;
        Integer numb = 2345;
        Long length = 123445050L;
        Float swimDot = 45.5F;
        Double lsDot = 45.67;
        Character character = '3';
        Boolean lying = false;

        //create object from class Second, initialization and output variables

        System.out.println("Определение и иницилизация переменных:");
        Second second = new Second();

        second.setBt((byte)(10));
        System.out.println(second.getBt());

        second.setSh((short)(12));
        System.out.println(second.getSh());

        second.setIn(1234);
        System.out.println(second.getIn());

        second.setCh((char)(88));
        System.out.println(second.getCh());

        second.setFl(3.14F);
        System.out.println(second.getFl());

        second.setDbl(12.222);
        System.out.println(second.getDbl());

        second.setLg(9223372036854775807L);
        System.out.println(second.getLg());

        second.setBl(false);
        System.out.println(second.isBl() + "\n");




        // create new class and initialization variable with wrapper

        System.out.println("Оболчки:");

        Second second2 = new Second();

        second2.setByt((byte)(23));
        System.out.println(second2.getByt());

        second2.setShr((short)(58));
        System.out.println(second2.getShr());

        second2.setNumber(2023);
        System.out.println(second2.getNumber());

        second2.setChart((char)(89));
        System.out.println(second2.getChart());

        second2.setLon(45585858L);
        System.out.println(second2.getLon());

        second2.setFlt(23.34F);
        System.out.println(second2.getFlt());

        second2.setDb(234.43);
        System.out.println(second2.getDb());

        second2.setBool(true);
        System.out.println(second2.getBool());
























    }
}
