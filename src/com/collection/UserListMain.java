package com.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserListMain {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		StringBuilder message = new StringBuilder();

		users.add(new User(1, "Sameer", LocalDate.now()));//24
		users.add(new User(2, "Assadullah", LocalDate.now().minusDays(1)));//23
		users.add(new User(3, "Aadil", LocalDate.now().minusDays(3)));//21
		users.add(new User(4, "Abrar", LocalDate.now()));//24
		users.add(new User(5, "Sufiyan", LocalDate.now().minusDays(2)));	//22
		users.add(new User(6, "naaz", LocalDate.now().plusDays(1)));

		LocalDate now = LocalDate.now();
		List<User> collect = users.stream().filter(user -> user.getLocalDate().isBefore(now))
				.collect(Collectors.toList());
		System.out.println("Users Login Before today : " + collect);

		LocalDate names = LocalDate.now();
		List<User> name = users.stream().filter(userName -> userName.getLocalDate().isEqual(names))
				.collect(Collectors.toList());
		System.out.println("Users Login Today : " + name);

		message.append("Today login username: ");
		for (User user2 : name) {
			// System.out.println(user2.getName());
			message.append(user2.getName());
			message.append(" and ");

		}
		System.out.println(message.toString());

	}

}
