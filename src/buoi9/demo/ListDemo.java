package buoi9.demo;

public interface ListDemo<T>{
    boolean add(T t);
    boolean remove(T t);
    boolean contains(T t);
    int size();
    T get(int index);
}
