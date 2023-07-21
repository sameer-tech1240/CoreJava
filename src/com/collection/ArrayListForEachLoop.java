package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListForEachLoop {
public static void main(String[] args) {
	/*CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
	al.add("sameer");
	al.add("aadil");*/
	//al.add("khan");
        ArrayListForEachLoop a=new ArrayListForEachLoop();
        int i=a.hashCode();
        System.out.println(a);
        System.out.println(i);
        String s=Integer.toHexString(i);
        System.out.println(s);
        
	
	/*
	 ListIterator<String> i=al.listIterator();
	 while (i.hasNext()) {
		         al.remove(1);
	       System.out.println(i.next());
	        */
	
		
	}
}

