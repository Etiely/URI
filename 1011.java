import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.000");
		double raio, raio1;
		raio = teclado.nextDouble();
		
		raio1 = (Math.pow(raio, 3)) * 3.14159 * (4/3.0);
		
		System.out.println("VOLUME = " +teclado2.format(raio1));

	}
	

}
