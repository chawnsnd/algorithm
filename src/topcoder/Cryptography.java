package topcoder;

public class Cryptography {
	public static long encrypt(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]++;
			int mul = numbers[i];
			for (int j = 0; j < numbers.length; j++) {
				if (i == j)
					continue;
				mul = mul * numbers[j];
				if (mul > max) {
					max = mul;
				}
			}
			numbers[i]--;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 2, 1, 1, 3 };
		System.out.println(encrypt(numbers));
	}
}
