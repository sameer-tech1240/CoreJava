package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentException {
	public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
        	list.add(3 ,"sameer");
             System.out.println(iterator.next());
            
			
		}
        
      List<String> list2 = new CopyOnWriteArrayList<String>(list);
      Iterator<String> iterator1 =  list.iterator();
      while (iterator1.hasNext()) {
      	list2.add(3 ,"sameer");
           System.out.println(iterator1.next());
          
			
		}
      
	}
	

}
