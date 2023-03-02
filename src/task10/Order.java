package task10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Order {

    private List<Product> orderList = new ArrayList();
    private Date date;
    private UUID uuid;
    private int id = (int) (Math.random() * 100000);

    File orderFile = new File(String.join(File.separator, "resources", "orderFile.txt"));
    File test = new File(String.join(File.separator, "resources", "test.txt"));

    public Order() {
        this.uuid = uuid.randomUUID();
        this.date = new Date();
    }

    public List<Product> addProductToOrder() {
        boolean bool = true;
        while (bool) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя товара");
            Product product = new Product();
            product.setNameProduct(scanner.nextLine());
            orderList.add(product);
            System.out.println("1 - продолжить 0 - Назад");
            switch (scanner.nextInt()) {
                case 0:
                    bool = false;
                    break;
            }
        }
        return orderList;
    }

    public void showOrder() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(orderFile))) {
            String text = bufferedReader
                    .lines()
                    .collect(Collectors.joining(File.separator));
            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void writeOrder() {
        Order order = new Order();
        order.addProductToOrder();
        try (FileOutputStream fileOutputStream = new FileOutputStream(orderFile, true)) {
            fileOutputStream.write(order.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteOrder() {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(orderFile));
            Scanner scanner = new Scanner(System.in);
            String line;
            while ((line = reader.readLine()) != null) {
                if (scanner.nextInt() == getId())
                    builder.append(line);
            }
            FileWriter writer = new FileWriter(orderFile);
            writer.write(builder.toString());
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order:" +
                "  id =" + uuid +
                " = " + id +
                ", date =" + date +
                " Товары =" + orderList;
    }
}