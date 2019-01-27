import java.util.*;

public class CCC03S3 {

	public static int[][] map;
	public static ArrayList<Integer> size;
	public static int[] dr = { -1, 0, 0, 1 };
	public static int[] dc = { 0, 1, -1, 0 };
	public static int sizeHold, R, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wood = sc.nextInt();
		R = sc.nextInt();
		C = sc.nextInt();
		map = new int[R][C];
		size = new ArrayList<>();
		sc.nextLine();
		for (int i = 0; i < R; i++) {
			String temp = sc.nextLine();
			for (int ii = 0; ii < C; ii++) {
				if (temp.charAt(ii) == '.') {
					map[i][ii] = 1;
				} else {
					map[i][ii] = 0;
				}
			}
		}

		for (int i = 0; i < R; i++) {
			for (int ii = 0; ii < C; ii++) {
				if (map[i][ii] == 1) {
					sizeHold = 0;
					dfs(i, ii);
					size.add(sizeHold);
				}
			}
		}

		Collections.sort(size);
		int index = size.size() - 1;
		int counter = 0;
		while (index >= 0 && wood >= size.get(index)) {
			wood -= size.get(index);
			index--;
			counter++;
		}
		if (counter == 1) {
			System.out.println(counter + " room, " + wood + " square metre(s) left over");
		} else {
			System.out.println(counter + " rooms, " + wood + " square metre(s) left over");
		}
	}

	public static void dfs(int r, int c) {

		map[r][c] = 0;
		sizeHold++;
		for (int i = 0; i < 4; i++) {

			int tr = r + dr[i];
			int tc = c + dc[i];
			if (valid(tr, tc) && map[tr][tc] == 1) {
				dfs(tr, tc);
			}

		}

	}

	public static boolean valid(int r, int c) {
		return r < R && r >= 0 && c >= 0 && c < C;
	}

}
