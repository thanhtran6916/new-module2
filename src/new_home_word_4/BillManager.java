package new_home_word_4;

import java.util.Scanner;

public class BillManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PHẦN MỀM QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN");
        Bill[] bills = new Bill[0];

        int choose = -1;
        do {
            menu();
            System.out.println("Chọn chức năng");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    bills = getBills(scanner);
                    break;
                case 2:
                    displayBills(bills);
                    break;
                case 3:
                    calculateMoneyElectric(scanner, bills);
                    break;
                case 4:
                    bills = editElementBills(scanner, bills);
                    break;
                case 5:
                    bills = deleteElementBills(scanner, bills);
                    break;
            }


        } while (choose != 0);
    }

    private static Bill[] deleteElementBills(Scanner scanner, Bill[] bills) {
        System.out.println("Nhập vào mã số công tơ điện cần xóa");
        String idElectric = scanner.nextLine();
        if (hasBills(bills, idElectric)) {
            bills = deleteBillArr(bills, idElectric);
            System.out.println("Đã xóa");
        } else {
            System.out.println("Không tìm thấy mã số công tơ điện");
        }
        return bills;
    }

    private static Bill[] deleteBillArr(Bill[] bills, String idElectric) {
        Bill[] newBills = new Bill[bills.length -1];
        int index = 0;
        for (Bill value : bills) {
            if (idElectric.equals(value.getCustomer().getIdElectric())) {
                continue;
            }
            newBills[index] = value;
            index++;
        }
        return newBills;
    }

    private static Bill[] editElementBills(Scanner scanner, Bill[] bills) {
        System.out.println("Nhập vào mã số công tơ điện cần sửa");
        String idElectric = scanner.nextLine();
        if (hasBills(bills, idElectric)) {
            Bill newBill = getOneBill(scanner);
            bills = editBillArr(bills, idElectric, newBill);
        } else {
            System.out.println("Không tìm thấy mã số công tơ điện");
        }
        return bills;
    }

    private static Bill[] editBillArr(Bill[] bills, String idElectric, Bill newBill) {
        for (int i = 0; i < bills.length; i++) {
            if (idElectric.equals(bills[i].getCustomer().getIdElectric())) {
                bills[i] = newBill;
            }
        }
        return bills;
    }

    private static void calculateMoneyElectric(Scanner scanner, Bill[] bills) {
        System.out.println("Nhập vào mã số công tơ điện");
        String idElectric = scanner.nextLine();
        double result = 0;
        if (hasBills(bills, idElectric)) {
            for (int i = 0; i < bills.length; i++) {
                boolean equalsInputIdAndBillId = idElectric.equals(bills[i].getCustomer().getIdElectric());
                if (equalsInputIdAndBillId) {
                    result = bills[i].moneyElectricity();
                }
            }
            System.out.println("Tiền điện là: " + result);
        } else {
            System.out.println("Không tìm thấy mã số công tơ điện");
        }
    }

    private static boolean hasBills(Bill[] bills, String idElectric) {
        boolean flag = false;
        for (int i = 0; i < bills.length; i++) {
            if (idElectric.equals(bills[i].getCustomer().getIdElectric())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static void displayBills(Bill[] bills) {
        for (Bill value : bills) {
            System.out.println(value);
        }
    }

    private static Bill[] getBills(Scanner scanner) {
        System.out.println("Nhập vào thông tin cho n hộ sử dụng điện");
        int size = scanner.nextInt();
        scanner.nextLine();
        Bill[] bills = new Bill[size];

        for (int i = 0; i < size; i++) {
            System.out.println("HỘ GIA ĐÌNH " + (i + 1));
            System.out.print("Nhập tên chủ hộ ");
            String name = scanner.nextLine();
            System.out.print("Nhập địa chỉ hộ gia đình ");
            String address = scanner.nextLine();
            System.out.print("Nhập mã số công tơ điện ");
            String idElectric = scanner.nextLine();
            Customer customer = new Customer(name, address, idElectric);

            System.out.print("Nhập chỉ số công tơ điện cũ ");
            int oldIndexElectric = scanner.nextInt();
            System.out.print("Nhập vào chỉ số công tơ điện mới ");
            int newIndexElectric = scanner.nextInt();
            scanner.nextLine();
            Bill bill = new Bill(customer, oldIndexElectric, newIndexElectric);

            bills[i] = bill;
        }
        return bills;
    }

    private static Bill getOneBill(Scanner scanner) {
        System.out.println("Nhập vào thông tin hộ gia đình cần sửa");
        System.out.print("Nhập tên chủ hộ ");
        String name = scanner.nextLine();
        System.out.print("Nhập địa chỉ hộ gia đình ");
        String address = scanner.nextLine();
        System.out.print("Nhập mã số công tơ điện ");
        String idElectric = scanner.nextLine();
        Customer customer = new Customer(name, address, idElectric);

        System.out.print("Nhập chỉ số công tơ điện cũ ");
        int oldIndexElectric = scanner.nextInt();
        System.out.print("Nhập vào chỉ số công tơ điện mới ");
        int newIndexElectric = scanner.nextInt();
        scanner.nextLine();
        Bill newBill = new Bill(customer, oldIndexElectric, newIndexElectric);
        return newBill;
    }

    private static void menu() {
        System.out.println("1. Nhập hóa đơn");
        System.out.println("2. Hiển thị thông tin các hóa đơn");
        System.out.println("3. Tính tiền mỗi gia đình");
        System.out.println("4. Sửa thông tin");
        System.out.println("5. Xóa hóa đơn");
        System.out.println("0. Thoát");
    }
}
