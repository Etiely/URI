import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int x, v, n, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		n = teclado.nextInt();
        for (x = 0; x < n; x++){
        	v = teclado.nextInt();
        	if (v % 2 == 0){
        		cont2++;
        	}
        	if (v % 3 == 0){
        		cont3++;
        	}
        	if (v % 4 == 0){
        		cont4++;
        	}
        	if (v % 5 == 0){
        		cont5++;
        	}
        		}
        System.out.println(cont2+ " Multiplo(s) de 2");
        System.out.println(cont3+ " Multiplo(s) de 3");
        System.out.println(cont4+ " Multiplo(s) de 4");
        System.out.println(cont5+ " Multiplo(s) de 5");

        	}
	}

