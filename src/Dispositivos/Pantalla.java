package Dispositivos;

public class Pantalla {
    private int pulgadas;
    private String resolucion;
    private int televisoresEncendidos; // Contador de televisores encendidos

    // Constructor
    public Pantalla(int pulgadas, String resolucion) {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.televisoresEncendidos = 0; // Al inicio, ningún televisor está encendido
    }

    // Método para encender la pantalla (aumenta el contador de televisores encendidos)
    public void encender() {
        televisoresEncendidos++;
    }

    // Método para apagar la pantalla (reduce el contador, pero solo se apaga si llega a 0)
    public void apagar() {
        if (televisoresEncendidos > 0) {
            televisoresEncendidos--;
        }
    }

    // La pantalla solo se apaga si no hay televisores encendidos
    public boolean isEncendida() {
        return televisoresEncendidos > 0;
    }

    @Override
    public String toString() {
        return pulgadas + " pulgadas -- " + resolucion + " -- " + (isEncendida() ? "Pantalla Compartida Encendida" : "Pantalla Compartida Apagada");
    }
}
