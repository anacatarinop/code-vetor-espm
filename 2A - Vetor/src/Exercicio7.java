import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int qtd;
		
		System.out.print("Quantos números? ");
		qtd = teclado.nextInt();
		
		int[] x = new int[qtd];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(50);
			System.out.print(x[i] + " ");
		}
		

	}

}
