package ejercicio3;
public class Deriva1 extends Base1 {

	public Deriva1() {
		System.out.println("\n\n\tHemos entrado en el constructor de la clase Deriva1 ");
	}
	public Deriva1(int numero){
		super(numero);
		System.out.println("Este es Deriva1 con parametros");
		this.numero=numero;
	}
	
	public int numeroB(){
		return numero;
	}
	int numero;
}