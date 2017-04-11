package ejercicio3;

public class Base1 {
	private int numero;

	public Base1() {
		System.out.print("\n\tHemos entrado en el constructor de la clase Basel");
	}
	public Base1(int numero) {
		System.out.println("Este es Base1 con parametros");
		this.numero=numero;
	}
	
	public void numeroB(int numero){
		this.numero=numero;
	}
	public int numeroB(){
		return numero;
	}

}