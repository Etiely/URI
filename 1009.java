import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00");
		String nome;
		double salariofixo, vendast, salariot;
		nome = teclado.next();
		salariofixo = teclado.nextDouble();
		vendast = teclado.nextDouble();
		salariot = salariofixo + ((vendast * 15) / 100);
	
		System.out.println("TOTAL = R$ " +teclado2.format(salariot));

	}

}
