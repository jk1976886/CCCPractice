import java.math.BigInteger;
import java.util.Scanner;

public class CCC96S2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			BigInteger num = new BigInteger(line);
			int length = num.toString().length();

			for (int ii = 0; ii < length - 1; ii++) {
				System.out.println(num.toString());
				int last = Integer.parseInt(Character.toString(num.toString().charAt(num.toString().length() - 1)));
				num = new BigInteger(line.substring(0, line.length() - ii - 1));
				num = num.subtract(BigInteger.valueOf(last));

			}
			int holder = num.intValue();
			if (holder % 11 == 0) {
				System.out.println("The number " + line + " is divisible by 11.");

			} else {
				System.out.println("The number " + line + " is not divisible by 11.");
			}
		}
	}
}
