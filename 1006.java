import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.0");
		double a, b, c, media;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		media = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);
		System.out.println("MEDIA = " + teclado2.format(media));
		teclado.close();
	}
}

