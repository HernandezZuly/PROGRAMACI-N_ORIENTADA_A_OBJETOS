package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera implements Juego{
    //Atributo
    private String nombre;
    private int maquina;
    private int jugador;

    Scanner lectura = new Scanner(System.in);
    
    public void iniciar() {
        System.out.println("Ingrese su nombre");
        nombre=lectura.next();
    }

    public void jugar() {
        System.out.println("Digite la opción con la que quiere jugar \n1.Piedra \n2.Papel \n.Tijera");
        jugador=lectura.nextInt();
        Random aleatorio = new Random();
        maquina=aleatorio.nextInt(3)+1;
        System.out.println("La maquina ya escogio");
    }
    
    public void finalizar() {
        if(jugador==1 && maquina==1){
            System.out.println(nombre + " quedaste en empate con la maquina");
        }else if(jugador==1 && maquina==2){
            System.out.println(nombre + " perdiste y la maquina ganó");
        }else if(jugador==1 && maquina==3){
            System.out.println(nombre + " ganaste y la maquina perdió");
        }else if(jugador==2 && maquina==2){
            System.out.println(nombre + " quedaste en empate con la maquina");
        }else if(jugador==2 && maquina==1){
            System.out.println(nombre + " ganaste y la maquina perdió");
        }else if(jugador==2 && maquina==3){
            System.out.println(nombre + " perdiste y la maquina ganó");
        }else if(jugador==3 && maquina==3){
            System.out.println(nombre + " quedaste en empate con la maquina");
        }else if(jugador==3 && maquina==1){
            System.out.println(nombre + " perdiste y la maquina ganó");
        }else if(jugador==3 && maquina==2){
            System.out.println(nombre + " ganaste y la maquina perdio");
        }    
    }
}
