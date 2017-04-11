package ruleta;
import java.util.*;

public class Ruleta {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		int numero;
		boolean correcto=false;
		Partida partida1 = new Partida();
		partida1.setRuleta();
		
		do{
		System.out.println(" Escribe el número ganador: ");
		partida1.setNumero(numero=teclado.nextInt());
		partida1.setSector();
		partida1.setColor();
		partida1.setParImpar();
		partida1.porcentajes();
		partida1.estrategia11();
		}while(correcto==false);
		
	}

}
