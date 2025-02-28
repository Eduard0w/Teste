package lista1;

import java.util.Scanner;

public class Algoritmo_enigma {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n;
		String EN, PC;
		boolean TF = false;
		
		n = t.nextInt();
		t.nextLine();
		
		while(TF == false) {
		EN = t.nextLine();
		
		TF = LS(n, EN.length());
			
		if(TF == true) {
			PC = t.nextLine();
			if(EN.contains(PC)) {
				System.out.println("Palavra chave encontrada");
				break;
			}else {
				System.out.println("Nenhuma Informacao encontrada");
				break;
				}
			}else {
				TF = false;
			}
		}
		
		t.close();
	}
	
	public static boolean LS(int N, int L) {
		boolean TPF = false;
		if(L < N) {
			TPF = false;
		} else if(L == N) {
			TPF = true;
		}
		return TPF;
	}

}

// Outra maneira de se fazer 

//Scanner t = new Scanner(System.in);
//
//int n;
//String EN, PC;
//
//// Lê o número e consome a quebra de linha
//n = t.nextInt();
//t.nextLine(); // Consome o '\n' deixado pelo nextInt
//
//// Lê a string principal
//EN = t.nextLine();
//
//// Lê a palavra-chave
//PC = t.nextLine();
//
//// Verifica se a string EN tem o comprimento correto (se necessário) e se contém a palavra-chave
//if (EN.length() == n) {
//    if (EN.contains(PC)) {
//        System.out.println("Palavra chave encontrada");
//    } else {
//        System.out.println("Nenhuma Informacao encontrada");
//    }
//} else {
//    System.out.println("O comprimento da string não corresponde ao valor informado.");
//}
//
//t.close();
