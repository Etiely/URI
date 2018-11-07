import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		double A, B, MEDIA;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00000");
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
		System.out.println("MEDIA = " + teclado2.format(MEDIA));
		teclado.close();
	}

}
