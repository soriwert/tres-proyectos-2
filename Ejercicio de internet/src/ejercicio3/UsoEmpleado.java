package ejercicio3;
import java.util.*;
import java.math.*;

class Empleado implements Comparable {
	private String nombre;
	private int agno, mes, dia;
	private double sueldo;
	private static int idSiguiente;
	private int Id;
	private Date altaContrato;
	
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia){
		this.nombre=nombre;
		this.sueldo=sueldo;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++idSiguiente;
		Id=idSiguiente;
	}
	
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo<otroEmpleado.sueldo)
			return -1;
		if (this.sueldo<otroEmpleado.sueldo)
			return 1;
		return 0;
	}
	
	public Empleado (String nombre){
	this(nombre, 30000, 2000, 01, 01);
	}
	
	public String dameNombre(){
		return nombre + " Id: " + Id;
	}
	
	public double dameSueldo(){
		return sueldo;
	}
	
	public Date dameFechaContrato (){
		return altaContrato;
	}
	public void subeSueldo(double porcentaje){
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public String imprimeTodo(){
		return "Su nombre es "+ nombre + " su sueldo es "+ sueldo + " su alta en el contrato " + altaContrato;
	}
}	
	class Jefatura extends Empleado{
		private double incentivo;
		public Jefatura (String nom, double sue, int agno, int mes, int dia){
			super(nom, sue, agno, mes, dia);
		}
		
		public void estableceIncentivo(double incentivo){
			this.incentivo=incentivo;
		}
		
		//invalida el de arriba pero lo utilizamos con sueldoJefe=dameSueldo
		public double dameSueldo(){
			double sueldoJefe=super.dameSueldo();
			return sueldoJefe+incentivo;
		}
		
	
	}
	
	public class UsoEmpleado{
		public static void main (String[] args){
			Scanner teclado = new Scanner (System.in);
			int nEmpleados, sueldo, anio, mes, dia, contador=0;
			String nombre;
			
			Jefatura Jefe = new Jefatura ("Maria", 30000, 5, 5, 5);
			Jefe.estableceIncentivo(2000);
			
			Empleado[] misEmpleados = new Empleado[5];
			
			misEmpleados[0] = new Empleado("Juan", 50000, 2, 2, 2);

			misEmpleados[1] = new Empleado("pedro", 60000, 3, 3, 3);

			misEmpleados[2] = new Empleado("pablo", 40000, 4, 4, 4);
			
			misEmpleados[3]=Jefe;
			misEmpleados[4] = new Jefatura("Alfonso", 15000, 6, 6, 6);
			
			for (Empleado e: misEmpleados){
				e.subeSueldo(5);
			}
			
			Arrays.sort(misEmpleados);
			
			
			
			for (int i=0;i<misEmpleados.length;i++){
				System.out.println(misEmpleados[i].imprimeTodo());
			}
		}
	}