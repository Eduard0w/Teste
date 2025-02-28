package lista1;

import java.util.Scanner;

public class Joia_tempo {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String HF, HDF, HA, entrada;
		boolean resultadoVitorioso = false;
		
		do {
		
		entrada = t.nextLine().toUpperCase();
		
		String[] split = entrada.split(" ");
		
		if(split.length == 3) {
			HF = split[0];
			HDF = split[1];
			HA = split[2];
			
			if(HF.equals("NAO") && HDF.equals("SIM") && HA.equals("NAO")) {
				resultadoVitorioso = true;
			}
		}
		
		}while(!entrada.equals("FIM FIM FIM"));
		
		if(resultadoVitorioso) {
			System.out.println("VITORA");
		}else {
			System.out.println("DERROTA");
		}
		
		
		t.close();
	}

}


//Explicando e exemplo de como ".split()" funciona!

//String resultado ="NAO SIM NAO";
//String[] split = resultado.split(" "); //o que foi expecificado eh
////o que sera retirado da String. O reso sera dividido em partes do array
////nesse exemplo acima o split esta tirando o espacamento e colocando
////apenas as palavras inteiras dentro de cada posicao do ARRAY.
////Como vai ficar no ARRAY -> ["NAO", "SIM", "NAO"]
//
//HF = split[0];
//HDF = split[1];
//HA = split[2];
//System.out.println(HF + " " + HDF + " " + HA);
//
