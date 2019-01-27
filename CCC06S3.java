import java.util.ArrayList;
import java.util.Scanner;

public class CCC06S3 {

	static class building {
		int cornerAmt;
		ArrayList<int[]> corners;

		public building(int ca, ArrayList<int[]> c) {
			cornerAmt = ca;
			corners = c;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int n = sc.nextInt();
		building[] bui = new building[n];

		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			ArrayList<int[]> temp = new ArrayList<>();
			for (int ii = 0; ii < c; ii++) {
				int[] hol = new int[2];
				hol[0] = sc.nextInt();
				hol[1] = sc.nextInt();
				temp.add(hol);
			}

			bui[i] = new building(c, temp);

		}
		int counter = 0;
		for (int i = 0; i < n; i++) {
			// check first and last pair side
			int[] a = bui[i].corners.get(0);
			int aX = a[0];
			int aY = a[0];

			int[] b = bui[i].corners.get(bui[i].cornerAmt - 1);
			int bX = b[0];
			int bY = b[0];
			if (!intersect(aX, aY, bX, bY, x1, y1, x2, y2)) {
				// check sides except the first and last
				for (int ii = 0; ii < bui[i].cornerAmt - 1; ii++) {
					int[] cur = bui[i].corners.get(ii);
					int curX = cur[0];
					int curY = cur[1];

					int[] next = bui[i].corners.get(ii + 1);
					int nextX = cur[0];
					int nextY = cur[1];

					if (intersect(curX, curY, nextX, nextY, x1, y1, x2, y2)) {
						counter++;
						break;
					}

				}
			} else {
				counter++;
			}
		}

		System.out.println(counter);

	}

	public static int intX, intY;

	public static boolean intersect(int buiX1, int buiY1, int buiX2, int buiY2, int x1, int y1, int x2, int y2) {
		// check horizontal / vertical

		// check parallel

		// check actual intersection
		// find double m1 m2 b1 b2
		// find double intX = (b2-b1)/(m1-m2)
		// find double intY = m1*intX + b1

		// return true if intersection X,Y are in bound
		// otherwise, return false

		return false;
	}

}
