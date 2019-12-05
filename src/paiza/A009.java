package paiza;

import java.util.Scanner;

public class A009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int h = Integer.parseInt(input.split(" ")[0]);
		int w = Integer.parseInt(input.split(" ")[1]);
		String[][] map = new String[h][w];
		for (int i = h - 1; i >= 0; i--) {
			String line = scanner.nextLine();
			for (int j = 0; j < w; j++) {
				map[i][j] = line.split("")[j];
			}
		}

		int[] route = { h - 1, 0 }; // route[0] : ���Ʒ�, route[1] : �¿�
		String direction = "r";
		int count = 0;
		while (true) {
			// �𷺼��� r
			if (direction.equals("r")) {
				// ���ع� �ȸ���
				if (map[route[0]][route[1]].equals("_")) {
					route[1] = route[1] + 1;
					count++;
				}
				// ���ع� ����("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// ����
					route[0] = route[0] + 1;
					direction = "t";
					count++;
				}
				// "\"��
				else {
					// �Ʒ���
					route[0] = route[0] - 1;
					direction = "b";
					count++;
				}
			}
			// �𷺼��� l // route[0] : ���Ʒ�, route[1] : �¿�
			else if (direction.equals("l")) {
				// ���ع� �ȸ���
				if (map[route[0]][route[1]].equals("_")) {
					route[1] = route[1] - 1;
					count++;
				}
				// ���ع� ����("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// �Ʒ���
					route[0] = route[0] - 1;
					direction = "b";
					count++;
				}
				// "\"��
				else {
					// ����
					route[0] = route[0] + 1;
					direction = "t";
					count++;
				}
			}
			// �𷺼��� t // route[0] : ���Ʒ�, route[1] : �¿�
			else if (direction.equals("t")) {
				// ���ع� �ȸ���
				if (map[route[0]][route[1]].equals("_")) {
					route[0] = route[0] + 1;
					count++;
				}
				// ���ع� ����("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// ����������
					route[1] = route[1] + 1;
					direction = "r";
					count++;
				}
				// "\"��
				else {
					// ��������
					route[1] = route[1] - 1;
					direction = "l";
					count++;
				}
			}
			// �𷺼��� b // route[0] : ���Ʒ�, route[1] : �¿�
			else {
				// ���ع� �ȸ���
				if (map[route[0]][route[1]].equals("_")) {
					route[0] = route[0] - 1;
					count++;
				}
				// ���ع� ����("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// ��������
					route[1] = route[1] - 1;
					direction = "l";
					count++;
				}
				// "\"��
				else {
					// ����������
					route[1] = route[1] + 1;
					direction = "r";
					count++;
				}
			}
			if (route[0] >= h || route[1] >= w || route[0] < 0 || route[1] < 0) {
				break;
			}
		}
		System.out.println(count);
	}
}
