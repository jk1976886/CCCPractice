import java.util.*;

public class CCC11S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[] stu = new char[N];
		char[] ans = new char[N];
		int counter = 0;

		for (int i = 0; i < N; i++) {
			stu[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < N; i++) {
			char temp = sc.next().charAt(0);
			if (temp == stu[i]) {
				counter++;
			}
		}

		System.out.println(counter);

	}

}
