import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int x, n, a, l , p;
			n = teclado.nextInt();
			a = teclado.nextInt();
			l = teclado.nextInt();
			p = teclado.nextInt();
			if(a>=n && l>=n && p>=n){
                   System.out.println("S"); 
           }else{
                   System.out.println("N"); 
           }
	}

}
