import java.util.*;

public class CCC00S2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] waterfall = new int[100];
		for (int i = 0; i < n; i++) {
			waterfall[i] = sc.nextInt();
		}

		while (true) {
			int input = sc.nextInt();
			if (input == 77) {
				break;
			} else if (input == 88) {
				int stream = sc.nextInt();
				waterfall[stream - 1] += waterfall[stream];
				n--;
				for (int i = n; i > stream; i--) {
					waterfall[i - 1] = waterfall[i];
				}
				waterfall[n] = 0;
			} else if (input == 99) {
				int stream = sc.nextInt();
				int left = sc.nextInt();
				int right = 100 - left;
				int temp = waterfall[stream - 1];
				n++;
				for (int i = n; i > stream; i--) {
					waterfall[i] = waterfall[i - 1];
				}
				waterfall[stream - 1] = temp * left / 100;
				waterfall[stream] = temp * right / 100;
			}
		}
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(waterfall[i]);
			} else {
				System.out.print(waterfall[i] + " ");
			}
		}
	}

}
