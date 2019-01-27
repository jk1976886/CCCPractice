import java.util.*;

public class CCC13S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int begin = sc.nextInt();
		int num = begin + 1;
		int[] digit;

		boolean valid = true;
		while (true) {
			valid = true;
			// System.out.println(num);
			if (num < 10) {
				digit = new int[1];
			} else if (num < 100) {
				digit = new int[2];
			} else if (num < 1000) {
				digit = new int[3];
			} else if (num < 10000) {
				digit = new int[4];
			} else {
				digit = new int[5];
			}

			for (int i = 0; i < digit.length; i++) {
				//System.out.println(num % 10);
				digit[i] = num % 10;
				num /= 10;
			}
			for (int i = 0; i < digit.length; i++) {
				for (int ii = i + 1; ii < digit.length; ii++) {
					if (digit[i] == digit[ii]) {
						valid = false;
					}
				}
			}

			if (valid) {
				System.out.println(begin + 1);
				break;
			} else {
				begin++;
				num = begin + 1;
			}
		}

	}

}
