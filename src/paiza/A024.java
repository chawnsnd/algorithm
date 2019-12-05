package paiza;

import java.util.Scanner;

public class A024 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		int n = input.split(" ")[0];
//		int k = input.split(" ")[1];
		int n = 2;
		int k = 3;

		int[] rewards = new int[2 * n];
		int[] aSang = new int[n];
		int[] bSang = new int[n];

		for (int i = 0; i < rewards.length; i++) {
			rewards[i] = i + 1;
		}

		while (true) {
			for (int i = 0; i < aSang.length; i++) {
				for (int j = 0; j < bSang.length; j++) {
					
					
					for (int a = 0; a < rewards.length; a++) {
						aSang[i] = rewards[a];
						for (int b = a + 1; a < rewards.length; b++) {
							System.out.println(a+", "+b);
							bSang[j] = rewards[b];
						}
					}
					
					for (int a : aSang)
						System.out.print(a + " ");
					System.out.println();
					for (int b : bSang)
						System.out.print(b + " ");
					System.out.println();
					System.out.println("-----");
					
				}
			}
		}
	}
}
