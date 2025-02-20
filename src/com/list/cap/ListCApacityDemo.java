package com.list.cap;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ListCApacityDemo {
	public static void main(String[] args) throws Exception {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");
		arrayList.add("Sameer");

		System.out.println("Size: " + arrayList.size());
		System.out.println("Capacity: " + getCapacity(arrayList));
	}

	public static int getCapacity(ArrayList<?> arrayList) throws Exception {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[]) field.get(arrayList);
		return elementData.length;
	}
}
