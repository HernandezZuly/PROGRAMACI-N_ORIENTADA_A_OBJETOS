package Figuras_Geometricas;

public class Triangulo extends Figura{
    //Atributos
    private float baseTri, alturaTri; 
    
    //Metodo constructor
    public Triangulo (float baseTri, float alturaTri){
        this.baseTri=baseTri;
        this.alturaTri=alturaTri;
    }

    //Metodo accesores 
    public float getBaseTri() {
        return baseTri;
    }
    public void setBaseTri(float baseTri) {
        this.baseTri = baseTri;
    }
    public float getAlturaTri() {
        return alturaTri;
    }
    public void setAlturaTri(float alturaTri) {
        this.alturaTri = alturaTri;
    }

    //Metodos de la subclase
    public void calcularArea(){
        float area=0;
        area=(baseTri*alturaTri)/2;
        System.out.println("La base del triangulo es " + baseTri + ", su altura es " + alturaTri + " y su área es " + area);
    }
}
