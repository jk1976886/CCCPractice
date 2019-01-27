import java.util.*;

public class CCC02S2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		int second = sc.nextInt();

		if (first % second == 0) {
			System.out.println(first / second);
		} else {

			int fracTop = first % second;
			int fracBot = second;

			for (int i = fracBot; i > 0; i--) {
				if (fracTop % i == 0 && fracBot % i == 0) {
					fracTop /= i;
					fracBot /= i;
					break;
				}
			}

			if (first / second == 0) {
				System.out.println(fracTop + "/" + fracBot);
			} else {

				System.out.println(first / second + " " + fracTop + "/" + fracBot);
			}
		}

	}
}
