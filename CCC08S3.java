import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC08S3 {

	public static int[][] map, steps;
	public static ArrayList<Integer> ans;
	public static boolean[][] visited;
	public static boolean finish;

	public static int r, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int a = 0; a < T; a++) {
			r = sc.nextInt();
			c = sc.nextInt();

			map = new int[r][c];
			steps = new int[r][c];
			ans = new ArrayList<>();
			visited = new boolean[r][c];
			// 0 is can not enter
			// 1 is West and East
			// 2 is North and South
			// 3 is ALL 4 directions

			sc.nextLine();

			for (int i = 0; i < r; i++) {
				String line = sc.nextLine();
				for (int ii = 0; ii < c; ii++) {
					steps[i][ii] = 99999;
					if (line.charAt(ii) == '-') {
						map[i][ii] = 1;
					} else if (line.charAt(ii) == '|') {
						map[i][ii] = 2;
					} else if (line.charAt(ii) == '+') {
						map[i][ii] = 3;
					} else if (line.charAt(ii) == '*') {
						map[i][ii] = 0;
						steps[i][ii] = -1;
					}
				}
			}

			dfs(0, 0, 1);

			if (steps[r - 1][c - 1] == 99999) {
				System.out.println(-1);
			} else {
				System.out.println(steps[r - 1][c - 1]);
			}

		}

	}

	public static void dfs(int curR, int curC, int step) {

		visited[curR][curC] = true;
		steps[curR][curC] = step;
		// 0 is can not enter
		// 1 is West and East
		// 2 is North and South
		// 3 is ALL 4 directions

		if (map[curR][curC] == 1) {

			if (valid(curR, curC - 1, step + 1) && !visited[curR][curC - 1]) {
				dfs(curR, curC - 1, step + 1);
			}
			if (valid(curR, curC + 1, step + 1) && !visited[curR][curC + 1]) {
				dfs(curR, curC + 1, step + 1);
			}

		} else if (map[curR][curC] == 2) {

			if (valid(curR + 1, curC, step + 1) && !visited[curR + 1][curC]) {
				dfs(curR + 1, curC, step + 1);
			}
			if (valid(curR - 1, curC, step + 1) && !visited[curR - 1][curC]) {
				dfs(curR - 1, curC, step + 1);
			}

		} else if (map[curR][curC] == 3) {

			if (valid(curR, curC - 1, step + 1) && !visited[curR][curC - 1]) {
				dfs(curR, curC - 1, step + 1);
			}
			if (valid(curR, curC + 1, step + 1) && !visited[curR][curC + 1]) {
				dfs(curR, curC + 1, step + 1);
			}
			if (valid(curR + 1, curC, step + 1) && !visited[curR + 1][curC]) {
				dfs(curR + 1, curC, step + 1);
			}
			if (valid(curR - 1, curC, step + 1) && !visited[curR - 1][curC]) {
				dfs(curR - 1, curC, step + 1);
			}
		}
		visited[curR][curC] = false;
	}

	public static boolean valid(int R, int C, int step) {
		return R >= 0 && R < r && C >= 0 && C < c && steps[R][C] > step && steps[R][C] >= 0;
	}
}
