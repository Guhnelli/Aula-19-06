package Aula_19_06;

import java.util.Scanner;

public class while_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double numero=0, i=0;

		while (i < 20) {
			System.out.print("informe o numero :" + i);
			numero = ler.nextDouble();
			i++;
		}

		if(numero<0) {
			System.exit(1);

		}
	}
}