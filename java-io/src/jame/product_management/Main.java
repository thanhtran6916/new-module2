package jame.product_management;

import javafx.scene.transform.Scale;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String DATA_FILE = "E:\\CodeGym\\module_2\\tuan-2\\java-io\\src\\jame\\product_management\\data.txt";
    public static Scanner scanner = new Scanner(System.in);
    public static ProductManagement products = new ProductManagement();
    public static void main(String[] args) {
        int choose = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    Product newProduct = inputProduct();
                    products.add(newProduct);
                    break;
                case 2:
                    products.show();
                    break;
                case 3:
                    int idSearch = getId();
                    products.search(idSearch);
                    break;
                case 4:
                    saver(DATA_FILE, products);
                    break;
                case 5:
                    if (products == null) {
                        products = updateProduct(DATA_FILE);
                    } else {
                        ProductManagement updateProduct = updateProduct(DATA_FILE);
                        ArrayList<Product> products1 = updateProduct.getProducts();
                        for (Product product : products1) {
                            products.add(product);
                        }
                    }
                    break;
            }

        } while (choose != 0);
    }

    public static ProductManagement updateProduct(String dataFile) {
        ProductManagement products = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(dataFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (ProductManagement) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }


    public static void saver(String dataFile, ProductManagement products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dataFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getId() {
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        return id;
    }

    public static Product inputProduct() {
        System.out.println("Nhập id sản phẩm");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuât sản phẩm");
        String productionKhan = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int cost = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập mô tả khac của sản phẩm");
        String other = scanner.nextLine();
        return new Product(id, name, productionKhan, cost, other);
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm");
        System.out.println("4. Lưu");
        System.out.println("5. Cập nhập sản phẩm");
        System.out.println("0. Thoát");
    }
}
