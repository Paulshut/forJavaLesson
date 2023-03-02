package task10;

import java.util.Scanner;

public class Menu {
    Product product = new Product();
    Order order = new Order();
    Scanner scanner = new Scanner(System.in);

    public void startMenu() {
        System.out.println("Добро пожаловать" + "\n 1 - Работа с товаром" +
                "\n 2 - Работа с заказом" + "\n 0 - Выйти из программы");
        int step = scanner.nextInt();
        if (step == 1) {
            productMenu();
        } else if (step == 2) {
            orderMenu();
        } else if (step == 0) {
            System.out.println("До свидания");
            System.exit(0);
        }
    }

    public void productMenu() {
        boolean cheak = true;
        while (cheak) {
            System.out.println("\n 1 - Добавить товар" + "\n 2 - Посмотреть список товаров" +
                    "\n 3 - Удалить товар" + "\n 4 - Назад" + " \n 0 - Для выхода из программы");
            int inputNum = scanner.nextInt();
            switch (inputNum) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.showProduct();
                    break;
                case 3:
                    product.deleteProduct();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    cheak = false;
                    //  System.exit(0);
                    break;
                case 4:
                    startMenu();
                    break;
                default:
                    System.out.println("Такого действия нет, попробуйте еще раз");
            }
        }
    }

    public void orderMenu() {
        boolean bool = true;
        while (bool) {
            System.out.println(" 1 - добавить товар в заказ" + "\n 2 - посмотреть заказ"
                    + "\n 3 - удалить товар из заказа" + "\n 4 - назад" + " \n 0 - Для выхода из программы");
            switch (scanner.nextInt()) {
                case 1:
                    order.writeOrder();
                    break;
                case 2:
                    order.showOrder();
                    break;
                case 3:
                    order.deleteOrder();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    bool = false;
                    //  System.exit(0);
                    break;
                case 4:
                    startMenu();
                    break;
                default:
                    System.out.println("Такого действия нет, попробуйте еще раз");
            }
        }
    }
}