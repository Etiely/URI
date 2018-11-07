import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.00");
		int CODIGO, QUANTIDADE; 
		double PREÇO, TOTAL;	
		CODIGO = teclado.nextInt();
		QUANTIDADE = teclado.nextInt();
		if (CODIGO == 1){
			PREÇO = 4.00;
		}else{
			if (CODIGO == 2){
				PREÇO = 4.50;
			}else{
				if (CODIGO == 3){
					PREÇO = 5.00;
				}else{
					if (CODIGO == 4){
						PREÇO = 2.00;
				}else{
					PREÇO = 1.50;
				}	
			}
		}
	  }
		TOTAL = PREÇO * QUANTIDADE;
		System.out.println("Total: R$ "+ teclado2.format(TOTAL));
		
	}

}
