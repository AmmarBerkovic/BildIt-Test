import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		System.out.println("Unesi string");
		Scanner unos=new Scanner (System.in);
		String str=unos.next();
		System.out.println("zatim karakter");
		String ch=unos.next();
		char karakter=ch.charAt(0);
		int index=0;
		for (int i = 0; i < str.length(); i++) {
			if(karakter==str.charAt(i)) {
				index=i;
			}
		}
		System.out.println("Zadnji karakter je "+index);
	}

}
