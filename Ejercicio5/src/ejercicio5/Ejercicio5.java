package ejercicio5;
import ejercicio5.Leer;

abstract class Personas{
	public Personas(){
		
	}
}

class Empleado {
	private String nom;
	private int edad;

	public Empleado() {
		indicaTipoPersonal();
		pedirDatos();
	}
	
	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		System.out.print("\n\n\n\tNOMBRE: ");
		nom = Leer.pedirCadena();
		System.out.print("\n\n\tEDAD: ");
		edad = Leer.pedirEnteroValidar();
	}

	public static void indicaTipoPersonal() {
		System.out.println("\n\n\tESTA PERSONA ES UN EMPLEADO DE LA EMPRESA.");
	}

	public void visualTodosDatos() {
		System.out.print("\n\n\nSe va a visualizar los datos de un empleado:");
		System.out.println("\n\n\n\tNOMBRE: " + nom);
		System.out.println("\n\n\tEDAD: " + edad);
	}
}
		
class Jefe extends Empleado {
			private String nomdeparjefe;

			public Jefe() {
				indicaTipoPersonal();
				pedirDatos();
			}

			public static void indicaTipoPersonal() {
				System.out.println("\n\n\tDICHO EMPLEADO ES RESPONSABLE DE UN DEPARTAMENTO.");
			}

			public void pedirDatosJefe() {
				System.out.print("\t\t\t NOMBRE DEL DEPARTAMENTO DONDE EJERCE LA JEFATURA: ");
				nomdeparjefe = Leer.pedirCadena();
			}

			
			public void visualTodosDatos() {
				/*
				 * Aquí sobrescribimos el método visualTodosDatos() que tiene la clase
				 * Empleado.
				 */
				super.visualTodosDatos(); /*
										 * Llamamos al método visualTodosDatos() que
										 * tiene la clase Empleado.
										 */
				System.out.print("\n\n\tNOMBRE DEL DEPARTAMENTO DONDE ");
				System.out.println(" EJERCE LA JEFATURA: " + nomdeparjefe);
			}
		}

		public class Ejercicio5 {
			public static void main(String[] args) {
				Empleado empleados[];
				Jefe jefes[];
				int numemp, numjefes;
				int op;
				System.out.print("Indique los empleados que hay en la empresa: ");
				numemp = Leer.pedirEnteroValidar();
				empleados = new Empleado[numemp];
				for (int pos = 0; pos < numemp; pos++)
					empleados[pos] = new Empleado();
				System.out.print("\n\nIndique el número de jefes que hay en la empresa: ");
				numjefes = Leer.pedirEnteroValidar();
				jefes = new Jefe[numjefes];
				for (int pos = 0; pos < numjefes; pos++)
					jefes[pos] = new Jefe();
				visualtodosJefes(jefes);
				visualtodosEmpleados(empleados);
			}
		
			static void visualtodosEmpleados(Empleado empleados[]) {
				int pos;		
				System.out.println("Los datos de los empleados (que no son jefes) en la empresa son: ");
				for (pos = 0; pos < empleados.length; pos++) {
					empleados[pos].visualTodosDatos();
					System.out.print("\n\n\nPulse una tecla para continuar ");
					System.out.print("con la ejecución del programa: ");
					Leer.pedirCadena();
				}
			}

			static void visualtodosJefes(Jefe jefes[]) {
				int pos;
				System.out.println("Los datos de los jefes que hay en la empresa son: ");
				for (pos = 0; pos < jefes.length; pos++) {
					jefes[pos].visualTodosDatos();
					System.out.print("\n\n\nPulse una tecla para continuar ");
					System.out.println("con la ejecución del programa: ");
					Leer.pedirCadena();
				}
			}
			}
