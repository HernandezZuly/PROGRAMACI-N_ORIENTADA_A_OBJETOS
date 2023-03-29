package Salud;

public class Empleado extends Persona{
    //Creación de atributos propios de la subclase o de la clase hija
    private String cargo, departamento;
    private double valorHora, horasTrabajadas;

    //Metodo constructor de la subclase y se trajieron los atributos de la superclase
    public Empleado(String nombre, String apellido, int documento, String tipoDoc, String cargo, String departamento, double valorHora, double horasTrabajadas){
        super(nombre, apellido, documento, tipoDoc);
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
    }

    //Metodo propios de la subclase
    public void mostrarEmpleado(){
        System.out.println("El nombre y apellido del empleado es " + getNombre() + " " + getApellido());
        System.out.println("El tipo y numero de documento es " + getTipoDoc() + " " + getDocumento());
        System.out.println("La cantidad de horas trabajadas del empleado son " + " " + getHorasTrabajadas());
    }

    public void calcularHonorarios(){
        double reteica;
        double totalAPagar;
        totalAPagar=valorHora*horasTrabajadas;
        reteica=(0.966 * totalAPagar);
        totalAPagar=(totalAPagar-reteica);
        System.out.println("El total a pagar para el empleado es " + totalAPagar);
    }

    //Metodos accesores
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    } 

    
}
