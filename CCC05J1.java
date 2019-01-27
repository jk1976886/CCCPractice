import java.util.*;

public class CCC05J1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double AMor = 0.25;
		double AEve = 0.15;
		double AWee = 0.20;

		double BMor = 0.45;
		double BEve = 0.35;
		double BWee = 0.25;

		int Mor = sc.nextInt();
		int Eve = sc.nextInt();
		int Wee = sc.nextInt();

		double Aprice = 0;
		double Bprice = 0;

		if (Mor - 100 > 0) {
			Aprice += AMor * (Mor - 100);
		}
		if (Mor - 250 > 0) {
			Bprice += BMor * (Mor - 250);
		}

		Aprice += Eve * AEve;
		Bprice += Eve * BEve;

		Aprice += Wee * AWee;
		Bprice += Wee * BWee;

		Aprice *= 100;
		Bprice *= 100;

		Aprice = Math.round(Aprice);
		Bprice = Math.round(Bprice);

		Aprice /= 100;
		Bprice /= 100;

		System.out.println("Plan A costs " + Aprice);
		System.out.println("Plan B costs " + Bprice);

		if (Aprice > Bprice) {
			System.out.println("Plan B is cheapest.");
		} else if (Bprice > Aprice) {
			System.out.println("Plan A is cheapest.");
		} else {
			System.out.println("Plan A and B are the same price.");
		}

	}

}
