package controller;

public interface GeneralManagement<T> {
    void show();
    T search(String id);
    void add(T t);
    void edit(int index, T t);
    void remove(int index);
    void sort();
}
