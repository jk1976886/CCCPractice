import java.util.ArrayList;
import java.util.Scanner;

public class CCC09S2 {
	public static int[][] original, temp;
	public static ArrayList<ArrayList<Integer>> variation;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int C = sc.nextInt();
		variation = new ArrayList<ArrayList<Integer>>();

		original = new int[R][C];
		temp = new int[R][C];

		for (int i = 0; i < R; i++) {
			for (int ii = 0; ii < C; ii++) {
				original[i][ii] = sc.nextInt();
				temp[i][ii] = original[i][ii];
			}
		}
		// no button pressed
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < C; i++) {
			a.add(original[R - 1][i]);
		}
		variation.add(a);

		for (int i = R - 1; i > 0; i--) {
			for (int ii = i; ii < R; ii++) {
				// reverse
				for (int iii = 0; iii < C; iii++) {
					if (temp[ii][iii] == temp[ii - 1][iii]) {
						temp[ii][iii] = 0;
					} else {
						temp[ii][iii] = 1;
					}
				}

			}
			// check last line
			boolean dup = false;
			for (ArrayList<Integer> arr : variation) {

				if (compare(arr, temp[R - 1])) {
					dup = true;
					break;
				}
			}

			if (!dup) {
				ArrayList<Integer> hol = new ArrayList<>();
				for (int q = 0; q < C; q++) {
					hol.add(temp[R - 1][q]);
				}
				variation.add(hol);
			}

			// restore temp

			for (int j = 0; j < R; j++) {
				for (int k = 0; k < C; k++) {
					temp[j][k] = original[j][k];
				}
			}

		}
		System.out.println(variation.size());

	}

	public static boolean compare(ArrayList<Integer> a, int[] b) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) != b[i]) {
				return false;
			}
		}

		return true;
	}

}
