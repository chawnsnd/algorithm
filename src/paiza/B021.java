package paiza;

import java.util.Scanner;

public class B021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] words = new String[n];
		String[] newWords = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = scanner.nextLine();
		}
		for (int i = 0; i < n; i++) {
			String word = words[i];
			if (word.charAt(word.length() - 1) == 's' || word.charAt(word.length() - 1) == 'o'
					|| word.charAt(word.length() - 1) == 'x'
					|| (word.charAt(word.length() - 2) == 's' && word.charAt(word.length() - 1) == 'h')
					|| (word.charAt(word.length() - 2) == 'c' && word.charAt(word.length() - 1) == 'h')) {
				newWords[i] = word + "es";
			} else if (word.charAt(word.length() - 1) == 'f') {
				newWords[i] = word.substring(0, word.length() - 1) + "ves";
			} else if ((word.charAt(word.length() - 2) == 'f' && word.charAt(word.length() - 1) == 'e')) {
				newWords[i] = word.substring(0, word.length() - 2) + "ves";
			} else if (word.charAt(word.length() - 1) == 'y' && (word.charAt(word.length() - 2) != 'a'
					&& word.charAt(word.length() - 2) != 'i' && word.charAt(word.length() - 2) != 'u'
					&& word.charAt(word.length() - 2) != 'e' && word.charAt(word.length() - 2) != 'o')) {
				newWords[i] = word.substring(0, word.length() - 1) + "ies";
			} else {
				newWords[i] = word + "s";
			}
		}
		for (String string : newWords) {
			System.out.println(string);	
		}
	}
}
