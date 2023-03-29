package Figuras_Geometricas;

public class Circulo extends Figura{
    //Atributos
    private float radio;
    
    //metodo contructor 
    public Circulo(float radio){
        this.radio=radio;
    }

    //metodos accesores
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    //metodo de la subclase
    public void calcularArea(){
        double area=0;
        area=3.14*(radio*radio);
        System.out.println("El radio del circulo es " + radio + " y su área es " + area);
    }
    
}
