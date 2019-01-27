import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC00S4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		int clubNum = sc.nextInt();
		ArrayList<Integer> clubs = new ArrayList<Integer>();

		for (int i = 0; i < clubNum; i++) {
			clubs.add(sc.nextInt());
		}

		Collections.sort(clubs);
		int counter = 0;
		boolean[] step = new boolean[distance + 1];
		step[0] = true;

		while (!step[distance] && counter <= (distance / clubs.get(0) + 1)) {

			for (int i = distance; i >= 0; i--) {

				if (step[i]) {

					step[i] = false;

					for (int ii = 0; ii < clubNum; ii++) {

						if ((i + clubs.get(ii)) <= distance) {

							step[i + clubs.get(ii)] = true;
						}
					}
				}
			}

			counter++;
		}

		if (step[distance]) {
			System.out.println("Roberta wins in " + counter + " strokes.");
		} else {
			System.out.println("Roberta acknowledges defeat.");
		}
	}
}
