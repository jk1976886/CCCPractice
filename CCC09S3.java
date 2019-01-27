import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CCC09S3 {

	public static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] origHol = { {}, { 6 }, { 6 }, { 4, 5, 6, 15 }, { 3, 5, 6 }, { 3, 4, 6 }, { 1, 2, 3, 4, 5, 7 }, { 6, 8 },
				{ 7, 9 }, { 8, 10, 12 }, { 9, 11 }, { 10, 12 }, { 9, 11, 13 }, { 12, 14, 15 }, { 13 }, { 3, 13 },
				{ 17, 18 }, { 16, 18 }, { 16, 17 } };

		map = new int[50][50];

		for (int i = 1; i <= 18; i++) {
			for (int ii = 0; ii < origHol[i].length; ii++) {
				map[i][origHol[i][ii]] = 1;
			}
		}

		while (true) {

			char instruction = sc.nextLine().charAt(0);

			if (instruction == 'i') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				// add x and y as friends, if x/y is not in already, add them; if x,y are
				// already friends, do nothing
				map[x][y] = 1;
				map[y][x] = 1;

			} else if (instruction == 'd') {
				int x = sc.nextInt();
				int y = sc.nextInt();

				map[x][y] = 0;
				map[y][x] = 0;
			} else if (instruction == 'n') {
				int x = sc.nextInt();
				// output number of friends
				int counter = 0;

				for (int i = 1; i < 50; i++) {
					if (map[x][i] == 1) {
						counter++;
					}
				}
				System.out.println(counter);

			} else if (instruction == 'f') {
				int x = sc.nextInt();
				// output number of friends of friends (exclude direct friends)
				ArrayList<Integer> direct = new ArrayList<>();
				ArrayList<Integer> second = new ArrayList<>();

				Set<Integer> included = new HashSet<>();
				included.add(x);
				for (int i = 1; i < 50; i++) {
					if (map[x][i] == 1) {
						direct.add(i);
						included.add(i);
					}
				}

				for (int i : direct) {
					for (int ii = 1; ii < 50; ii++) {
						if (map[i][ii] == 1 && !included.contains(ii)) {
							second.add(ii);
							included.add(ii);
						}
					}
				}
				System.out.println(second.size());

			} else if (instruction == 's') {
				int x = sc.nextInt();
				int y = sc.nextInt();

				int[][] dist = new int[50][50];

				for (int i = 1; i < 50; i++) {
					for (int ii = 1; ii < 50; ii++) {
						if (map[i][ii] == 1) {
							dist[i][ii] = 1;
						} else {
							dist[i][ii] = 999;
						}
					}
				}

				for (int a = 1; a < 50; a++) {
					for (int b = 1; b < 50; b++) {
						if (dist[a][b] > 0) {
							for (int c = 1; c < 50; c++) {
								if (dist[b][c] > 0) {
									int hol = dist[a][b] + dist[b][c];
									if (hol < dist[a][c]) {
										dist[a][c] = hol;
										dist[c][a] = hol;
									}
								}

							}
						}
					}
				}

				if (dist[x][y] == 999) {
					System.out.println("Not connected");
				} else {
					System.out.println(dist[x][y]);
				}
			} else if (instruction == 'q') {
				break;
			}
			sc.nextLine();
		}

	}

}
