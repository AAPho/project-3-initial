package com.example.iterable;

import java.util.*;

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
/*
    @Override
    public void forEach() {

    }
*/
    @Override
    public Iterator<T> iterator() {
        return this.bag.listIterator();
    }
}
