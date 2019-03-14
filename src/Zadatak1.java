import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		System.out.print("Od koliko se redova sastoji trokut:");
		Scanner unos = new Scanner(System.in);
		int red = unos.nextInt() + 1, taj;
		for (int i = 1; i < red; i++) {

			for (int j = 1; j < red; j++) {
				if (j < i) {

					System.out.print("  ");

				} else
					System.out.print(j + " ");

			}
			System.out.println();
		}
	}

}