import java.util.Scanner;

public class CCC04S1_SecondWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			String a = sc.next();
			String b = sc.next();
			String c = sc.next();

			if (a.startsWith(b) || a.startsWith(c) || b.startsWith(a) || b.startsWith(c) || c.startsWith(a)
					|| c.startsWith(b) || a.endsWith(b) || a.endsWith(c) || b.endsWith(a) || b.endsWith(c)
					|| c.endsWith(a) || c.endsWith(b)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		}

	}

}
