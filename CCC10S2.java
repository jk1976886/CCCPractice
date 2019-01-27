import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC10S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		Map<String, String> decode = new HashMap<>();
		sc.nextLine();
		for (int i = 0; i < k; i++) {
			String[] line = sc.nextLine().split(" ");

			decode.put(line[1], line[0]);
		}
		String input = sc.next();
		int counter = 0;
		String temp = "";
		while (counter < input.length()) {
			temp += Character.toString(input.charAt(counter));
			if (decode.containsKey(temp)) {
				System.out.print(decode.get(temp));
				temp = "";
			}
			counter++;
		}

	}

}
