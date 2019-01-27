import java.util.*;

public class CCC04S1_FirstWay {

	public static String a, b, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			a = sc.next();
			b = sc.next();
			c = sc.next();

			if (check()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}

	public static boolean check() {
		int index = 0;

		if (a.length() > b.length()) {
			if (a.substring(0, b.length()).equals(b)) {
				return false;
			} else if (a.substring(a.length() - b.length(), a.length()).equals(b)) {
				return false;
			}
		}

		if (a.length() > c.length()) {
			if (a.substring(0, c.length()).equals(c)) {
				return false;
			} else if (a.substring(a.length() - c.length(), a.length()).equals(c)) {
				return false;
			}
		}

		if (b.length() > a.length()) {
			if (b.substring(0, a.length()).equals(a)) {
				return false;
			} else if (b.substring(b.length() - a.length(), b.length()).equals(a)) {
				return false;
			}
		}

		if (b.length() > c.length()) {
			if (b.substring(0, c.length()).equals(c)) {
				return false;
			} else if (b.substring(b.length() - c.length(), b.length()).equals(c)) {
				return false;
			}
		}

		if (c.length() > a.length()) {
			if (c.substring(0, a.length()).equals(a)) {
				return false;
			} else if (c.substring(c.length() - a.length(), c.length()).equals(a)) {
				return false;
			}
		}

		if (c.length() > b.length()) {
			if (c.substring(0, b.length()).equals(b)) {
				return false;
			} else if (c.substring(c.length() - b.length(), c.length()).equals(b)) {
				return false;
			}
		}

		if (a.length() == b.length()) {
			if (a.equals(b)) {
				return false;
			}
		}

		if (a.length() == c.length()) {
			if (a.equals(c)) {
				return false;
			}
		}

		if (c.length() == b.length()) {
			if (c.equals(b)) {
				return false;
			}
		}
		
		return true;
	}

}
