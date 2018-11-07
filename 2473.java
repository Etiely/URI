import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int i, x = 0, count = 0, v2;
		int [] v = new int [6];
		
		for (i = 0; i < 6; i++){
			v [i] = teclado.nextInt();
		}
		for (i = 0; i < 6; i++){
			v2 = teclado.nextInt();
			for (x = 0; x < 6; x++){
				if (v2 == v[x]){
					count++;
				}
			}
		}
		if (count == 3){
			System.out.println("terno");
		}else{
			if(count == 4){
				System.out.println("quadra");
			}else{
				if (count == 5){
					System.out.println("quina");
				}else{
					if(count == 6){
						System.out.println("sena");
					}else{
						System.out.println("azar");
					}
				}
			}
		}
		
		teclado.close();
	}

}
