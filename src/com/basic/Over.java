package com.basic;

public class Over 
{
      public int show(Object obj)
      {
    	  return 0;
      }
      public int show(String str)
      {
      	  return 1;
      }
       
      public static void main(String[] args) {
		
    	  Over over = new Over();
    	System.out.println(over.show(null));
	}
}
