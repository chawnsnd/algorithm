package paiza;

import java.util.Scanner;

public class A031 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
		String input = "3 5 7 100";

		String[] inputArr = input.split(" ");
		int[] primeArr = new int[inputArr.length - 1];
		for (int i = 0; i < primeArr.length; i++) {
			primeArr[i] = Integer.parseInt(inputArr[i]);
		}
		int num = Integer.parseInt(inputArr[inputArr.length - 1]);

		long[] resultArr = new long[num];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = Long.MAX_VALUE;
		}
		for (int i = 0; i <= 64; i++) {
			for (int j = 0; j <= 64; j++) {
				for (int k = 0; k <= 64; k++) {
					long mul = (long) (Math.pow(primeArr[0], i) * Math.pow(primeArr[1], j) * Math.pow(primeArr[2], k));

					boolean flag = false;
					for (long res : resultArr) {
						if (res == mul)
							flag = true;
					}
					if (resultArr[num - 1] < mul)
						flag = true;
					if (flag)
						continue;

					for (int l = 0; l < resultArr.length; l++) {
						if (mul < resultArr[l]) {
							for (int n = resultArr.length - 1; n > l; n--) {
								resultArr[n] = resultArr[n - 1];
							}
							resultArr[l] = mul;
							break;
						}
					}
				}
			}
		}
		for (long l : resultArr) {
			System.out.print(l+" ");
		}
		System.out.println(resultArr[num - 1]);
	}
}
