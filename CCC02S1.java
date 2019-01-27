import java.util.*;

public class CCC02S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int g = sc.nextInt();
		int r = sc.nextInt();
		int o = sc.nextInt();
		int total = sc.nextInt();
		int counter = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= total / o; i++) {
			for (int ii = 0; ii <= total / r; ii++) {
				for (int iii = 0; iii <= total / g; iii++) {
					for (int iiii = 0; iiii <= total / p; iiii++) {
						if (i * o + ii * r + iii * g + iiii * p == total) {
							System.out.println("# of PINK is " + iiii + " # of GREEN is " + iii + " # of RED is " + ii
									+ " # of ORANGE is " + i);
							counter++;
							if (i + ii + iii + iiii < min) {
								min = i + ii + iii + iiii;
							}
						}
					}
				}
			}
		}

		System.out.println("Total combinations is " + counter + ".");
		System.out.println("Minimum number of tickets to print is " + min + ".");

	}

}
