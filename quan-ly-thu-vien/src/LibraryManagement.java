import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LibraryManagement {
    private LinkedList<LibraryCard> libraryCards;

    public LibraryManagement() {
        libraryCards = new LinkedList<>();
    }

    public LinkedList<LibraryCard> getLibraryCards() {
        return libraryCards;
    }

    public void setLibraryCards(LinkedList<LibraryCard> libraryCards) {
        this.libraryCards = libraryCards;
    }

    public Student student(Scanner scanner) {
        System.out.println("Tên học viên");
        String name = scanner.nextLine();
        System.out.println("Nhập mã sinh viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập lớp");
        String studentClass = scanner.nextLine();

        return new Student(name, id, age, studentClass);
    }

    public void addLibraryCar(Scanner scanner, Student student) {
        System.out.println("Nhập tên phiếu mượn sách");
        String id = scanner.nextLine();
        System.out.println("Nhập id sách");
        String idBook = scanner.nextLine();
        System.out.println("Nhập ngày mượn yyyy-MM-dd");
        String date = scanner.nextLine();
        LocalDate ngayMuon = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        LibraryCard libraryCard = new LibraryCard(id, idBook, student, ngayMuon);
        libraryCards.add(libraryCard);
    }

    public void deleteLibraryCar(Scanner scanner) {
        System.out.println("Nhập tên phiếu mượn sách");
        String id = scanner.nextLine();
        LibraryCard delete = null;
        for (LibraryCard value : libraryCards) {
            if (value.getId().equals(id)) {
                delete = value;
                break;
            }
        }
        libraryCards.remove(delete);
    }

    public void displayLibraryCars() {
        for (LibraryCard value : libraryCards) {
            System.out.println(value);
        }
    }

}
