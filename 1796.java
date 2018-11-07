import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int x, n, o, cont = 0, cont2 = 0;
		n = teclado.nextInt();
		for (x = 0; x < n; x++){
			o = teclado.nextInt();
			if (o == 1){
				cont++;
			}else{
				cont2++;
			}
		}
		if (cont < cont2){
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
		
		}

}
