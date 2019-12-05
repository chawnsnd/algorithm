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

		int[] route = { h - 1, 0 }; // route[0] : 위아래, route[1] : 좌우
		String direction = "r";
		int count = 0;
		while (true) {
			// 디렉션이 r
			if (direction.equals("r")) {
				// 방해물 안만남
				if (map[route[0]][route[1]].equals("_")) {
					route[1] = route[1] + 1;
					count++;
				}
				// 방해물 만남("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// 위로
					route[0] = route[0] + 1;
					direction = "t";
					count++;
				}
				// "\"임
				else {
					// 아래로
					route[0] = route[0] - 1;
					direction = "b";
					count++;
				}
			}
			// 디렉션이 l // route[0] : 위아래, route[1] : 좌우
			else if (direction.equals("l")) {
				// 방해물 안만남
				if (map[route[0]][route[1]].equals("_")) {
					route[1] = route[1] - 1;
					count++;
				}
				// 방해물 만남("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// 아래로
					route[0] = route[0] - 1;
					direction = "b";
					count++;
				}
				// "\"임
				else {
					// 위로
					route[0] = route[0] + 1;
					direction = "t";
					count++;
				}
			}
			// 디렉션이 t // route[0] : 위아래, route[1] : 좌우
			else if (direction.equals("t")) {
				// 방해물 안만남
				if (map[route[0]][route[1]].equals("_")) {
					route[0] = route[0] + 1;
					count++;
				}
				// 방해물 만남("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// 오른쪽으로
					route[1] = route[1] + 1;
					direction = "r";
					count++;
				}
				// "\"임
				else {
					// 왼쪽으로
					route[1] = route[1] - 1;
					direction = "l";
					count++;
				}
			}
			// 디렉션이 b // route[0] : 위아래, route[1] : 좌우
			else {
				// 방해물 안만남
				if (map[route[0]][route[1]].equals("_")) {
					route[0] = route[0] - 1;
					count++;
				}
				// 방해물 만남("/")
				else if (map[route[0]][route[1]].equals("/")) {
					// 왼쪽으로
					route[1] = route[1] - 1;
					direction = "l";
					count++;
				}
				// "\"임
				else {
					// 오른쪽으로
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
