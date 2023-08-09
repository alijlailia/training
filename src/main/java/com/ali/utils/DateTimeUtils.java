package com.ali.utils;

import java.time.LocalDate;

public class DateTimeUtils {

	public static LocalDate calculerDateNaissance(int age) {
		if (age < 0) {
			throw new IllegalArgumentException(" l'age doit etre posif");
		}
		return LocalDate.now().minusYears(age);
	}

}
