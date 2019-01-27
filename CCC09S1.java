import java.util.Scanner;

public class CCC09S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int counter = 0;
		for (int i = 0; Math.pow(i, 6) <= b; i++) {
			if (Math.pow(i, 6) >= a) {
				counter++;
			}
		}

		System.out.println(counter);

	}

}
