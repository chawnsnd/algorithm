package paiza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C051 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] nums = input.split(" ");
		List<String> numList = new ArrayList<String>();
		int max = Integer.MIN_VALUE;
		
		for (String num : nums) numList.add(num);
		
		for(int i=0; i<numList.size(); i++) {
			String a = numList.get(i);
			numList.remove(i);
			for(int j=0; j<numList.size(); j++) {
				String b = numList.get(j);
				numList.remove(j);
				for(int k=0; k<numList.size(); k++){
					String c = numList.get(k);
					numList.remove(k);
					for(int l=0; l<numList.size(); l++){
						String d = numList.get(l);
						numList.remove(l);
						int ab = Integer.parseInt(a+b);
						int cd = Integer.parseInt(c+d);
						if(ab+cd > max) max = ab+cd;
						numList.add(0, d);
					}
					numList.add(0, c);
				}
				numList.add(0, b);
			}
			numList.add(0, a);
		}
		System.out.println(max);
	}
}
