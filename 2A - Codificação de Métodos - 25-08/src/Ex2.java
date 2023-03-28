import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escreva um programa em Java que leia tr�s valores. Caso os valores formem os
//lados de um tri�ngulo, imprima a sua classifica��o quanto aos lados. Observa��o: para que tr�s valores formem os lados de um tri�ngulo � necess�rio que cada
//um dos lados seja menor que a soma dos outros dois. A classifica��o dos
//tri�ngulos quanto aos lado �: equil�tero (3 lados iguais), is�sceles (2 lados iguais) ou escaleno (3 lados diferentes).
		Scanner teclado = new Scanner (System.in);
		double lado1, lado2, lado3;

		System.out.print("Lado 1 => " );
		lado1 = teclado.nextInt();
		        
		System.out.print("Lado 2 => " );
		lado2 = teclado.nextInt();
		        
		System.out.print("Lado 3 => " );
		lado3 = teclado.nextInt();
		
		if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
			classificar (lado1, lado2, lado3);
		}else {
			System.out.println("Os valores informados n�o formam um tri�ngulo");
		}
	}
	
	public static void classificar (double l1, double l2, double l3) {
		if(l1 == l2 && l2 == l3) {
			System.out.println("Tri�ngulo equil�tero");
		}else if(l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("Tri�ngulo is�sceles");
	}else {
		System.out.println("Tri�ngulo escaleno");
	}





	}
}
		   



