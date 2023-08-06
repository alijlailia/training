package com.ali;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ali.model.Person;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("jlailia", "ali", 24);
		Person p2 = new Person("dallali", "ramzi", 20);
		Person p3 = new Person("dallali", "mariem", 7);
		Person p4 = new Person("jlailia", "riem", 3);
		// la difference entre la creation avec new ArrayList et List.of: la premier est
		// mutable"modifiable" mais pas la deuxieme
		List<Person> persons = List.of(p1, p2, p3, p4);

		System.out.println(p1);
		System.out.println(p2);

		// recuperer personnes avec age>20
		List<Person> list1 = persons.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
		System.out.println("list1 : " + list1);

		// trouver les pernom des personnes de la liste
		List<String> list2 = persons.stream().map(p -> p.getPrenom()).collect(Collectors.toList());
		System.out.println("list2 : " + list2);

		// Map<Key, Value> avec nom comme key et age comme value
		Map<String, Integer> map1 = persons.stream().collect(Collectors.toMap(p -> p.getPrenom(), p -> p.getAge()));
		System.out.println("map1 : " + map1);

		// grouper la liste des personnes groupe par age
		Map<String, List<Person>> mapBy = persons.stream().collect(Collectors.groupingBy(p -> p.getNom()));
		System.out.println("mapBy : " + mapBy);

		// grouper par champ multiple
		Map<String, Map<Integer, List<Person>>> groupBy = persons.stream()
				.collect(Collectors.groupingBy(p -> p.getNom(), Collectors.groupingBy(p -> p.getAge())));
		System.out.println("groupBy : " + groupBy);
	}

}
