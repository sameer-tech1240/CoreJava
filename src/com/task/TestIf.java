package com.task;

import java.util.Arrays;
import java.util.List;

class Useer {
	private Integer id;
	private String name;

	List<Useer> list;

	public List<Useer> getList() {
		return list;
	}

	public void setList(List<Useer> list) {
		this.list = list;
	}

	public Useer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Useer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestIf {

	public static void main(String[] args) {

		List<Useer> name = Arrays.asList(new Useer(1, "aaasf"), new Useer(2, "rews"), new Useer(3, "yrtr"));
		if (!name.isEmpty()) {
			for (Useer useer : name) {
				if (useer.getId() != null) {
					for (Useer useer2 : useer.getList()) {
						if (useer2.getName() != null) {

						} else {

						}
					}

				}
			}
		}
	}

}
