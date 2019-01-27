import java.util.*;

public class CCC00S1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qua = sc.nextInt();
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int counter = 0;

		while (true) {

			first++;
			counter++;
			qua--;
			if (qua <= 0) {
				break;
			}
			if (first == 35) {
				// System.out.printf("first %d", counter);
				first = 0;
				qua += 30;
			}

			second++;
			counter++;
			qua--;
			if (qua <= 0) {
				break;
			}
			if (second == 100) {
				// System.out.printf("second %d", counter);
				second = 0;
				qua += 60;
			}

			third++;
			counter++;
			qua--;
			if (qua <= 0) {
				break;
			}
			if (third == 10) {
				// System.out.printf("third %d", counter);
				third = 0;
				qua += 9;
			}

		}

		System.out.printf("Martha plays %d times before going broke.", counter);

	}
}
