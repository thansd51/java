package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File wordsFranken = new File("franken.txt");

		System.out.println(wordsFranken.exists());

		TreeSet<String> franken = loadWords(wordsFranken);
		System.out.println(franken.size());

		displayWords(franken);
	}

	private static void displayWords(TreeSet<String> list) {
		// 단어길이 6자 이상 한줄에 6개
		int count = 0;
		for (String w : list) {
			if (w.length() < 6)
				continue;
			System.out.printf("%-10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	private static TreeSet<String> loadWords(File file) {

		TreeSet<String> wordSet = new TreeSet<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");

				for (var word : words) {
					wordSet.add(word.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함");
		} catch (IOException e) {
			System.out.println("파일을 못 읽음");
		}
		return wordSet;
	}
}
