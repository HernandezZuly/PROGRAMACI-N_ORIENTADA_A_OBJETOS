package Principal;
import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        //reto1  
     /*   int pesoActual=0, peso=0;
        double estatura=0, resultado;*/
        //creación del objeto
        //Persona persona = new Persona(); 
        //invocar métodos  
      /*  persona.pedirDatos();
        persona.mostrarPersona();
        resultado=persona.calcularimc();
        persona.mayorEdad();*/

        //reto 2
      /*  int pesoActual=0, peso=0;
        double estatura=0, resultado;
        //creación del objeto
        Persona persona = new Persona(); 
        //invocar métodos  
        persona.pedirDatos();
        persona.mostrarPersona();
        resultado=persona.calcularimc(peso, estatura);
        if(pesoActual < 20){
            System.out.println("El peso está por debajo de lo ideal");
        }else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal");
        }else if(pesoActual > 25){
            System.out.println("Tiene sobrepeso");
        }
        persona.mayorEdad(); */

        //Reto 3
        Persona persona = new Persona(); 
        String cargo, departamento;
        double valorHora, horasTrabajadas;
        Scanner lectura = new Scanner (System.in);
        persona.pedirDatos();
        System.out.println("Digite el cargo del empleado");
        cargo=lectura.next();
        System.out.println("Digite su departamento");
        departamento=lectura.next();
        System.out.println("Digite el valor por hora trabajada");
        valorHora=lectura.nextDouble();
        System.out.println("Digite la cantidad de horas trabajadas del empleado");
        horasTrabajadas=lectura.nextDouble();

        //Se crea el objeto con argumentos
        Empleado empleado = new Empleado(persona.getNombre(), persona.getApellido(), persona.getDocumento(), persona.getTipoDoc(), cargo, departamento, valorHora, horasTrabajadas);
        empleado.mostrarEmpleado();
        empleado.calcularHonorarios(); 

        lectura.close();
    }
}
