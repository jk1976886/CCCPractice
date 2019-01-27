import java.util.*;

public class CCC06S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String eng = sc.nextLine();
		String code = sc.nextLine();
		String decode = sc.nextLine();
		HashMap<Character, Character> enc = new HashMap<Character, Character>();

		for (int i = 0; i < code.length(); i++) {
			if (enc.get(code.charAt(i)) == null) {
				enc.put(code.charAt(i), eng.charAt(i));
			}
		}

		for (int i = 0; i < decode.length(); i++) {
			if (enc.get(decode.charAt(i)) == null) {
				System.out.print(".");
			} else {
				System.out.print(enc.get(decode.charAt(i)));
			}
		}

	}

}
