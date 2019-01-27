import java.util.*;

public class CCC01S2 {

	public static void main(String[] args) {
		// THIS PROGRAM DOES NOT WORK
		// THIS PROGRAM DOES NOT WORK
		// THIS PROGRAM DOES NOT WORK
		// THIS PROGRAM DOES NOT WORK
		// THIS PROGRAM DOES NOT WORK
		// THIS PROGRAM DOES NOT WORK
		Scanner sc = new Scanner(System.in);
		int beg = sc.nextInt();
		int end = sc.nextInt();

		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < (int) Math.sqrt(end); i++) {
			output.add(new ArrayList<Integer>());
			for (int ii = 0; ii < Math.sqrt(end - beg); ii++) {
				output.get(i).add(null);
			}
		}

		int x = (int) (output.size() / 2);
		int y = (int) ((Math.sqrt(end - beg) - 1) / 2);
		System.out.println(x + " " + y);

		for (int i = beg; i <= end; i++) {
			if (output.get(x).get(y) == null) {
				output.get(x).set(y, i);
			} else {

			}

		}

	}

}
