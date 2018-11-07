import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int x, N, dias;
		N = teclado.nextInt();
		float [] C = new float [N];
		for (x = 0; x < N; x++){
			C[x] = teclado.nextFloat();
		}
		for (x = 0; x < N; x++){	
		    dias = 0;
		    while (C[x] > 1){
			   C[x] /= 2;
			   dias++;
		}
		    System.out.println(dias+ " dias");
		}
	}
}
