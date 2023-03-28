import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
// Escreva um programa em Java que leia um valor inteiro e positivo (o valor deverá ser testado). 
// O seu programa deverá imprimir no vídeo todos os divisores inteiros 
// do valor informado pelo usuário. A impressão dos valores deverá ser feito em 
//um método. 
		
		Scanner teclado = new Scanner(System.in);
		int x;
		
		System.out.print("Valor inteiro e positivo -> ");
		x = teclado.nextInt();
		if(x <=0 ) {
			System.out.println("O valor deve ser inteiro e positivo");
		}else {
			imprimir(x); //argumento --> valor que será enviado ao método
		
	}

}

	public static void imprimir(int x) {
		for (int cont = 1; cont <= x; cont++) {
			if (x % cont == 0 ) {
				System.out.println(cont);
			}
		}
		
	}
}