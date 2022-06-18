import Clases.Coche;
public class Main {
    public static void main(String[] args) {
        int cantPuertas=2;
        Coche miCoche = new Coche(cantPuertas);

        int a=1;
        int b=1;
        int c=1;

        int resultado = suma(a,b,c);
        miCoche.agregarPuertas(2);
        System.out.println(resultado);
        System.out.println(miCoche.getPuertas());

    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

}
