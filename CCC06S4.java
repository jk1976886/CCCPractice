import java.util.Scanner;

public class CCC06S4 {

	public static int[][] input, temp;

	public static void main(String[] args) throws Exception {
		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			if (N == 0) {
				break;
			}
			input = new int[N][N];
			temp = new int[N][N];
			for (int i = 0; i < N; i++) {
				// String[] line = reader.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					input[i][j] = sc.nextInt() - 1;
					temp[i][j] = input[i][j];
				}
			}

			boolean valid = true;
			// check identity
			if (!iden(temp)) {
				valid = false;
			}
			restore();
			// check inverse
			if (valid) {
				if (!inverse(temp)) {
					valid = false;
				}
			}
			restore();
			// check associativity
			if (valid) {
				if (!asso(temp)) {
					valid = false;
				}
			}

			if (valid) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}

	}

	public static boolean asso(int[][] cur) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (cur[i][cur[j][k]] != cur[cur[i][j]][k]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	// this is error
	public static boolean inverse(int[][] cur) {
		for (int i = 0; i < N; i++) {
			boolean found = false;
			int counter = 0;
			for (int j = 0; j < N; j++) {
				if (cur[i][j] == identity && cur[j][i] == identity) {
					found = true;
				}
			}
			if (!found || counter > 1) {
				return false;
			}
		}

		return true;
	}

	// check only, no modification on cur
	public static boolean iden(int[][] cur) {
		int tempi = -1;
		int counter = 0;
		for (int i = 0; i < N; i++) {
			boolean validi = true;
			for (int j = 0; j < N; j++) {
				if (cur[i][j] == j && cur[j][i] == j) {
					continue;
				} else {
					validi = false;
					break;
				}
			}
			if (validi) {
				tempi = i;
				counter++;
			}
		}
		if (tempi != -1 && counter == 1) {
			identity = tempi;
			return true;
		} else {
			return false;
		}
	}

	public static int identity, N;

	public static void restore() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				temp[i][j] = input[i][j];
			}
		}
	}

}
