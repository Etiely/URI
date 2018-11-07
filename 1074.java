import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		float [] valor = new float[N];
		int x;
		for (x = 0; x <N; x++){
			valor [x] = teclado.nextInt();
			if (valor[x] % 2 == 0 && valor[x] > 0){
				System.out.println("EVEN POSITIVE");
			}else{
				if (valor[x] % 2 == 0 && valor[x] < 0){
				System.out.println("EVEN NEGATIVE");
				}else{
					if (valor[x] % 2 != 0 && valor[x] > 0){
						System.out.println("ODD POSITIVE");
					}else{
						if(valor[x] % 2 != 0 && valor[x] < 0){
							System.out.println("ODD NEGATIVE");
							}else{
								System.out.println("NULL");
							}
					}
				}
			}
		}
		teclado.close();
	}
}
