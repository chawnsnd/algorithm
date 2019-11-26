package paiza;

import java.util.Scanner;

public class C028 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("C028");
		int num = scanner.nextInt();
		scanner.nextLine();

//		String[][] test = new String[num][2];
//		for(int i=0; i<num; i++) {
//			String problem = scanner.nextLine();
//			test[i][0] = problem.split(" ")[0];
//			test[i][1] = problem.split(" ")[1];
//		}
//		int score = 0;
//		for(int i=0; i<test.length; i++) {
//			if(test[i][0].equals(test[i][1])) {
//				score = score+2;
//			}else if(test[i][0].length() == test[i][1].length()) {
//				int different = 0;
//				for(int j=0; j<test[i][0].length(); j++) {
//					if(test[i][0].charAt(j)!=test[i][1].charAt(j))
//						different++;
//				}
//				if(different == 1) {
//					score++;
//				}
//			}
//		}
		
//		
//		!true -> false
//		
//		boolean flag = true;
//		boolean flag2 = !flag;
//		flag2 -> false
//		
//
//		if(list.get(0).arr[0].equals(list.get(0).arr[1])==false){
//			diffent++
//		}
//		
		int score = 0;
		String problem, answer, solution;
		for (int i = 0; i < num; i++) {
			problem = scanner.nextLine();
			answer = problem.split(" ")[0];
			solution = problem.split(" ")[1];
			if (answer.equals(solution)) {
				score = score + 2;
			} else if (answer.length() == solution.length()) {
				int different = 0;
				for (int j = 0; j < answer.length(); j++) {
					if (answer.charAt(j) != solution.charAt(j))
						different++;
				}
				if (different == 1) {
					score = score + 1;
				}
			}
		}

		System.out.println(score);
	}
}
