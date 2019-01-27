import java.util.*;

public class CCC03S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {

			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			String d = sc.nextLine();

			String[] last = new String[4];

			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			// System.out.println(d);

			last[0] = a.split(" ")[a.split(" ").length - 1].toLowerCase();
			last[1] = b.split(" ")[b.split(" ").length - 1].toLowerCase();
			last[2] = c.split(" ")[c.split(" ").length - 1].toLowerCase();
			last[3] = d.split(" ")[d.split(" ").length - 1].toLowerCase();

			for (int ii = 0; ii < 4; ii++) {
				int counter = 0;

				for (int iii = last[ii].length() - 1; iii >= 0; iii--) {
					if (last[ii].charAt(iii) == 'a' || last[ii].charAt(iii) == 'e' || last[ii].charAt(iii) == 'i'
							|| last[ii].charAt(iii) == 'o' || last[ii].charAt(iii) == 'u') {
						counter = iii;
						break;
					}
				}

				if (counter != 0) {
					last[ii] = last[ii].substring(counter, last[ii].length());
				}

			}

			// System.out.println(last[0] + " " + last[1] + " " + last[2] + " " + last[3]);

			if (last[0].equals(last[1]) && last[1].equals(last[2]) && last[2].equals(last[3])) {
				System.out.println("perfect");
			} else if (last[0].equals(last[1]) && last[2].equals(last[3])) {
				System.out.println("even");
			} else if (last[0].equals(last[2]) && last[1].equals(last[3])) {
				System.out.println("cross");
			} else if (last[0].equals(last[3]) && last[1].equals(last[2])) {
				System.out.println("shell");
			} else {
				System.out.println("free");
			}

			// sc.nextLine();
		}

	}

}
