package dispositivos;

public class Pantalla {
    private int pulgadas;
    private String resolucion; // Ej: 4K, Full HD, HD, etc
    private int televisoresEncendidos; // Contador de televisores encendidos

    // Constructor
    public Pantalla(int pulgadas, String resolucion) {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.televisoresEncendidos = 0; // Al inicio, ningún televisor está encendido
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
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

    // La pantalla solo se apaga si ambos televisores están apagados
    public boolean isEncendida() {
        return televisoresEncendidos > 0;
    }

    @Override
    public String toString() {
        // Se muestra el número de pulgadas, la resolución y si la pantalla está encendida o apagada
        return pulgadas + " pulgadas -- " + resolucion + " -- " + (isEncendida() ? "Pantalla Compartida Encendida" : "Pantalla Compartida Apagada");
    }
}
