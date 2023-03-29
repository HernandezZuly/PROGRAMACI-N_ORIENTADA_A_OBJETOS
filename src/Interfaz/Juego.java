package Interfaz;

//implementa dos juegos 
public interface Juego {
    //dentro de la interfaz solo se puede implementar los metodos necesarios, pueden ser publicos o abstractos 
    //declarar metodos en común de los juegos
    void iniciar();
    void jugar();
    void finalizar();
}
