
public class Zadatak3 {

	public static void main(String[] args) {
		//counter brojac redova
		//brojac brojac ispisa u jednom redu
		int brojac=1,broj=0;
		System.out.print(1+" ");
		vanjska :for (int i = 1; true; i++) {
			broj=i;
			
			for (int j = i-1; j > 1 ; j--) {
				
				if(broj%j==0) {
					break;
				}
				if(j==2) {
					System.out.print(broj+" ");
					brojac++;
					if(brojac==10 || brojac==20 || brojac==30 || brojac==40) {
						System.out.println();
					}
				}
				
			}
			if(brojac==50) {
				break vanjska;
			}
			
		}

	}

}
