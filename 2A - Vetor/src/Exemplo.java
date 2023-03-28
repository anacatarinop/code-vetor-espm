import java.util.Random;

public class Exemplo {

	public static void main(String[] args) {
	
	Random gerador = new Random();
	
	int x = gerador.nextInt()%100;
	double y = gerador.nextDouble()*200;
	
	System.out.println(x);
	System.out.println(y);
	}

}
