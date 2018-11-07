import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		valor1 = teclado.nextInt();
		valor2 = teclado.nextInt();
		System.out.println("PROD = " + (valor1 * valor2));
	}

}
