package com.vitorcamara.projetos;

import java.util.Scanner;

public class TabuadaPersonalizada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int valorInicial = 0;
		int valorFinal = 0;

		boolean invalido = true;

		System.out.println("Você quer ver a tabuada de multiplicação de qual número?");
		int num = scan.nextInt();

		do {
			System.out.println("Qual será o valor inicial da tabuada?");
			valorInicial = scan.nextInt();
			System.out.println("Qual será o valor final da tabuada?");
			valorFinal = scan.nextInt();

			if (valorFinal < valorInicial) { // a tabuada começa do menor valor multiplicado, até o último valor que
												// deve ser o maior valor
				invalido = false;
				System.out.println("Tabuada inválida!");
			}
		} while (!invalido);

		int multi;
		System.out.println("Tabuada de " + num + ":");
		for (int i = valorInicial; i <= valorFinal; i++) { // o contador recebe o valor de onde começa a tabuada
			multi = num * i; // multiplicação recebe o número que o usuário informou para a tabuada e
								// multiplica pelo contador delimitado também pelo usuário
			System.out.println(num + " x " + i + " = " + multi);

		}

	}

}
