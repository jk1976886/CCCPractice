import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC10S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n != 0) {
			if (n == 1) {
				String name = sc.next();
				System.out.println(name);
			} else {
				int perf1 = 0;
				int perf2 = 0;
				String name1 = "";
				String name2 = "";

				for (int i = 0; i < n; i++) {
					String name = sc.next();
					int R = sc.nextInt();
					int S = sc.nextInt();
					int D = sc.nextInt();
					int perf = 2 * R + 3 * S + D;
					if (perf > perf2) {
						perf2 = perf;
						name2 = name;
					}
					if (perf2 > perf1) {
						perf2 = perf1;
						name2 = name1;
						perf1 = perf;
						name1 = name;
					}
					if (perf2 == perf1) {
						if (name2.charAt(0) < name1.charAt(0)) {
							perf2 = perf1;
							name2 = name1;
							perf1 = perf;
							name1 = name;
						}
					}

				}

				System.out.println(name1);
				System.out.println(name2);
			}
		}
	}

}
