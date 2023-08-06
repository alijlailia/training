package com.ali.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileUtils {

	public static List<String> readFileByLignes(String fileName) throws URISyntaxException, IOException {
		//pour lire le path a partir du nom de fichier
		Path path = Paths.get(ReadFileUtils.class.getClassLoader().getResource(fileName).toURI());
        // pour lire les lignes d'un fichier
		Stream<String> linesStream = Files.lines(path);
		List<String> lines = linesStream.collect(Collectors.toList());
		linesStream.close();

		return lines;
	}

}
