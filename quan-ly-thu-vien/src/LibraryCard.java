import java.time.LocalDate;

public class LibraryCard {
    public static final int WEEKS_TO_ADD = 2;
    private String id;
    private String bookId;
    private Student student;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public LibraryCard() {
    }

    public LibraryCard(String id, String bookId, Student student, LocalDate ngayMuon) {
        this.id = id;
        this.bookId = bookId;
        this.student = student;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayMuon.plusWeeks(WEEKS_TO_ADD);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "id='" + id + '\'' +
                ", bookId='" + bookId + '\'' +
                ", student=" + student +
                ", ngayMuon=" + ngayMuon +
                ", ngayTra=" + ngayTra +
                '}';
    }
}
