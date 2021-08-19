import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quản lý thư viện");
        LibraryManagement management = new LibraryManagement();
        int choose = -1;
        do {
            System.out.println("Chọn công cụ");
            displayMenu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    Student student = management.student(scanner);
                    management.addLibraryCar(scanner, student);
                    break;
                case 2:
                    management.displayLibraryCars();
                    break;
                case 3:
                    management.deleteLibraryCar(scanner);
                    break;
            }

        } while (choose != 0);


    }

    public static void displayMenu() {
        System.out.println("1. Nhập phiếu mượn sách");
        System.out.println("2. Hiển thị danh sách sinh viên đã mượn sách");
        System.out.println("3. Xóa phiếu");
        System.out.println("0. Thoát");
    }

}
