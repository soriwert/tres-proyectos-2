package UsoArrays;
import java.util.*;
class Empleado{
     public Empleado(){
     
     }
     
     public void dameSueldo(){
         System.out.println("soy empleado");//
     }
     
 }
     
     
     
     class Jefe extends Empleado{
             public Jefe(){
             super.dameSueldo();//
             }
             
    public void dameSueldo(){
     System.out.println("soy Jefe");
     super.dameSueldo();
    }

     }
public class UsoArrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner (System.in);
        
        Empleado miEmpleado = new Empleado();
        //miEmpleado.dameSueldo();
        Jefe miJefe = new Jefe();
        //miEmpleado.dameSueldo();
        miJefe.dameSueldo();
        
    }
}


