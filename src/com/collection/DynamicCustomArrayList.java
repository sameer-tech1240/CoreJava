package com.collection;
public class DynamicCustomArrayList {
	private Object array[];
	private int count;
	public DynamicCustomArrayList(int capacity) {
			 array =new Object[capacity];
			 count =0;	 
		 }
	public DynamicCustomArrayList() {
			   this(10);
		   }
	public void insert(Object element) {
		if (count == array.length) {
			Object[] newArry = new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				newArry[i] = array[i];
			}
			array = newArry;
		}
		array[count] = element;
		count++;
	}
	int size() {
		return count;
	}

	int capacity() {
		return array.length;
	}
	public Object get(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("invalid index");
		}
		return array[index];
	}
	public void set(int index, Object elements) {
		if (index < 0 || index >= count) {
			throw new ArrayIndexOutOfBoundsException("invalid index");

		}
		array[index] = elements;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			Object object = (Object) array[i];

			System.out.println(object);
		}
		System.out.println();
	}

	public boolean kyaKhaliHai() {
		return count == 0;

	}

}
