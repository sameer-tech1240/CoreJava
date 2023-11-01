package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Main {
	public static void main(String[] args) {
		List<Stuudent> al = new ArrayList<>();
		al.add(new Stuudent(21, "sameer", 8828456078l, "saki naka"));
		al.add(new Stuudent(22, "aadil noor", 9517058289l, "saki naka"));
		al.add(new Stuudent(23, "zaid", 8823879845l, "saki naka"));
		al.add(new Stuudent(24, "shoaib", 8765437890l, "saki naka"));
		Collections.sort(al);

		for (Stuudent stuudent : al) {
			System.out.println(stuudent.getId() + " " + stuudent.getName() + " " + stuudent.getNumber() + " "
					+ stuudent.getAddress());

		}

	}

}
