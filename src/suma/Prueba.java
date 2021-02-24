package suma;

import java.util.Scanner;

public class Prueba {
	public static void main(String arg[]) {
		
		Scanner ent=new Scanner(System.in);
		System.out.println("Introduce el primer numero ");
		int num1=ent.nextInt();
		System.out.println("Introduce el segundo numero ");
		int num2=ent.nextInt();
		
		
		System.out.println("Resultado es "+(num1+num2));
	}
}
