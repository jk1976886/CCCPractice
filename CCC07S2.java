import java.util.*;

public class CCC07S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] box = new int[n][3];
		int[] boxVol = new int[n];
		for (int i = 0; i < n; i++) {
			box[i][0] = sc.nextInt();
			box[i][1] = sc.nextInt();
			box[i][2] = sc.nextInt();
			Arrays.sort(box[i]);
			boxVol[i] = vol(box[i]);
		}

		int m = sc.nextInt();
		int[][] item = new int[m][3];
		int[] itemVol = new int[m];
		for (int i = 0; i < m; i++) {
			item[i][0] = sc.nextInt();
			item[i][1] = sc.nextInt();
			item[i][2] = sc.nextInt();
			Arrays.sort(item[i]);
			itemVol[i] = vol(item[i]);
		}

		int tempCounter = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			for (int ii = 0; ii < n; ii++) {
				if (itemVol[i] <= boxVol[ii]) {
					if (item[i][0] <= box[ii][0] && item[i][1] <= box[ii][1] && item[i][2] <= box[ii][2]) {
						if (boxVol[ii] < tempCounter) {
							tempCounter = boxVol[ii];
						}
					}
				}
			}

			if (tempCounter < Integer.MAX_VALUE) {
				System.out.println(tempCounter);
			} else {
				System.out.println("Item does not fit.");
			}
			tempCounter = Integer.MAX_VALUE;

		}

	}

	public static int vol(int[] dim) {
		return dim[0] * dim[1] * dim[2];
	}

}
