package com.cantrolstatement;
 
public class AutoBoxing {
	public static void main(String[] args) {
		/*
		 * Integer y=new Integer(10); int y1=y; System.out.println(y);
		 * System.out.println(y1); char v = 'T'; Character v1 = v;
		 * System.out.println(v); System.out.println(v1);
		 */
		int row=4;
		int num=1;
		for (int i = 1; i <=row; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
				System.out.print(" ");
			} 
			
			System.out.println();
			
		}
		
	}

}
