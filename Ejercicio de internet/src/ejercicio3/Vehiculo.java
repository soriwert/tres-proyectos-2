package ejercicio3;
import java.util.*;
class Coche {
	private int ruedas, largo, ancho, motor, pesoPlataforma, pesoTotal;
	private String color;
	private boolean asientosCuero, climatizador;

	public Coche(){
		ruedas=4;
		largo =2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}

	public String dimeDatosGenerales(){
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
				". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + " Kg.";
	}

	public void estableceColor(String colorCoche){
		color=colorCoche;
	}

	public String dimeColor (){
		return "El color del coche es "+ color;
	}

	public void configuraAsientos (String asientosCuero){
		if (asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero=true;
		}else{
			this.asientosCuero=false;
		}
	}
	public String dimeAsientos(){
		if (asientosCuero==true){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}
	}
	public void configuraClimatizador (String climatizador){
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	public String dimeClimatizador(){
		if(climatizador==true){
			return "El coche incorpora climatizador";
		}else{
			return "El coche lleva aire acondicionado";
		}
	}

	public String dimePesoCoche (){
		int pesoCarroceria=500;
		pesoTotal=pesoPlataforma+pesoCarroceria;
		if(asientosCuero==true){
			pesoTotal=pesoTotal+50;
		}
		if (climatizador==true){
			pesoTotal=pesoTotal+20;
		}
		return "El peso del coche es " + pesoTotal;
	}
}

	class Furgoneta extends Coche{
		
		private int capacidadCarga, plazasExtra;
		
		public Furgoneta(int plazasExtra, int capacidadCarga){
		
			super(); //llamar al constructor de la clase padre;
			
			this.capacidadCarga=capacidadCarga;
			
			this.plazasExtra=plazasExtra;
	}
		
		public String dimeDatosFurgoneta(){
			return "La capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtra;
		}
}


public class Vehiculo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Declaramos e instanciamos el objeto de clase coche
		Coche miCoche1 = new Coche();
		System.out.println("Dime el color del coche");
		miCoche1.estableceColor(teclado.next());
		
		Furgoneta miFurgoneta1 = new Furgoneta(7,580);
		System.out.println("Dime el color de la Furgoneta");
		miFurgoneta1.estableceColor(teclado.next());
		System.out.println("Tiene asientos de cuero?");
		miFurgoneta1.configuraAsientos(teclado.next());
		System.out.println("Tiene climatizador?");
		miFurgoneta1.configuraClimatizador(teclado.next());
		System.out.println(miCoche1.dimeDatosGenerales()+" "+miCoche1.dimeColor());
		System.out.println(miFurgoneta1.dimeDatosGenerales()+" "+miFurgoneta1.dimeColor() + " \n" + miFurgoneta1.dimeDatosFurgoneta());

	}
}
