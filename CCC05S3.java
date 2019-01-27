import java.util.Scanner;

public class CCC05S3 {
	public static int[][][] input;
	// public static ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> idk = new
	// ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>>();

	public static int[][] fin;
	public static int[][] mid;
	public static int[] answer = new int[6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int N = sc.nextInt();
		input = new int[N][][];

		for (int a = 0; a < N; a++) {

			int r = sc.nextInt();
			int c = sc.nextInt();

			input[a] = new int[r][c];

			for (int i = 0; i < r; i++) {
				for (int ii = 0; ii < c; ii++) {
					input[a][i][ii] = sc.nextInt();
				}
			}

		}

		if (N == 1) {
			cal(input[0]);
			for (int i = 0; i < 6; i++) {
				System.out.println(answer[i]);
			}
		} else {
			// first merge input[0] and input[1] into mid[][];
			merge(input[0], input[1], 1);
			boolean middle = true;

			for (int a = 2; a < N; a++) {
				if (middle) {
					// put into fin
					merge(mid, input[a], 0);
				} else {
					// put into mid
					merge(fin, input[a], 1);
				}

				middle = !middle;
			}
			if (!middle) {
				// is in fin
				cal(fin);
				for (int i = 0; i < 6; i++) {
					System.out.println(answer[i]);
				}
			} else {
				// is in mid
				cal(mid);
				for (int i = 0; i < 6; i++) {
					System.out.println(answer[i]);
				}
			}

		}
	}

	public static void merge(int[][] mat1, int[][] mat2, int indicator) {
		if (indicator == 0) {
			fin = new int[mat1.length * mat2.length][mat1[0].length * mat2[0].length];

			for (int i = 0; i < mat1.length; i++) {
				for (int ii = 0; ii < mat1[i].length; ii++) {
					for (int iii = 0; iii < mat2.length; iii++) {
						for (int iiii = 0; iiii < mat2[iii].length; iiii++) {
							fin[i * mat2.length + iii][ii * mat2[iii].length + iiii] = mat1[i][ii] * mat2[iii][iiii];
						}
					}
				}
			}

		} else {
			mid = new int[mat1.length * mat2.length][mat1[0].length * mat2[0].length];

			for (int i = 0; i < mat1.length; i++) {
				for (int ii = 0; ii < mat1[i].length; ii++) {
					for (int iii = 0; iii < mat2.length; iii++) {
						for (int iiii = 0; iiii < mat2[iii].length; iiii++) {
							mid[i * mat2.length + iii][ii * mat2[iii].length + iiii] = mat1[i][ii] * mat2[iii][iiii];
						}
					}
				}
			}
		}

	}

	public static void print(int[][] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int ii = 0; ii < temp[i].length; ii++) {
				System.out.print(temp[i][ii] + " ");
			}
			System.out.println();
		}
	}

	public static void cal(int[][] temp) {
		int maxElement = Integer.MIN_VALUE;
		int minElement = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < temp.length; i++) {
			int sum = 0;
			for (int ii = 0; ii < temp[0].length; ii++) {
				sum += temp[i][ii];
				if (temp[i][ii] > maxElement) {
					maxElement = temp[i][ii];
				}

				if (temp[i][ii] < minElement) {
					minElement = temp[i][ii];
				}

			}
			if (sum > max) {
				max = sum;
			}
			if (sum < min) {
				min = sum;
			}
		}
		answer[2] = max;
		answer[3] = min;
		answer[0] = maxElement;
		answer[1] = minElement;

		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;

		for (int i = 0; i < temp[0].length; i++) {
			int sum = 0;
			for (int ii = 0; ii < temp.length; ii++) {
				sum += temp[ii][i];

			}
			if (sum > max) {
				max = sum;
			}
			if (sum < min) {
				min = sum;
			}
		}
		answer[4] = max;
		answer[5] = min;
	}

}
