import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escreva um programa em Java que leia três valores. Caso os valores formem os
//lados de um triângulo, imprima a sua classificação quanto aos lados. Observação: para que três valores formem os lados de um triângulo é necessário que cada
//um dos lados seja menor que a soma dos outros dois. A classificação dos
//triângulos quanto aos lado é: equilátero (3 lados iguais), isósceles (2 lados iguais) ou escaleno (3 lados diferentes).
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
			System.out.println("Os valores informados não formam um triângulo");
		}
	}
	
	public static void classificar (double l1, double l2, double l3) {
		if(l1 == l2 && l2 == l3) {
			System.out.println("Triângulo equilátero");
		}else if(l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("Triângulo isósceles");
	}else {
		System.out.println("Triângulo escaleno");
	}





	}
}
		   



