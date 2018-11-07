import java.util.Scanner;
import java.text.DecimalFormat;
public class Main{
public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
		DecimalFormat teclado2 = new DecimalFormat("0.0000");
        double raio,raio1;
		double area;
        raio=teclado.nextDouble();
        raio1=Math.pow(raio, 2);
        area=raio1 * 3.14159;
        System.out.println("A="+teclado2.format(area));
    }
}
