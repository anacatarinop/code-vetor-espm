import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
				
				System.out.println();
				for (int i = 0; i < temperatura.length; i++) {
					System.out.print(String.format("%-13s", dias[i]) + " ");
					for(int j = 1; j <= temperatura[i]; j++) {
						System.out.print("*");
					
					}
				System.out.println();	
				
				}
				}
}

				
