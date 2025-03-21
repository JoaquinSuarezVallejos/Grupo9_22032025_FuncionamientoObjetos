import Dispositivos.Pantalla;
import Dispositivos.Televisor;

public class Main {
    public static void main(String[] args) {
        // Se crea un objeto Pantalla que será compartido por dos televisores
        Pantalla pantallaCompartida = new Pantalla(65, "4K");

        // Creación de dos televisores que comparten la misma pantalla
        Televisor tv1 = new Televisor("LG", "55CX", 2021, 'O', true, pantallaCompartida);
        Televisor tv2 = new Televisor("Sony", "BraviaX85", 2022, 'L', true, pantallaCompartida);

        // Mostrar estado inicial de los televisores y la pantalla
        System.out.println("Estado inicial:");
        System.out.println(tv1);
        System.out.println(tv2);

        // Encender el primer televisor
        System.out.println("\nEncendiendo tv1...");
        tv1.encender();
        System.out.println(tv1);
        System.out.println(tv2);

        // Encender el segundo televisor
        System.out.println("\nEncendiendo tv2...");
        tv2.encender();
        System.out.println(tv1);
        System.out.println(tv2);

        // Apagar el segundo televisor
        System.out.println("\nApagando tv2...");
        tv2.apagar();
        System.out.println(tv1);
        System.out.println(tv2);

        // Apagar el primer televisor
        System.out.println("\nApagando tv1...");
        tv1.apagar();
        System.out.println(tv1);
        System.out.println(tv2);
    }
}
