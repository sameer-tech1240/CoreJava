package com.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserListMainWithoutJava8 {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User(1, "Sameer", LocalDate.now()));
		users.add(new User(2, "Assadullah", LocalDate.now().minusDays(1)));
		users.add(new User(3, "Aadil", LocalDate.now().minusDays(3)));
		users.add(new User(4, "Abrar", LocalDate.now()));
		users.add(new User(5, "Sufiyan", LocalDate.now().minusDays(2)));

		LocalDate now = LocalDate.now();
		List<User> newUsers = new ArrayList<>();
		for (User user : users) {
			if (user.getLocalDate().isEqual(now)) {
				newUsers.add(user);

			}

		}
		System.out.println(newUsers);

	}

}
