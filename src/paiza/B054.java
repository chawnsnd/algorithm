package paiza;

import java.util.Scanner;

public class B054 {

	
	public static void main(String[] args) {
		String[] paizaArr = {"A", "B", "C", "D", "E"};
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String paiza1 = input.split(" ")[0];
		String paiza2 = input.split(" ")[1];
		
		
		int num1 = 0;
		for(int i=0; i<paiza1.length(); i++) {
			for(int j=0; j<paizaArr.length; j++) {
				if(String.valueOf(paiza1.charAt(i)).equals(paizaArr[j])) {
					num1 = (int) (num1 + j*Math.pow(5, (paiza1.length()-(i+1))));
				}
			}
		}
		int num2 = 0;
		for(int i=0; i<paiza2.length(); i++) {
			for(int j=0; j<paizaArr.length; j++) {
				if(String.valueOf(paiza2.charAt(i)).equals(paizaArr[j])) {
					num2 = (int) (num2 + j*Math.pow(5, (paiza2.length()-(i+1))));
				}
			}
		}
		int solNum = num1 + num2;
		StringBuilder sb = new StringBuilder();
		while(true) {
			sb.insert(0, paizaArr[(solNum%5)]);
			solNum = solNum/5;
			if(solNum == 0) break;
		}
		System.out.println(sb.toString());
		
	}
	
}
