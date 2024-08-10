package com.array;

import java.util.ArrayList;
import java.util.List;

public class My {
    public List<Object> sone(List<Object> num) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = num.size()-1 ; i >= 0; i--) {
            arrayList.add(num.get(i));
        }
        return arrayList;
    }

    public static void main(String[] args) {
        My my = new My();
        List<Object> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(31);
        originalList.add(12);
        List<Object> reversedList = my.sone(originalList);
        System.out.println(reversedList);
    }
}
