import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//4. Escreva um programa que leia a temperatura máxima diária da última 
		//semana (de domingo a sábado). Imprima no vídeo os dias em que a 
		//temperatura esteve acima da média da semana.

		//variáveis
		Scanner teclado = new Scanner(System.in);
		double[] temperatura = new double[7];
		String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira",
				"Sexta-feira", "Sábado"};
		double media = 0;
		
		
		// processamento
		for(int i = 0; i < temperatura.length; i++) {
			System.out.print("Temperatura do(a) " + dias[i] + ": ");
			temperatura[i] = teclado.nextDouble();
			media = media + temperatura[i];
			
		}
		//calculo da média
		media = media / temperatura.length;
		System.out.println("Média da semana: " + media);
		
		//impressão dos dias da semana com temperatura acima da média
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(dias[i]);
			}
		}
	}
}
			
		
		
	


