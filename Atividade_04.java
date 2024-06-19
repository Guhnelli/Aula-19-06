package Aula_19_06;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numero[] = new int [20], entre=0, entre01=101, maiores=0;

		for(int i =0; i<2; i++) {
			System.out.print("informe o numero :" + i);
			numero[i]=ler.nextInt();

			if(numero[i]>100) {
				entre++;
			}
			if(entre01>200) {
				entre01++;
			}
			if(maiores>200) {
				maiores++;
			}
		}
			System.out.println("numeros Que estão entre 0 a 100 :"+ entre );
			System.out.println("numeros Que estão entre 101 a 200 :"+ entre01 );
			System.out.println("numeros maiores que 200 :"+ maiores );
			ler.close();
		}
	}




