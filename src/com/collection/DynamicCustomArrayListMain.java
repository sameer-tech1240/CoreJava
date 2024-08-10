package com.collection;

public class DynamicCustomArrayListMain {
	public static void main(String[] args) {

		DynamicCustomArrayList list = new DynamicCustomArrayList();
		list.insert(10);
		list.insert("Sameer");
		list.insert(78);
		list.insert("Aadil");
		System.out.println(list.capacity());
		System.out.println(list.size());
		list.print();
		System.out.println(list.kyaKhaliHai());

	}

}
