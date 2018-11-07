import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int L, D, K, P;
			L = teclado.nextInt();
			D = teclado.nextInt();
			K = teclado.nextInt();
			P = teclado.nextInt();
			System.out.println((int)((L / D) * P) + K * L);
	}
}
