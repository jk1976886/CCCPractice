import java.util.*;

public class CCC14S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> guest = new ArrayList<Integer>();
		for (int i = 0; i < K; i++) {
			//System.out.println("adding: " + (i + 1));
			guest.add(i + 1);
		}

		for (int i = 0; i < m; i++) {
			int rem = sc.nextInt();

			for (int ii = 0; ii < guest.size(); ii++) {
				if ((ii + 1) % rem == 0) {
					guest.set(ii, 0);
				}

			}
			for (int ii = 0; ii < guest.size(); ii++) {
				if (guest.get(ii) == 0) {
					guest.remove(ii);
				}
			}
		}

		for (int i = 0; i < guest.size(); i++) {
			System.out.println(guest.get(i));
		}

	}

}
