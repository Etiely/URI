import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00");
		int CODIGO, QUANTIDADE; 
		double PRE�O, TOTAL;	
		CODIGO = teclado.nextInt();
		QUANTIDADE = teclado.nextInt();
		if (CODIGO == 1){
			PRE�O = 4.00;
		}else{
			if (CODIGO == 2){
				PRE�O = 4.50;
			}else{
				if (CODIGO == 3){
					PRE�O = 5.00;
				}else{
					if (CODIGO == 4){
						PRE�O = 2.00;
				}else{
					PRE�O = 1.50;
				}	
			}
		}
	  }
		TOTAL = PRE�O * QUANTIDADE;
		System.out.println("Total: R$ "+ teclado2.format(TOTAL));
		
	}

}
