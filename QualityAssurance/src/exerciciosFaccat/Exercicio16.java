package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valor, total;
		int macas;

		System.out.println("Digite o quantidade de maças que deseja comprar: ");
		macas = sc.nextInt();

		if (macas <= 0) {
			System.out.println("Por favor, digite uma quantidade valida");
		} else if (macas > 0 && macas <= 6) {
			valor = 1.30;
			total = macas * valor;
			System.out.printf("O valor total a pagar por "+macas+" é: R$ %.2f", total);
		} else if (macas > 12){
			valor = 1.00;
			total = macas * valor;
			System.out.printf("O valor total a pagar por "+macas+" é: R$ %.2f", total);
		}

		sc.close();
	}

}
