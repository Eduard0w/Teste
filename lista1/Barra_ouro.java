package lista1;

import java.util.Scanner;

public class Barra_ouro {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n, barras=0;
		
		do {
			n=t.nextInt();
			barras += n;
		}while(n!=0);
		
		System.out.println(barras);
		t.close();
	}
}
