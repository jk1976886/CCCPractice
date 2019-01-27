import java.util.ArrayList;
import java.util.Scanner;

public class CCC10J4 {

	public static ArrayList<Integer> ans = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			} else if (n == 1) {
				int a = sc.nextInt();
				ans.add(0);
			} else if (n == 2) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				ans.add(1);
			} else if (n == 3) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if (b - a == c - b) {
					ans.add(1);
				} else {
					ans.add(2);
				}
			} else {
				int[] input = new int[n];
				int[] diff = new int[n - 1];
				// gathering input into input[]
				for (int i = 0; i < n; i++) {
					input[i] = sc.nextInt();
				}
				// gathering difference into diff[]
				for (int i = 0; i < n - 1; i++) {
					diff[i] = input[i + 1] - input[i];
				}
				int counter = 0;
				for (int i = 1; i < diff.length; i++) {
					if (diff[0] == diff[i]) {
						counter++;
					}
				}

				if (counter == diff.length - 1) {
					ans.add(1);
				} else {
					for (int i = 1; i <= diff.length; i++) {
						// System.out.println("i is: " + i);
						if (check(diff, i)) {
							break;
						}
					}
				}

			}
		}
		
		for(int i = 0; i<ans.size(); i++) {
			System.out.println(ans.get(i));
		}

	}

	public static boolean check(int[] diff, int length) {
		if (diff.length - length >= length) {

			int numOfArr = (int) diff.length / length;
			int[] subArr1, subArr2, subArr3;

			if (numOfArr > 2) {
				// System.out.println("numOfArr > 2");
				subArr1 = new int[length];
				subArr2 = new int[length];
				subArr3 = new int[length];

				int counter1 = 0;
				int counter2 = 0;
				int counter3 = 0;

				for (int i = 0; i < length; i++) {
					subArr1[i] = diff[i];
					subArr2[i] = diff[i + length];
					subArr3[i] = diff[i + length + length];
				}

				for (int i = 0; i < subArr1.length; i++) {
					if (subArr1[i] == subArr2[i]) {
						counter1++;
					}
					if (subArr2[i] == subArr3[i]) {
						counter2++;
					}
					if (subArr1[i] == subArr3[i]) {
						counter3++;
					}

				}

				if (counter1 == subArr1.length && counter2 == counter1 && counter3 == counter1) {
					ans.add(length);
					return true;
				} else {
					// System.out.println("none");
					return false;
				}

			} else {
				// System.out.println("numOfArr = 2");
				subArr1 = new int[length];
				subArr2 = new int[length];

				int counter = 0;

				for (int i = 0; i < length; i++) {
					subArr1[i] = diff[i];
					subArr2[i] = diff[i + length];
				}

				for (int i = 0; i < subArr1.length; i++) {
					if (subArr1[i] == subArr2[i]) {
						counter++;
					}
				}

				if (counter == subArr1.length) {
					ans.add(length);
					return true;
				} else {
					// System.out.println("none");
					return false;
				}
			}

		} else {
			// System.out.println("numOfArr < 2");
			int[] subArr1 = new int[diff.length - length];
			int[] subArr2 = new int[diff.length - length];
			int counter = 0;

			for (int i = 0; i < diff.length - length; i++) {
				subArr1[i] = diff[i];
				subArr2[i] = diff[i + length];
			}

			for (int i = 0; i < subArr1.length; i++) {
				// System.out.println("sub 1: " + subArr1[i]);
				// System.out.println("sub 2: " + subArr2[i]);
				if (subArr1[i] == subArr2[i]) {
					counter++;
				}
			}

			if (counter == subArr1.length) {
				ans.add(length);
				return true;
			} else {
				// System.out.println("none");
				return false;
			}

		}
	}

}
