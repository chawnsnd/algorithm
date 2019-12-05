package paiza;

import java.util.Scanner;

public class A017 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hwn = scanner.nextLine();
		int h = Integer.parseInt(hwn.split(" ")[0]);
		int w = Integer.parseInt(hwn.split(" ")[1]);
		int n = Integer.parseInt(hwn.split(" ")[2]);

		int[] hArr = new int[n];
		int[] wArr = new int[n];
		int[] xArr = new int[n];
		int[][] bl = new int[n][2];
		int[][] br = new int[n][2];
		int[][] tl = new int[n][2];
		int[][] tr = new int[n][2];

		for (int i = 0; i < n; i++) {
			String hwn_n = scanner.nextLine();
			hArr[i] = Integer.parseInt(hwn_n.split(" ")[0]);
			wArr[i] = Integer.parseInt(hwn_n.split(" ")[1]);
			xArr[i] = Integer.parseInt(hwn_n.split(" ")[2]);
		}
		for (int i = 0; i < n; i++) {
			// ���� ���� 0
			int maxHeight = 0;
			bl[i][0] = xArr[i];
			bl[i][1] = 0;
			br[i][0] = xArr[i] + wArr[i];
			br[i][1] = 0;
			tl[i][0] = xArr[i];
			tl[i][1] = 0 + hArr[i];
			tr[i][0] = xArr[i] + wArr[i];
			tr[i][1] = 0 + hArr[i];
			// ��� ��Ҹ� ���ƴٴϸ鼭 �ڱ� bl, br ���̿� �����ϴ°� �ִ��� Ȯ��
			for (int j = 0; j < i; j++) {
				//�ڱ� bl���� ���� br�� ū�� || �ڱ� br���� ���� b�� ������
				// �����ϸ� ���� ����
				if (bl[i][0] < br[j][0] && br[i][0] > bl[j][0]) {
					maxHeight = tr[j][1];
				}
			}
			bl[i][1] += maxHeight;
			br[i][1] += maxHeight;
			tl[i][1] += maxHeight;
			tr[i][1] += maxHeight;
			// �ƽ� ���̿� ����
		}

		// ���� ���� Ȯ��
		for (int y = h-1; y >= 0; y--) {
			for (int x = 0; x < w; x++) {
				boolean isFilled = false;
				for (int i = 0; i < n; i++) {
					if (bl[i][0] <= x && tr[i][0]-1 >= x && bl[i][1] <= y && tr[i][1]-1 >= y) {
						isFilled = true;
						System.out.print("#");
					}
				}
				if (!isFilled)
					System.out.print(".");
			}
			System.out.println();
		}
	}
}
