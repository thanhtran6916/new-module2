package jame.product_management;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductManagement implements Serializable {
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public void show() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private int searchIndexProduct(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void search(int id) {
        int index = searchIndexProduct(id);
        if (index == -1) {
            System.out.println("Không có");
        } else {
            System.out.println(products.get(index));
        }
    }
}
