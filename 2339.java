import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int c, p, f;
		c = teclado.nextInt();
		p = teclado.nextInt();
		f = teclado.nextInt();
		if ((p / c) >= f){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
	}

}
