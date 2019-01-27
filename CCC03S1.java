import java.util.*;

public class CCC03S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pos = 1;
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("You Quit!");
				break;
			}

			pos += n;

			if (pos == 9) {
				pos = 34;
				System.out.println("You are now on square " + pos);
			} else if (pos == 40) {
				pos = 64;
				System.out.println("You are now on square " + pos);
			} else if (pos == 67) {
				pos = 86;
				System.out.println("You are now on square " + pos);
			} else if (pos == 54) {
				pos = 19;
				System.out.println("You are now on square " + pos);
			} else if (pos == 90) {
				pos = 48;
				System.out.println("You are now on square " + pos);
			} else if (pos == 99) {
				pos = 77;
				System.out.println("You are now on square " + pos);
			} else if (pos == 100) {
				System.out.println("You are now on square " + pos);
				System.out.println("You Win!");
				break;
			} else if (pos > 100) {
				pos -= n;
				System.out.println("You are now on square " + pos);
			} else {
				System.out.println("You are now on square " + pos);
			}

		}

	}

}
