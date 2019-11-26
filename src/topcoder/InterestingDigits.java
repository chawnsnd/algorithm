package topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterestingDigits {
	public static int[] digits(int base) {
		List<Integer> list = new ArrayList<>();

		int num = 0;
		while(num<Math.pow(base, 3)-1) {
			//num�� baseNum���� �ٲٱ�
			String tempStr = "";
			int tmpNum = num;
			while(true) {
				tempStr = Integer.toString(tmpNum%base)+tempStr;
				tmpNum = tmpNum/base;
				if(tmpNum<base) {
					tempStr = Integer.toString(tmpNum)+tempStr;
					break; 
				}
			}
			int baseNum = Integer.parseInt(tempStr);	
			//base������ �ٲٰ� �� �İ� baseNum
			for(int i=2; i<base; i++) {	//���� ����� ����
				//���ڸ� �� ���ϱ�
				int sum = 0;
				while(true) {
					sum += baseNum%10;
					baseNum = baseNum/10;
					if(baseNum == 0) break;
				}
				if(baseNum % i == 0 && sum % i == 0) {
					list.add(i);
				}
			}
			num++;
		}
		int[] result = list.stream().mapToInt(i->i).toArray();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(digits(9)));
	}
}
