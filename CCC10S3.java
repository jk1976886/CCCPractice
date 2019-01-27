import java.util.Arrays;
import java.util.Scanner;

//
//
// THIS
// PROGRAM
// DOES
// NOT
// WORK
//
//

public class CCC10S3 {

	public static int[] house;
	public static int k, h;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();

		int[] houseTemp = new int[h];
		for (int i = 0; i < h; i++) {
			houseTemp[i] = sc.nextInt();
		}

		k = sc.nextInt();
		Arrays.sort(houseTemp);

		int[] dist = new int[h];

		for (int i = 0; i < h; i++) {
			if (i == h - 1) {
				dist[i] = 1000000 - houseTemp[i];
			} else {
				dist[i] = houseTemp[i + 1] - houseTemp[i];
			}
		}

		int max = Integer.MIN_VALUE;
		int ind = 0;
		for (int i = 0; i < h; i++) {
			if (dist[i] > max) {
				max = dist[i];
				ind = i;
			}
		}

		house = new int[h];

		if (ind != h - 1) {
			int x = 0;
			for (int i = ind + 1; i < h; i++, x++) {
				house[x] = houseTemp[i];
			}
			for (int i = 0; i <= ind; i++, x++) {
				house[x] = houseTemp[i];
			}
		} else {
			for (int i = 0; i < h; i++) {
				house[i] = houseTemp[i];
			}
		}

		// house is the sorted, longest distance eliminated house addresses
		// k is k
		max = Math.abs(house[0] - house[h - 1]);
		int min = 1;
		int reHol = 0;

		while (true) {
			// System.out.println("hi");
			if (max <= min) {
				break;
			}
			int mid = (max + min) / 2;
			reHol = check(mid);
			if (reHol == -1) {
				min = mid + 1;
			} else {
				max = mid;
			}

		}
		// int dHol = max;
		// // reHol = check(dHol);
		// while (true) {
		// if (reHol != 0) {
		// break;
		// } else {
		// dHol--;
		// reHol = check(dHol);
		// }
		// }
		System.out.println((int) ((max) / 2) + max % 2);

	}

	// too big: return 1
	// too small: return -1
	// works: return 0;

	public static int check(int dia) {
		int tempK = 0;
		int cur = 0;
		int index = 0;
		while (cur < h) {
			while (cur < h && index < h && house[cur] + dia >= house[index]) {
				index++;
			}
			tempK++;
			cur = index;
		}

		if (tempK > k) {
			return -1;
		} else if (tempK < k) {
			return 1;
		} else {
			return 0;
		}
	}
}
