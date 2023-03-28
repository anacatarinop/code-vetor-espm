import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Escreva um programa em Java que leia 3 valores inteiros.
		 //O programa deverá ter um método para determinar e retornar o maior valor digitado.
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("1 Valor => ");
		x = teclado.nextInt();
		
		System.out.print("2 Valor => ");
		y = teclado.nextInt();
		
		System.out.print("3 Valor => ");
		z = teclado.nextInt();
		
		System.out.print("Maior valor = " + maior(x,y,z));
		
	}

	public static int maior(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		} else if (y > z) {
			return y;
		}
		return z;
	} 
}
