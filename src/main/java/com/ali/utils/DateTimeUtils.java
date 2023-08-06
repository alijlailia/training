package com.ali.utils;

import java.time.LocalDate;

public class DateTimeUtils {

	public static LocalDate calculerDateNaissance(int age) {

		return LocalDate.now().minusYears(age);
	}

}
