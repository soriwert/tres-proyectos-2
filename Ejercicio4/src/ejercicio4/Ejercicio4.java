package ejercicio4;
import java.util.*;
class Empleado4{
	private final String nombreEmpresa;
	private String nombre;
	private int edad, porcentaje, sueldo,plus;
	private static int sueldoBase;



	public Empleado4 (String nombre, int edad, int porcentaje, int sueldo){
		this.nombre=nombre;
		this.edad=edad;
		this.porcentaje=porcentaje;
		this.sueldo=sueldo;
		sueldoBase=1000;
		nombreEmpresa="Eléctrica, SA";
	}

	public String dameNombreEmpresa(){
		return nombreEmpresa;		
	}

	public void establecePorcentaje(int porcentaje){
		this.porcentaje=porcentaje;
	}

	public int damePorcentaje(){
		return porcentaje;
	}

	public int dameSueldoEmpleado(){
		int sueldo=sueldoBase+(sueldoBase*porcentaje/100);
		this.sueldo=sueldo;
		return sueldo;
	}

	public void estableceEdad(int edad){
		this.edad=edad;
	}

	public int dameEdad(){
		return edad;
	}

	public void estableceNombre(String nombre){
		this.nombre=nombre;
	}

	public String dameNombre(){
		return nombre;
	}

	public String imprimeTodo(){
		return "El nombre de la empresa es: "+dameNombreEmpresa()+" el nombre del Empleado es: " + dameNombre() +
				" su edad es: " + dameEdad() +" su porcentaje es "+damePorcentaje()+
				" su sueldo total es "+dameSueldoEmpleado();
	}
	public void estableceSueldoBase(int sueldoBase){
		this.sueldoBase=sueldoBase;
	}
	public static int dameSueldoBase(){
		return sueldoBase;
	}
	public void establecePlus(int plus){
		this.plus=plus;
	}
}

class Jefe4 extends Empleado4{
	private int plus;
	private String nombreDepartamento;
	int sueldoJefe;



	Jefe4(String nombre, int edad, int porcentaje, int sueldo, String nombreDepartamento){
		super(nombre,edad,porcentaje,sueldo);
		plus=250;
		this.nombreDepartamento=nombreDepartamento;
	}

	public int dameSueldoJefe(){
		sueldoJefe=super.dameSueldoBase()+plus;
		return sueldoJefe;
	}

	public void estableceDepartamento(String nombreDepartamento){
		this.nombreDepartamento=nombreDepartamento;
	}

	public String dameDepartamento(){
		return nombreDepartamento;
	}

	public String imprimeTodo(){
		return "El nombre de la empresa es: "+dameNombreEmpresa()+" el nombre del Jefe es: " + dameNombre() +
				" su edad es: " + dameEdad() +" su sueldo total es "+dameSueldoJefe()+" Su departamento es: "+dameDepartamento();
	}

	public void establecePlus(int plus){
		this.plus=plus;
	}
}

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int opcion, nEmpleados,nJefes, edad=0, porcentaje=0, sueldo=0, sueldoJefe=0, empleadosTotal, sueldoBase, plus;
		boolean salir=false;
		String nombre="", nombreDepartamento="";

		Empleado4 misEmpleados = new Empleado4(nombre, edad, porcentaje, sueldo);
		Empleado4[] empleado;

		System.out.println("Introduzca el numero de empleados");
		nEmpleados=teclado.nextInt();
		System.out.println("Introduzca el numero de jefes: ");
		nJefes=teclado.nextInt();
		empleadosTotal=nEmpleados+nJefes;
		empleado = new Empleado4[empleadosTotal];



		for (int i=0; i<nEmpleados;i++){
			System.out.println("Nombre del empleado: ");
			nombre=teclado.next();
			misEmpleados.estableceNombre(nombre);
			System.out.println("Dime la edad de "+nombre);
			edad=teclado.nextInt();
			misEmpleados.estableceEdad(edad);
			System.out.println("Dime el porcentaje de "+nombre);
			porcentaje=teclado.nextInt();
			misEmpleados.establecePorcentaje(porcentaje);
			sueldo=misEmpleados.dameSueldoEmpleado();
			empleado[i] = new Empleado4 (nombre, edad, porcentaje, sueldo);
		}


		Jefe4 misJefes = new Jefe4 (nombre, edad, porcentaje, sueldoJefe, nombreDepartamento);
		for (int j=(nEmpleados); j<empleadosTotal;j++){

			System.out.println("Nombre del Jefe: ");
			nombre=teclado.next();
			misJefes.estableceNombre(nombre);
			System.out.println("Dime la edad de "+nombre);
			edad=teclado.nextInt();
			misJefes.estableceEdad(edad);
			System.out.println("Dime el departamento de "+nombre);
			nombreDepartamento=teclado.next();
			misJefes.estableceDepartamento(nombreDepartamento);
			sueldoJefe=misJefes.dameSueldoJefe();
			empleado[j] = new Jefe4 (nombre, edad, porcentaje, sueldoJefe, nombreDepartamento);
		}

		for (int i=0; i<empleadosTotal;i++){
			System.out.println(empleado[i].imprimeTodo());
		}



		
		

		while(salir==false){
			System.out.println("Introduzca una opción");
			System.out.println("1. Modificar el sueldo base de todos los empleados.");
			System.out.println("2. Modificar el plus de todos los jefes");
			System.out.println("3. Visualizar los datos de todos los empleados");
			System.out.println("4. Salir");
			opcion=teclado.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Escriba el nuevo sueldo base: ");
				sueldoBase=teclado.nextInt();
				for (int i=0; i<empleadosTotal;i++){
					empleado[i].estableceSueldoBase(sueldoBase);
					}
				
				break;

			case 2:
				System.out.println("Escriba el plus de los jefes: ");
				plus=teclado.nextInt();
				for (int i=0; i<empleadosTotal;i++){
				empleado[i].establecePlus(plus);
				}
				break;

			case 3:
				for (int i=0; i<empleadosTotal;i++){
					System.out.println(empleado[i].imprimeTodo());
				}
				break;
			case 4:
				salir=true;
			}
		}


	}

}
