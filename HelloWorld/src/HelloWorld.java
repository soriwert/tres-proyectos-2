import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
 
 	System.out.println(HelloWorld.exp(10, 1));
 	System.out.println(HelloWorld.factorial(4));
	}
	public static int exp(int a, int b) {
		int total = 0;
		int aux=1;
		for (int i=0; i<=b; i++) {
		total = a * a;
		aux = a * total;
		}
		
		return aux;
		}
		public static int factorial(int number) {
		int total = 0;
		for (int i=number; i>0; i--) {
		total *= i;
		}
		return total;
		}

}
