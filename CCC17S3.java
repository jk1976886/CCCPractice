import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CCC17S3 {

	public static int minLen, maxLen;
	public static int[] input, fenceHeight;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		String[] line = reader.readLine().split(" ");
		input = new int[2001];
		minLen = 2001;
		maxLen = 0;
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(line[i]);
			if (temp < minLen) {
				minLen = temp;
			}
			if (temp > maxLen) {
				maxLen = temp;
			}
			input[temp]++;
		}

		// found range of pair
		minLen *= 2;
		maxLen *= 2;

		fenceHeight = new int[maxLen + 1];
		int maxLength = 0;

		for (int i = minLen; i <= maxLen; i++) {
			int counter = 0;
			for (int ii = 1; ii < i; ii++) {
				if (ii > 2000) {
					break;
				}
				if (!(i - ii > 2000)) {
					counter += Math.min(input[ii], input[i - ii]);
				}

			}
			counter /= 2;
			// if (counter > 0) {
			// System.out.printf("counter for length %d is %d\n", i, counter);
			// }
			fenceHeight[i] = counter;
			if (counter > maxLength) {
				maxLength = counter;
			}
		}

		int rep = 0;
		for (int i = minLen; i <= maxLen; i++) {
			if (fenceHeight[i] == maxLength) {
				rep++;
			}
		}
		System.out.println(maxLength + " " + rep);

	}

}
