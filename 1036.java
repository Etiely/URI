import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00000");
		double A, B, C, delta, R1, R2;
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		delta = ((B * B) - (4 * A * C));
		R1 = ((-B + Math.sqrt((B * B) - (4 * A * C))) / (2 * A));
		R2 = ((-B - Math.sqrt((B * B) - (4 * A * C))) / (2 * A));
		if (A == 0 || delta < 0){
			System.out.println("Impossivel calcular");	
		}else{
			System.out.println("R1 = " + teclado2.format(R1));
			System.out.println("R2 = " + teclado2.format(R2));
		}
		teclado.close();
		
	}

}
