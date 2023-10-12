package com.example.iterable;

import java.util.Iterator;

public interface Iterable<T> {

    void forEach(Object o);
    Iterator<T> iterator();

}
