package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A031_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
		System.out.println("d");

		String input1 = "2 3 5 7"; // 8
//		String input2 = "3 2 7 1"; // 1
//		String input3 = "3 5 7 1000"; // 81716054175
		String[] inputArr = input1.split(" ");
		int[] primeArr = new int[inputArr.length - 1];
		for (int i = 0; i < primeArr.length; i++) {
			primeArr[i] = Integer.parseInt(inputArr[i]);
		}
		int num = Integer.parseInt(inputArr[inputArr.length - 1]);
    	int result[] = new int[num+1];
		int dekita = 0;
		int i = 0;
		while(true) {
			if(i>num) break;
			List<Integer> list = new ArrayList<>();
    		List<Integer> primeList = new ArrayList<Integer>();
    		int nnum = dekita;
    		for (int j = 2; i <= nnum; i++) {
    			while (nnum % j == 0) {
    				list.add(j);
    				nnum = nnum / j;
    			}
    		}
    		primeList.add(1);
    		for (int prime : primeArr) {
    			primeList.add(prime);
    		}
    		
    		for (int l : list) {
    			if(primeList.contains(l)) {
    				result[i] = dekita;
    				i++;
    			}
    		}
    		dekita++;
		}
		int res = dekita-1;
		System.out.println(res);
	}
}