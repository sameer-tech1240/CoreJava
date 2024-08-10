package com.task;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserMain {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		// Sample users
		users.add(new User(1, "Sameer", "sameer@example.com", Timestamp.valueOf("2024-07-21 10:00:00")));
		users.add(new User(2, "Ayaz", "ayaz@example.com", Timestamp.valueOf("2024-07-22 11:00:00")));
		users.add(new User(3, "Aaadil Noor", "aadilnoor@example.com", Timestamp.valueOf("2024-07-14 09:30:00")));
		users.add(new User(4, "Khan", "khan@example.com", Timestamp.valueOf("2024-07-21 14:15:00")));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day (e.g., SUNDAY, MONDAY): ");
		String dayInput = scanner.next().toUpperCase();

		DayOfWeekEnum dayOfWeek = DayOfWeekEnum.fromString(dayInput);

		if (dayOfWeek != null) {
			List<User> dayUsers = users.stream().filter(user -> {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(user.getTime());
				return calendar.get(Calendar.DAY_OF_WEEK) == dayOfWeek.getCalendarDay();
			}).collect(Collectors.toList());

			if (dayUsers.isEmpty()) {
				System.out.println("No users logged in on " + dayInput + ".");
			} else {
				System.out.println("Users who logged in on " + dayInput + ":");
				dayUsers.forEach(user -> {
					System.out.println(user);
					List<Timestamp> loginTimes = users.stream().filter(u -> u.getName().equals(user.getName()))
							.map(User::getTime).collect(Collectors.toList());
					System.out.println("Login times for " + user.getName() + ": " + loginTimes);
				});
			}
		} else {
			System.out.println("Invalid day input.");
		}

		scanner.close();
	}
}