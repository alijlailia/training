package com.ali;

import static com.ali.utils.DateTimeUtils.calculerDateNaissance;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.ali.model.Person;

public class Main4 {

	public static void main(String[] args) {

		Person p1 = new Person("jlailia", "ali", 24);
		Person p2 = new Person("dallali", "ramzi", 20);
		Person p3 = new Person("dallali", "mariem", 7);
		Person p4 = new Person("jlailia", "riem", 3);

		List<Person> persons = List.of(p1, p2, p3, p4);

		for (Person person : persons) {
			person.setDateNaissance(calculerDateNaissance(person.getAge()));
		}

		System.out.println(persons);
		//2ieme methode
		persons.stream().map(p -> {
			int age = p.getAge();
			LocalDate dateNaissance = calculerDateNaissance(age);
			p.setDateNaissance(dateNaissance);
			return p;
		}).collect(Collectors.toList());

		//3ieme methode
		persons.forEach(p -> p.setDateNaissance(calculerDateNaissance(p.getAge())));
		
		//4ieme methode
		persons.stream().forEach(p -> p.setDateNaissance(calculerDateNaissance(p.getAge())));
	}

}
