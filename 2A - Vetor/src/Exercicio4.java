import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//4. Escreva um programa que leia a temperatura m�xima di�ria da �ltima 
		//semana (de domingo a s�bado). Imprima no v�deo os dias em que a 
		//temperatura esteve acima da m�dia da semana.

		//vari�veis
		Scanner teclado = new Scanner(System.in);
		double[] temperatura = new double[7];
		String[] dias = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira","Quinta-feira",
				"Sexta-feira", "S�bado"};
		double media = 0;
		
		
		// processamento
		for(int i = 0; i < temperatura.length; i++) {
			System.out.print("Temperatura do(a) " + dias[i] + ": ");
			temperatura[i] = teclado.nextDouble();
			media = media + temperatura[i];
			
		}
		//calculo da m�dia
		media = media / temperatura.length;
		System.out.println("M�dia da semana: " + media);
		
		//impress�o dos dias da semana com temperatura acima da m�dia
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(dias[i]);
			}
		}
	}
}
			
		
		
	


