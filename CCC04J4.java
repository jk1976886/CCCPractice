import java.util.*;

public class CCC04J4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String key = sc.nextLine();
		String line = sc.nextLine();
		String let = "";

		ArrayList<ArrayList<Integer>> dis = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> dis2 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < key.length(); i++) {
			dis.add(new ArrayList<Integer>());
			dis2.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) >= 65 && line.charAt(i) <= 90) {
				let += line.charAt(i);
			}
		}

		for (int i = 0; i < let.length(); i++) {
			dis.get(i % key.length()).add((int) let.charAt(i));
		}

		for (int i = 0; i < dis.size(); i++) {
			int shift = key.charAt(i) - 65;

			for (int ii = 0; ii < dis.get(i).size(); ii++) {
				int temp = 0;
				if (dis.get(i).get(ii) + shift > 90) {
					dis2.get(i).add(dis.get(i).get(ii) + shift - 26);
					// System.out.print((char) (dis.get(i).get(ii) + shift - 26));
				} else {
					dis2.get(i).add(dis.get(i).get(ii) + shift);
					// System.out.print((char) (dis.get(i).get(ii) + shift));
				}

			}
			// System.out.println();
		}

		int index = 0;

		for (int i = 0; i < let.length(); i++) {

			if (i % key.length() == 0 && i != 0) {
				index++;
			}

			System.out.print((char) dis2.get(i % key.length()).get(index).intValue());
		}

	}

}
