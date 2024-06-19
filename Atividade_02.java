package Aula_19_06;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numero[] = new int [20], pares=0;

		for(int i =0; i<20; i++) {
			System.out.print("informe o numero :" + i);
			numero[i]=ler.nextInt();

			if(numero[i]%2==0) {
				pares++;
			}
		}
		System.out.println("numeros pares :"+ pares );
		ler.close();
	}
}


