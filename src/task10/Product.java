package task10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Scanner;


public class Product {

    String nameProduct;
    private Date date;
    int id;

    File productFile = new File(String.join(File.separator, "resources", "productFile.txt"));
    File test1 = new File(String.join(File.separator, "resources", "test1.txt"));


    public Product() {
        this.id = (int) (Math.random() * 100000) ;
        this.nameProduct = getNameProduct();
        this.date = new Date();

    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void addProduct() {
        Product product = new Product();
        Scanner add = new Scanner(System.in);
        System.out.println("Введите название товара");
        product.setNameProduct(add.nextLine());
        try (FileOutputStream outputStream = new FileOutputStream(productFile, true)) {
            outputStream.write(product.toString().getBytes(StandardCharsets.UTF_8));
            outputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void showProduct() {
        try (InputStream fileInputStream = new FileInputStream(productFile)) {
            byte[] bytes = new byte[fileInputStream.available()];
            int count = 0;
            byte currentByte;
            while ((currentByte = (byte) fileInputStream.read()) != -1) {
                bytes[count++] = currentByte;
            }
            String text = new String(bytes);
            System.out.println(text);

        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void deleteProduct(){
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(productFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(test1));
            Scanner scanner = new Scanner(System.in);
            String line;
            String search = scanner.nextLine();
            while ((line = reader.readLine()) != null) {
                if ((line.regionMatches(13,search,18,5))){
                    System.out.println("Товар удален");
                }else
                    writer.write(line);
                    writer.newLine();
            }
            reader.close();
            writer.close();
            productFile.delete();
            test1.renameTo(productFile);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    @Override
    public String toString() {
        return " Product{" +
                ", id=" + id +
                " nameProduct='" + nameProduct + '\'' +
                ", date=" + date +
                '}';
    }
}