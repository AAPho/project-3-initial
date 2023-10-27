package com.example.iterable;

import java.util.Iterator;

public interface Iterable<T> {

    //void forEach();
    Iterator<T> iterator();

}
