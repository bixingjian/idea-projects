package com.company;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() { // 实现Iterable接口必须要实现的
        return new MyListIterator(this);
    }

    private class MyListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        public MyListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
