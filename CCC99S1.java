import java.util.*;

public class CCC99S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = new String[52];

		for (int i = 0; i < 52; i++) {
			input[i] = sc.nextLine();
		}
		int one = 0;
		int two = 0;

		for (int i = 0; i < 52; i++) {
			if (input[i].equals("ace") && i < 48) {
				boolean temp = true;
				for (int ii = i + 1; ii <= i + 4; ii++) {
					if (input[ii].equals("ace") || input[ii].equals("king") || input[ii].equals("queen")
							|| input[ii].equals("jack")) {
						temp = false;
					}
				}
				if (temp) {
					if (i % 2 == 0) {
						System.out.printf("Player A scores %d point(s).\n", 4);
						one += 4;
					} else {
						System.out.printf("Player B scores %d point(s).\n", 4);
						two += 4;
					}
				}
			} else if (input[i].equals("king") && i < 49) {
				boolean temp = true;
				for (int ii = i + 1; ii <= i + 3; ii++) {
					if (input[ii].equals("ace") || input[ii].equals("king") || input[ii].equals("queen")
							|| input[ii].equals("jack")) {
						temp = false;
					}
				}
				if (temp) {
					if (i % 2 == 0) {
						System.out.printf("Player A scores %d point(s).\n", 3);
						one += 3;
					} else {
						System.out.printf("Player B scores %d point(s).\n", 3);
						two += 3;
					}
				}
			} else if (input[i].equals("queen") && i < 50) {
				boolean temp = true;
				for (int ii = i + 1; ii <= i + 2; ii++) {
					if (input[ii].equals("ace") || input[ii].equals("king") || input[ii].equals("queen")
							|| input[ii].equals("jack")) {
						temp = false;
					}
				}
				if (temp) {
					if (i % 2 == 0) {
						System.out.printf("Player A scores %d point(s).\n", 2);
						one += 2;
					} else {
						System.out.printf("Player B scores %d point(s).\n", 2);
						two += 2;
					}
				}
			} else if (input[i].equals("jack") && i < 51) {
				boolean temp = true;
				for (int ii = i + 1; ii <= i + 1; ii++) {
					if (input[ii].equals("ace") || input[ii].equals("king") || input[ii].equals("queen")
							|| input[ii].equals("jack")) {
						temp = false;
					}
				}
				if (temp) {
					if (i % 2 == 0) {
						System.out.printf("Player A scores %d point(s).\n", 1);
						one += 1;
					} else {
						System.out.printf("Player B scores %d point(s).\n", 1);
						two += 1;
					}
				}
			}
		}

		System.out.printf("Player A: %d point(s).\n", one);
		System.out.printf("Player B: %d point(s).\n", two);

	}

}
