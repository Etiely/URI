import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri1008 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00");
		int fnum;
		double vhora, trabhoras, salariot;
		
		fnum = teclado.nextInt();
		trabhoras = teclado.nextDouble();
		vhora = teclado.nextDouble();
		salariot = trabhoras * vhora;

		System.out.println("NUMBER = " +fnum);
		System.out.println("SALARY = U$ " +teclado2.format(salariot));
	}
}
