package wiew;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do {
            menu();
            System.out.println("Nhập lựa chọn");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    MainStudentManagement.run();
                    break;
                case 2:
                    MainClassManagement.run();
                    break;
            }
        } while (choose != 0);



    }

    public static void menu() {
        System.out.println("1. Quản lý sinh viên");
        System.out.println("2. Quản lý lớp học");
        System.out.println("0. Thoát");
    }
}
