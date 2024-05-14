package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Main {
	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		al.add(new Student(21, "sameer", 8828456078l, "saki naka"));
		al.add(new Student(22, "aadil noor", 9517058289l, "saki naka"));
		al.add(new Student(23, "zaid", 8823879845l, "saki naka"));
		al.add(new Student(24, "shoaib", 8765437890l, "saki naka"));
		Collections.sort(al);

		for (Student stuudent : al) {
			System.out.println(stuudent.getId() + " " + stuudent.getName() + " " + stuudent.getNumber() + " "
					+ stuudent.getAddress());

		}

	}

}
