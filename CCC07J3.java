import java.util.Scanner;

public class CCC07J3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] temp = { 100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000 };
		// ArrayList<Integer> money = new ArrayList<Integer>();
		// for (int i = 0; i < temp.length; i++) {
		// money.add(temp[i]);
		// }

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			temp[a - 1] = 0;
		}
		int num = sc.nextInt();
		int sum = 0;
		int counter = 10;

		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
			if (temp[i] == 0) {
				counter--;
			}
		}

		num *= counter;
		if (num >= sum) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
		}
	}
}
