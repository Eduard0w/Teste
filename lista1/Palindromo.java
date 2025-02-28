package lista1;

import java.util.Scanner;

public class Palindromo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String S;
		boolean eh;
		
		S = t.nextLine();
		
		String[] A = S.split("");
		if(A.length >= 1 && A.length <= 100) {
			eh = palindromo(A);
		}else {
			return;
		}
		if(eh = true) {
			System.out.println("SIM");
		}else {
			System.out.println("NÃO");
		}
		System.out.println(eh);
		
		
		t.close();

	}

	public static boolean palindromo(String[] P) {
		String[] t = new String[P.length];
		boolean eh = false;
		int i = 0;
		for(int k = 0; k < P.length; k++) {
			t[k] = P[k];
		}
			for(int j=P.length-1; j >= 0; j--) {
				if(!P[i].equals(t[j])) {
					eh = false;
					break;
				}
				else {
					eh = true;
					i++;
				}
			}
		return eh;
	}
}
