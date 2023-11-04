package com.room;

class One{
	int i =1;
	public int getint() {
		return i;
	}
}
public class ClassCastException_Exp extends One{
	int i =2;
	public int getint() {
		return i;
	}
	public static void main(String[] args) {
		One one = new One();
		ClassCastException_Exp c = (ClassCastException_Exp) one;
		System.out.println(c.getint());
		
	}

}
