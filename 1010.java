import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00");
		int codigo1, numpecas1, codigo2, numpecas2;
		double valorpeca1, valorpeca2, valort;
		
		codigo1 = teclado.nextInt();
		numpecas1 = teclado.nextInt();
		valorpeca1 = teclado.nextDouble() * numpecas1;
		codigo2 = teclado.nextInt();
		numpecas2 = teclado.nextInt();
		valorpeca2 = teclado.nextDouble() * numpecas2;
		
		valort = valorpeca1 + valorpeca2;
		
		System.out.println("VALOR A PAGAR: R$ " +teclado2.format(valort));

		
		
	}
}
