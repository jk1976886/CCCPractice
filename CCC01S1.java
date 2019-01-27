import java.util.*;

public class CCC01S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList<Character> C = new ArrayList<Character>();
		ArrayList<Character> D = new ArrayList<Character>();
		ArrayList<Character> H = new ArrayList<Character>();
		ArrayList<Character> S = new ArrayList<Character>();

		int cIndex = 0;
		int dIndex = 0;
		int hIndex = 0;
		int sIndex = 0;

		int cPts = 0;
		int dPts = 0;
		int hPts = 0;
		int sPts = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'C') {
				cIndex = i;
			} else if (input.charAt(i) == 'D') {
				dIndex = i;
			} else if (input.charAt(i) == 'H') {
				hIndex = i;
			} else if (input.charAt(i) == 'S') {
				sIndex = i;
			}
		}
		int counter = 0;
		for (int i = cIndex + 1; i < dIndex; i++) {
			if (input.charAt(i) == 'A') {
				cPts += 4;
			} else if (input.charAt(i) == 'K') {
				cPts += 3;
			} else if (input.charAt(i) == 'Q') {
				cPts += 2;
			} else if (input.charAt(i) == 'J') {
				cPts += 1;
			}

			C.add(input.charAt(i));
		}

		if (C.size() == 0) {
			cPts += 3;
		} else if (C.size() == 1) {
			cPts += 2;
		} else if (C.size() == 2) {
			cPts += 1;
		}

		counter = 0;

		for (int i = dIndex + 1; i < hIndex; i++) {
			if (input.charAt(i) == 'A') {
				dPts += 4;
			} else if (input.charAt(i) == 'K') {
				dPts += 3;
			} else if (input.charAt(i) == 'Q') {
				dPts += 2;
			} else if (input.charAt(i) == 'J') {
				dPts += 1;
			}
			D.add(input.charAt(i));
		}

		if (D.size() == 0) {
			dPts += 3;
		} else if (D.size() == 1) {
			dPts += 2;
		} else if (D.size() == 2) {
			dPts += 1;
		}
		counter = 0;

		for (int i = hIndex + 1; i < sIndex; i++) {
			if (input.charAt(i) == 'A') {
				hPts += 4;
			} else if (input.charAt(i) == 'K') {
				hPts += 3;
			} else if (input.charAt(i) == 'Q') {
				hPts += 2;
			} else if (input.charAt(i) == 'J') {
				hPts += 1;
			}
			H.add(input.charAt(i));
		}
		if (H.size() == 0) {
			hPts += 3;
		} else if (H.size() == 1) {
			hPts += 2;
		} else if (H.size() == 2) {
			hPts += 1;
		}
		counter = 0;

		for (int i = sIndex + 1; i < input.length(); i++) {
			if (input.charAt(i) == 'A') {
				sPts += 4;
			} else if (input.charAt(i) == 'K') {
				sPts += 3;
			} else if (input.charAt(i) == 'Q') {
				sPts += 2;
			} else if (input.charAt(i) == 'J') {
				sPts += 1;
			}
			S.add(input.charAt(i));
		}
		if (S.size() == 0) {
			sPts += 3;
		} else if (S.size() == 1) {
			sPts += 2;
		} else if (S.size() == 2) {
			sPts += 1;
		}

		System.out.println("Cards Dealt              Points");

		System.out.print("Clubs ");
		for (int i = 0; i < C.size(); i++) {
			System.out.print(C.get(i) + " ");
		}
		System.out.print("\t\t" + cPts);
		System.out.println();

		System.out.print("Diamonds ");
		for (int i = 0; i < D.size(); i++) {
			System.out.print(D.get(i) + " ");
		}
		System.out.print("\t\t" + dPts);
		System.out.println();

		System.out.print("Hearts ");
		for (int i = 0; i < H.size(); i++) {
			System.out.print(H.get(i) + " ");
		}
		System.out.print("\t\t" + hPts);
		System.out.println();

		System.out.print("Spades ");
		for (int i = 0; i < S.size(); i++) {
			System.out.print(S.get(i) + " ");
		}
		System.out.print("\t\t" + sPts);
		System.out.println();
		System.out.println("Total " + (cPts + dPts + hPts + sPts));

	}

}
