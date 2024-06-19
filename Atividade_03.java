package Aula_19_06;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numero[] = new int [20], entre=0;

		for(int i =0; i<20; i++) {
			System.out.print("informe o numero :"+i);
			numero[i]=ler.nextInt();

			if(numero[i]>100) {
				entre++;
				
			}
		}
		System.out.println("numeros Que estão entre 0 a 100 :"+ entre );
		ler.close();
	}
}


