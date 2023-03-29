package Salud;
import java.util.Scanner;

public class Persona{
    //Atributos
    private String nombre;
    private String apellido;
    private int documento; 
    private String tipoDoc; 
    private int edad;
    private String sexo; 
    private int peso;
    private double estatura;
    //private double pesoActual=0;

    //Metodo constructor de Persona lleno
    public Persona(String nombre, String apellido, int documento, String tipoDoc){
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento=documento;
        this.tipoDoc=tipoDoc;
    }
    //Metodo constructor de Persona vacio
    public Persona() {
    }

    /*El metodo get siempre genera un valor de retorno por eso tiene la palabra return 
    del mismo tipo de dato del atributo*/
    //Metodos accesores
    public String getNombre() {
        return nombre;
    }

    /*El metodo set no retorna valores y requiere como parametro el valor el atributo*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    //Métodos
    public void pedirDatos(){
    Scanner lectura = new Scanner(System.in);
        System.out.println("Digite su nombre");
        nombre=lectura.next();
        System.out.println("Digite su apellido");
        apellido=lectura.next();
        System.out.println("Digite su numero de documento");
        documento=lectura.nextInt();
        System.out.println("Digite su tipo de documento (TI, CC, CE, etc)");
        tipoDoc=lectura.next();
 /*       System.out.println("Digite su edad");
        edad=lectura.nextInt();
        System.out.println("Digite su género");
        sexo=lectura.next();
        System.out.println("Digite su peso");
        peso=lectura.nextInt();
        System.out.println("Digite su estatura");
        estatura=lectura.nextDouble();*/
    } 

    /*public void mostrarPersona(){
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su apellido es " + apellido);
        System.out.println("Su numero de documento es " + documento);
        System.out.println("Su tipo de documento es " + tipoDoc);
        System.out.println("Tiene " + edad + " años");
        System.out.println("Su género es " + sexo);
        System.out.println("Su peso es " + peso);
        System.out.println("Su estatura es " + estatura);
    }*/
    //Reto 2
    /*public void calcularimc(){
        pesoActual=peso/(estatura*estatura);
        if(pesoActual<20){
            System.out.println("El peso está por debajo de lo ideal");
        }else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal");
        }else if(pesoActual>25){
            System.out.println("Tiene sobrepeso");
        }
    }*/


    //Método con parametros y valor de retorno - Reto 2
    /*public double calcularimc(int peso, double estatura){
        pesoActual=peso/(estatura*estatura);
        return pesoActual;
    }*/

    /*public void mayorEdad(){
        if(edad>=0 && edad<=17 && tipoDoc.equals("TI")){
            System.out.println(nombre + " es menor de edad");
        }else if(edad>=18 && tipoDoc.equals("CC")){
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println("Usted digitó algo mal, revise sus respuestas");
        }
    }*/
    
}
