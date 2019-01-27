import java.util.*;

public class CCC13S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int num = sc.nextInt();
		int[] train = new int[num];
		boolean pass = false;
		int counter = 0;
		for (int i = 0; i < num; i++) {
			train[i] = sc.nextInt();
		}

		while (train[0 + counter] <= W) {
			if (train[0 + counter] + train[1 + counter] <= W) {
				if (train[0 + counter] + train[1 + counter] + train[2 + counter] <= W) {
					if (train[0 + counter] + train[1 + counter] + train[2 + counter] + train[3 + counter] <= W) {
						counter++;
					} else {
						counter += 3;
						break;
					}
				} else {
					counter += 2;
					break;
				}

				if (counter + 3 == train.length - 1) {
					counter = num;
					break;
				}

			} else {
				counter++;
				break;
			}
		}

		System.out.println(counter);

	}

}
