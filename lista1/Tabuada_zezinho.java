package lista1;

import java.util.Scanner;

public class Tabuada_zezinho {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n;
		
		n=t.nextInt();
		
		for(int i=0; i<=100; i++) {
			System.out.println(i*n);
		}
		t.close();
	}
}
