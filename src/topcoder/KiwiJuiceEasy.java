package topcoder;

import java.util.Arrays;

public class KiwiJuiceEasy {

	// capacities -> ���� �뷮
	// bottles -> capacities�� ���� ��, capacities�ȿ� ����ִ� �ֽ��� ��
	// fromId -> 1~50
	// todoId -> 1~50
	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for (int i = 0; i < fromId.length; i++) {
			bottles[toId[i]] = bottles[toId[i]] + bottles[fromId[i]];
			bottles[fromId[i]] = 0;
			if (bottles[toId[i]] > capacities[toId[i]]) {
				bottles[fromId[i]] = bottles[toId[i]] - capacities[toId[i]];
				bottles[toId[i]] = capacities[toId[i]];
			}
		}
		return bottles;
	}

	public static void main(String[] args) {
		int[] capacities = { 700000, 800000, 900000, 1000000 };
		int[] bottles = { 478478, 478478, 478478, 478478 };
		int[] fromId = { 2, 3, 2, 0, 1 };
		int[] toId = { 0, 1, 1, 3, 2 };
		System.out.println(Arrays.toString(thePouring(capacities, bottles, fromId, toId)));
	}
}
