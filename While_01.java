package Aula_19_06;

import java.util.Scanner;

public class While_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero=0, contador = 0, i= 0;

		while (i < 20) {
			System.out.print( + i++ + "Digite o número: ");
			numero = ler.nextInt();
		}
		if (numero >= 8) {
			contador++;
		}
		System.out.println("Quantidade de números maiores que 8 = " + numero);
	}
}



