package com.ali.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DateTimeUtilsTest {

	DateTimeUtils dateTimeUtils = new DateTimeUtils();

	@Test
	void calculerDateNaissance_age_0() {
		// LocalDate refDate = LocalDate.of(2023, 1, 1);

		LocalDate dateNaissance = dateTimeUtils.calculerDateNaissance(0);

		assertEquals(LocalDate.now(), dateNaissance);
	}

	@Test
	void calculerDateNaissance_age_sup_0() {
		LocalDate dateNaissance = dateTimeUtils.calculerDateNaissance(10);

		assertEquals(LocalDate.now().minusYears(10), dateNaissance);
	}

	@Test
	void calculerDateNaissance_age_inf_0() {
		assertThrows(IllegalArgumentException.class, () -> dateTimeUtils.calculerDateNaissance(-10));
	}

}
