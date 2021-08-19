import java.util.*;

public class ProductArrayListManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> arrayListProduct = new ArrayList<>();
        int choose = -1;
        do {
            displayMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    arrayListProduct.add(addProduct(scanner));
                    break;
                case 2:
                    System.out.println("Mời nhập ID sản phẩm");
                    int id = scanner.nextInt();
                    if (hasProduct(arrayListProduct, id)) {
                        for (Product product : arrayListProduct) {
                            if (product.getId() == id) {
                                arrayListProduct = editProduct(scanner, arrayListProduct, id);
                            }
                        }
                    } else {
                        System.out.println("Không tìm thấy sản phẩm");
                    }

                break;
                case 3:
                    System.out.println("Nhập ID");
                    int id2 = scanner.nextInt();
                    Iterator<Product> iterator = arrayListProduct.iterator();
                    while (iterator.hasNext()) {
                        Product productDelete = iterator.next();
                        if (productDelete.getId() == id2) {
                            iterator.remove();
                            break;
                        }
                    }


                    break;
                case 4:
                    for (Product product : arrayListProduct) {
                        System.out.println(product);
                    }
                    break;
                case 5:
                    System.out.println("Chọn kiểu sắp xếp");
                    System.out.println("1. Giá tiền tăng dần");
                    System.out.println("2. Giá tiền giảm dần");
                    int subChoose = scanner.nextInt();
                    switch (subChoose) {
                        case 1:
                            ComparatorProductCostIncrease increase = new ComparatorProductCostIncrease();
                            arrayListProduct.sort(increase);
                            break;
                        case 2:
                            ComparatorProductCostReduce reduce = new ComparatorProductCostReduce();
                            arrayListProduct.sort(reduce);
                            break;
                    }
                    break;
            }


        } while (choose != 0);


    }

    public static boolean hasProduct(List<Product> arrayListProduct, int id) {
        for (Product product : arrayListProduct) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Product> editProduct(Scanner scanner, ArrayList<Product> arrayListProduct, int id) {
        System.out.println("Mời bạn nhập thông tin về sản phẩm");
        System.out.println("Nhập ID");
        int newId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String newName = scanner.nextLine();
        System.out.println("Nhập giá");
        int newCost = scanner.nextInt();
        scanner.nextLine();
        for (Product product : arrayListProduct) {
            if (product.getId() == id) {
                product.setId(newId);
                product.setName(newName);
                product.setCost(newCost);
            }
        }
        return arrayListProduct;
    }


    public static Product addProduct(Scanner scanner) {
        System.out.println("Mời bạn nhập thông tin về sản phẩm");
        System.out.println("Nhập ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int cost = scanner.nextInt();
        scanner.nextLine();
        return new Product(id, name, cost);
    }

    public static void displayMenu() {
        System.out.println("MENU");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Sắp xếp sản phẩm tăng dần giảm dần theo giá");
        System.out.println("0. Thoát");
    }

}
