import java.util.*;

public class CCC07S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();

			if (y < 1989) {
				System.out.println("Yes");
			} else if (y == 1989) {
				if (m < 2) {
					System.out.println("Yes");
				} else if (m == 2) {
					if (d <= 27) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}

		}

	}

}
