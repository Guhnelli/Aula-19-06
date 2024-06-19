package Aula_19_06;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double numero;
		
		for(int i=1; i>0; i++) {
			System.out.print("informe o numero :" + i);
			numero=ler.nextDouble();
			
			if(numero<0) {
				System.exit(1);	
			}
		}
		
	}

}
