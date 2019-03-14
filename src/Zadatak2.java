import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		System.out.print("Unesi neki broj: ");
		Scanner unos=new Scanner (System.in);
		int broj=unos.nextInt(),pomocni,sum=0,taj;
		taj=broj;
		List<Integer> list=new ArrayList<>();
		do {
			pomocni=broj%10;
			broj=broj/10;
			list.add(pomocni);
		}while(broj!=0);
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i+=2) {
			sum+=list.get(i);
		}
		System.out.println("Suma svih neparnih pozicija broja "+taj+" je: "+sum);
	}

}
