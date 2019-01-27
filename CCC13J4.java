import java.util.*;

public class CCC13J4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int counter = 0;
		int[] task = new int[c];
		for (int i = 0; i < c; i++) {
			task[i] = sc.nextInt();
		}

		Arrays.sort(task);
		for (int i = 0; i < c; i++) {
			sum += task[i];
			// System.out.println("task is: " + task[i]);
			if (sum == t) {
				counter++;
				break;
			} else if (sum > t) {
				break;
			}
			// System.out.println("counter is" + counter);
			counter++;
		}

		System.out.println(counter);

	}

}
