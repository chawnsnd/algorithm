package topcoder;

public class InterestingParty {
	public static int bestInvitation(String[] first, String[] second) {
		int max = 0;
		int same = 1;
		for (int i = 0; i < first.length; i++) {
			for (int j = i + 1; j < first.length; j++) {
				if (first[i] == first[j])
					same++;
			}
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j])
					same++;
			}
			if (same > max)
				max = same;
			same = 0;
		}
		for (int i = 0; i < second.length; i++) {
			for (int j = i + 1; j < second.length; j++) {
				if (second[i] == second[j])
					same++;
			}
			for (int j = 0; j < first.length; j++) {
				if (second[i] == first[j])
					same++;
			}
			if (same > max)
				max = same;
			same = 0;
		}
		return max;
	}

	public static void main(String[] args) {
		String[] first = { "t", "o", "p", "c", "o,", "d" };
		String[] second = { "talking", "speaking", "discussion", "meeting" };
		System.out.println(bestInvitation(first, second));
	}
}
