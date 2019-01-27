import java.util.Scanner;

public class CCC02S3 {
	public static int[][] map;
	public static char[] moves;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		// 0 is blank, 1 is obstacle, 2 is end point
		map = new int[r][c];
		sc.nextLine();

		for (int i = 0; i < r; i++) {
			String line = sc.nextLine();
			for (int ii = 0; ii < c; ii++) {
				if (line.charAt(ii) == '.') {
					map[i][ii] = 0;
				} else {
					map[i][ii] = 1;
				}
			}
		}

		// print(map);
		// System.out.println();

		int m = sc.nextInt();
		moves = new char[m];
		sc.nextLine();
		for (int i = 0; i < m; i++) {
			String temp = sc.nextLine();
			moves[i] = temp.charAt(0);
		}

		for (int i = 0; i < r; i++) {
			for (int ii = 0; ii < c; ii++) {
				search(i, ii);
			}
		}

		for (int i = 0; i < r; i++) {
			for (int ii = 0; ii < c; ii++) {
				if (map[i][ii] == 0) {
					System.out.print('.');
				} else if (map[i][ii] == 1) {
					System.out.print('X');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}

	public static void search(int r, int c) {
		// r,c is the initial position
		char[] forward = { 'N', 'W', 'S', 'E' };

		// for each direction facing
		boolean[] doable = new boolean[4];

		for (int i = 0; i < 4; i++) {
			char face = forward[i];
			doable[i] = true;
			// for each move
			if (!valid(r, c)) {
				doable[i] = false;
				break;
			}
			int curR = r;
			int curC = c;
			for (int ii = 0; ii < moves.length && doable[i]; ii++) {
				// if point valid, move there
				if (moves[ii] == 'F') {
					if (face == 'N' && valid(curR - 1, curC)) {
						curR--;
					} else if (face == 'S' && valid(curR + 1, curC)) {
						curR++;
					} else if (face == 'W' && valid(curR, curC - 1)) {
						curC--;
					} else if (face == 'E' && valid(curR, curC + 1)) {
						curC++;
					} else {
						doable[i] = false;
						break;
					}
				} else if (moves[ii] == 'R') {
					if (face == 'N') {
						face = 'E';
					} else if (face == 'S') {
						face = 'W';
					} else if (face == 'W') {
						face = 'N';
					} else if (face == 'E') {
						face = 'S';
					}
				} else {
					if (face == 'N') {
						face = 'W';
					} else if (face == 'S') {
						face = 'E';
					} else if (face == 'W') {
						face = 'S';
					} else if (face == 'E') {
						face = 'N';
					}
				}

			}
			if (doable[i] && valid(curR, curC)) {
				map[curR][curC] = 2;
			}
			// print(map);
			// System.out.println();

		}

	}

	// public static void print(int[][] input) {
	// for (int i = 0; i < input.length; i++) {
	// for (int ii = 0; ii < input[i].length; ii++) {
	// System.out.print(input[i][ii] + " ");
	// }
	// System.out.println();
	// }
	// }

	public static boolean valid(int r, int c) {
		if (r >= map.length || r < 0 || c < 0 || c >= map[0].length) {
			return false;
		}
		if (map[r][c] == 1) {
			return false;
		}

		return true;
	}
}
