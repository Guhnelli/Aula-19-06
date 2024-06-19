package Aula_19_06;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int numero[] = new int [20], maiores=0;
		
		for(int i =0; i<20; i++) {
			System.out.print("informe o numero :");
			numero[i]=ler.nextInt();
			
			if(numero[i]>8) {
				maiores++;
			}
		}
		System.out.println("numeros maoires de 8 :"+ maiores );
		ler.close();
	}

}

