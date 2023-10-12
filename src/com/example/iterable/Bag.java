package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T>, Iterable<T>{

    private List<T> bag;
    public Bag(){
        this.bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    @Override
    public int size() {
        return this.bag.size();
    }

    @Override
    public void add(T item) {
        this.bag.add(item);
    }

    @Override
    public void forEach(Object o) {
        this.bag.indexOf(o);
    }

    @Override
    public Iterator<T> iterator() {
        return this.bag.listIterator();
    }
}
