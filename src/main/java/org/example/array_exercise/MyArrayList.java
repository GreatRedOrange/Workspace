package main.java.org.example.array_exercise;

import java.util.Arrays;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (E) data[index];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Element 1");
        myArrayList.add("Element 2");
        myArrayList.add("Element 3");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
