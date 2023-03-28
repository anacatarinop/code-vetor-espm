import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
// Escreva um programa em Java que leia um valor inteiro e positivo (o valor dever� ser testado). 
// O seu programa dever� imprimir no v�deo todos os divisores inteiros 
// do valor informado pelo usu�rio. A impress�o dos valores dever� ser feito em 
//um m�todo. 
		
		Scanner teclado = new Scanner(System.in);
		int x;
		
		System.out.print("Valor inteiro e positivo -> ");
		x = teclado.nextInt();
		if(x <=0 ) {
			System.out.println("O valor deve ser inteiro e positivo");
		}else {
			imprimir(x); //argumento --> valor que ser� enviado ao m�todo
		
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