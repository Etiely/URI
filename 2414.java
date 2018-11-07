import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int x, n, maiornum = 0;
		do{
			n = teclado.nextInt();
			if (n > 0 && n > maiornum){
				maiornum = n;
			}
		}while(!(n == 0));
		System.out.println(maiornum);
	}

}
