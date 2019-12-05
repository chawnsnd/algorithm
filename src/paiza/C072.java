package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C072 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String monster = scanner.nextLine();
		int atk = Integer.parseInt(monster.split(" ")[0]);
		int def = Integer.parseInt(monster.split(" ")[1]);
		int agi = Integer.parseInt(monster.split(" ")[2]);
		int num = scanner.nextInt();
		scanner.nextLine();

		String[] s = new String[num];
		int[] minAtk = new int[num];
		int[] maxAtk = new int[num];
		int[] minDef = new int[num];
		int[] maxDef = new int[num];
		int[] minAgi = new int[num];
		int[] maxAgi = new int[num];
		for (int i = 0; i < num; i++) {
			String evolution = scanner.nextLine();
			s[i] = evolution.split(" ")[0];
			minAtk[i] = Integer.parseInt(evolution.split(" ")[1]);
			maxAtk[i] = Integer.parseInt(evolution.split(" ")[2]);
			minDef[i] = Integer.parseInt(evolution.split(" ")[3]);
			maxDef[i] = Integer.parseInt(evolution.split(" ")[4]);
			minAgi[i] = Integer.parseInt(evolution.split(" ")[5]);
			maxAgi[i] = Integer.parseInt(evolution.split(" ")[6]);
		}

		List<String> evolution = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			// 3개 진화조건 만족 maxEvolution++;
			if (atk >= minAtk[i] && atk <= maxAtk[i] && def >= minDef[i] && def <= maxDef[i] && agi >= minAgi[i]
					&& agi <= maxAgi[i]) {
				evolution.add(s[i]);
			}
		}
		if (evolution.size() == 0) {
			System.out.println("no evolution");
		} else {
			for (String string : evolution) {
				System.out.println(string);
			}
		}
	}
}
