package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C043 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String input = scanner.nextLine();
		String[] cashHistory = input.split(" ");
		
		int[] person = new int[10001];
		for(int i=0; i<cashHistory.length; i++) {
			person[Integer.parseInt(cashHistory[i])] = person[Integer.parseInt(cashHistory[i])] + 1;
		}
		int max = Integer.MIN_VALUE;

		List<Integer> vipPerson = new ArrayList<Integer>();
		for(int i=0; i<person.length; i++) {
			if(person[i]>max) {
				vipPerson.clear();
				vipPerson.add(i);
				max = person[i];
			}else if(person[i] == max){
				vipPerson.add(i);
			}
		}
		
		for (int i=0; i<vipPerson.size(); i++) {
			System.out.print(vipPerson.get(i));
			if(i == vipPerson.size()-1) break;
			System.out.print(" ");
		}
	}
}
