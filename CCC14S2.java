import java.util.*;

public class CCC14S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean valid = true;

		int N = sc.nextInt();
		String[] input1 = new String[N];
		String[] input2 = new String[N];

		for (int i = 0; i < N; i++) {
			input1[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			input2[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			String temp1 = input1[i];
			String temp2 = input2[i];
			// System.out.println("checking " + temp1 + " with " + temp2);
			int index = 0;

			for (int ii = 0; ii < N; ii++) {
				if (input2[ii].equals(temp1)) {
					// System.out.println("looking for " + temp1);
					index = ii;
					break;
				}
			}

			// System.out.println("index is: " + index);

			if (!input1[index].equals(temp2) || temp1.equals(temp2)) {
				// System.out.println(temp1 + " unmatch " + temp2);
				valid = false;
				break;
			}

		}

		if (valid) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}

	}

}
