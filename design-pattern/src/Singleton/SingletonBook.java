package Singleton;

public class SingletonBook {
    private String name;
    private String title;
    private static boolean status = false;
    private static SingletonBook singletonBook;
    private SingletonBook() {
        name = "sách 1";
        title = "code";
    }

    public static SingletonBook getBook() {
        if (singletonBook == null) {
            singletonBook = new SingletonBook();
            status = true;
            return singletonBook;
        }
        return null;
    }

    public void removeBook(SingletonBook singletonBook1) {
        status = false;
        singletonBook = null;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
