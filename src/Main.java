import Clases.Coche; // Importamos la Clase Coches que se encuentra en el package Clases
public class Main {
    public static void main(String[] args) {
        //Primera Parte
        /*
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
        */

        int a=1;
        int b=1;
        int c=1;

        int resultado = suma(a,b,c); // función de suma
        System.out.println("la suma de las 3 variables es : "+ resultado);

        //Fin de la Primera Parte

        //Segunda Parte
        /*
         Crear una clase coche.
         Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
         Una función que incremente el número de puertas que tiene el coche.
         Crear un objeto miCoche en el main y añadirle una puerta.
         Mostrar el número de puertas que tiene el objeto.*/

         Coche miCoche = new Coche(2); //Creo un Objeto de la Clase Coche con 2 puertas
         miCoche.agregarPuertas(1);//Le agrego 1 Puerta utilizando el metodo AgregarPuertas de la clase Coche
         System.out.println("el coche ahora tiene :"+miCoche.getPuertas()+" puertas");

    }
    //Creamos la Funcion suma. que tendra 3 parametros, y devolverá la suma de los 3, en este caso 3 enteros
    public static int suma(int a, int b, int c){
        return a+b+c;
    }

}
