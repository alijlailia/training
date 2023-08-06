package com.ali;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import com.ali.model.Person;
import com.ali.utils.ReadFileUtils;

public class Main2 {

	public static void main(String[] args) throws URISyntaxException, IOException {

		List<String> lines = ReadFileUtils.readFileByLignes("persons.txt");
		System.out.println("liste  des personnes : " + lines);

		List<Person> list = lines.stream().map(ln -> lineToPerson(ln)).collect(Collectors.toList());
		System.out.println("persons : " + list);
	}

	private static Person lineToPerson(String line) {
		String[] strings = line.split(";");

		String nom = strings[0].trim();
		String prenom = strings[1].trim();
		String age = strings[2].trim();
		int ageInt = Integer.parseInt(age);

		return new Person(nom, prenom, ageInt);
	}

}
