package Clases;

public class Coche {
   /* Crear una clase coche.

    Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

    Una función que incremente el número de puertas que tiene el coche.

    Crear un objeto miCoche en el main y añadirle una puerta.

    Mostrar el número de puertas que tiene el objeto.*/

    //Atributos de la clase

       private int puertas;


       //Constructor con el mismo nombre de la clase
       public Coche(int puertas){
           this.puertas = puertas;

       }

       public void agregarPuertas(int cantidadPuertas)
       {
           this.puertas += cantidadPuertas;
           //Método vacío
       }
/* Getters y Setters */
public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
