package Figuras_Geometricas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nomFigura;
        int respuesta;
        Scanner lectura = new Scanner(System.in);
        do{
            System.out.println("Digite el nombre de la figura a la que le quiere calcular el área (triangulo, rectangulo o circulo)");
            nomFigura=lectura.next();
            if(nomFigura.equals("rectangulo")){
                float baseRec, alturaRec;
                System.out.println("Ingrese el valor de la base del rectángulo");
                baseRec=lectura.nextFloat();
                System.out.println("Ingrese el valor de la altura del rectángulo");
                alturaRec=lectura.nextFloat();
                //crear e invocar el objeto de la subclase rectangulo
                Rectangulo rectan = new Rectangulo(baseRec, alturaRec);
                rectan.calcularArea();
            }else if(nomFigura.equals("triangulo")){
                float baseTri, alturaTri;
                System.out.println("Ingrese el valor de la base del triangulo");
                baseTri=lectura.nextFloat();
                System.out.println("Ingrese el valor de la altura del triangulo");
                alturaTri=lectura.nextFloat();
                //crear e invocar el objeto de la subclase triangulo
                Triangulo tri = new Triangulo(baseTri, alturaTri);
                tri.calcularArea();
            }else if(nomFigura.equals("circulo")){
                float radio;
                System.out.println("Ingrese el valor del radio del circulo");
                radio=lectura.nextFloat();
                //crear e invocar el objeto de la subclase circulo
                Circulo circu = new Circulo(radio);
                circu.calcularArea();
            }else{
                System.out.println("Esa figura geometrica no esta disponible o digitó el nombre de la figura mal");
            }
            System.err.println("Desea calcular el área de otra figura? 1.Si o 2.No");
            respuesta=lectura.nextInt();
        }while(respuesta==1);
        lectura.close();
    }
    
}
