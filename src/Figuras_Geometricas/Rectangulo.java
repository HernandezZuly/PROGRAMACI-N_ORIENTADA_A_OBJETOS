package Figuras_Geometricas;

public class Rectangulo extends Figura{
    //Atributos
    private float baseRec, alturaRec;

    //método constructor
    public Rectangulo(float baseRec, float alturaRec){
        this.baseRec=baseRec;
        this.alturaRec=alturaRec;
    } 

    //métodos accesores 
    public float getBaseRec() {
        return baseRec;
    }
    public void setBaseRec(float baseRec) {
        this.baseRec = baseRec;
    }
    public float getAlturaRec() {
        return alturaRec;
    }
    public void setAlturaRec(float alturaRec) {
        this.alturaRec = alturaRec;
    }

    //método de la subclase
    public void calcularArea(){
        float area=0;
        area=baseRec*alturaRec;
        System.out.println("La base del rectangulo es " + baseRec + ", su altura es " + alturaRec + " y su área es " + area);
    }

}
