package Singleton;

public class Persion {
    private SingletonBook singletonBook;

    public boolean muonSach() {
        singletonBook = SingletonBook.getBook();
        if (singletonBook != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getNameBook() {
        if (singletonBook != null) {
            return singletonBook.getName();
        } else {
            return "Không mượn được sách";
        }
    }

    public void removeBook() {
        singletonBook.removeBook(singletonBook);
    }

}
