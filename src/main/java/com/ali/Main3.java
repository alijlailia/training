package com.ali;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {

	public static void main(String[] args) {

		// creer une map contenant le nombre des boissons par nom
		Map<String, Integer> boissonsMap = new HashMap<>();
		boissonsMap.put("fanta", 4);
		boissonsMap.put("coca", 8);
		boissonsMap.put("sprit", 8);
		boissonsMap.put("hawai", 12);
		boissonsMap.put("pepsi", 9);

		// deuxieme methodes mpour ceer une map mais immuable"nn modifiable"
		// Map<String, Integer> boissonsMap2 = Map.of("fanta", 4, "coca", 6);

		List<String> boissonsSup8 = new ArrayList<>();

		// trouver les boissons dont le nombre est superieur ou egale à 8
		for (Map.Entry<String, Integer> couple : boissonsMap.entrySet()) {
			if (couple.getValue() >= 8) {
				boissonsSup8.add(couple.getKey());
			}
		}
		System.out.println(boissonsSup8);

		// deuxieme methode avec java8
		List<String> collect = boissonsMap.entrySet().stream().filter(couple -> couple.getValue() >= 8)
				.map(couple -> couple.getKey()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
