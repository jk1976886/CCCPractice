import java.util.*;

public class CCC08S2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int r = sc.nextInt();
			int counter = 0;

			if (r == 0) {
				break;

			} else {

				for (int i = 2; i <= r - 1; i++) {
					for (int ii = r - 1; ii >= r - i + 1; ii--) {
						// System.out.println(i + "," + ii);
						if (i * i + ii * ii <= r * r) {
							counter++;
						}
					}

				}

				counter *= 4;

				counter += r * r + (r + 1) * (r + 1);
				System.out.println(counter);
			}
		}

		// TLE for last case

		/*
		 * while (true) { int r = sc.nextInt(); int counter = 0; if (r == 0) { break; }
		 * else { for (int x = 1; x <= r; x++) { for (int y = 1; y <= r; y++) { if (x *
		 * x + y * y <= r * r) { counter++; } } }
		 * 
		 * counter *= 4; counter += r * 4 + 1; System.out.println(counter);
		 * 
		 * } }
		 */

	}

}
