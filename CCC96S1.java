package tempFolder;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC96S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int a = 1;
			int b = 0;
			ArrayList<Integer> div = new ArrayList<Integer>();

			while (a <= num) {
				if (num % a == 0) {
					b = num / a;

					if (!div.contains(a) && a != num) {
						// System.out.println(a + " is added");
						div.add(a);
					}
					if (!div.contains(b) && b != num) {
						// System.out.println(b + "is added");
						div.add(b);
					}

				}

				a++;
			}
			int sum = 0;
			for (int ii = 0; ii < div.size(); ii++) {
				sum += div.get(ii);
			}

			if (sum > num) {
				System.out.println(num + " is an abundant number.");
			} else if (sum < num) {
				System.out.println(num + " is a deficient number.");
			} else {
				System.out.println(num + " is a perfect number.");
			}

		}

	}

}
