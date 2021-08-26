package Interface;

public interface ManagementMethod<T> {
    void show();
    void add(T t);
    T search(String id);
    boolean delete(String id);
    boolean edit(String id, T t);
    void sort();
}
