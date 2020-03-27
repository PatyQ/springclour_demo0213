package iotest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        getIterator();
    }

    private static void getIterator(){
        Collection<String> list = new ArrayList();
        list.add("小明1");
        list.add("小明2");
        list.add("小明3");
        list.add("小明4");
        list.add("小明5");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
