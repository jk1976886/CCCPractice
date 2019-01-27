import java.util.Arrays;
import java.util.Scanner;

public class CCC16S2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int question = sc.nextInt();
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		if (question == 2) {
			rev(b);
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.max(a[i], b[i]);
		}

		System.out.println(ans);

	}

	public static void rev(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}
