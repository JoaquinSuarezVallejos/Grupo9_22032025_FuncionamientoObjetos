package Dispositivos;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private char tipo;
    private boolean smart;
    private Pantalla pantalla;
    private boolean encendido; // Estado del televisor

    // Constructor
    public Televisor(String marca, String modelo, int anioFabricacion, char tipo,
            boolean smart, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.smart = smart;
        this.pantalla = pantalla;
        this.encendido = false;
    }

    // Métodos para encender y apagar el televisor
    public void encender() {
        if (!encendido) {
            encendido = true;
            pantalla.encender(); // Aumenta el contador de televisores encendidos en la pantalla
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            pantalla.apagar(); // Disminuye el contador de televisores encendidos
        }
    }

    @Override
    public String toString() {
        String smartStr = smart ? "Smart" : "No Smart";
        String tipoDescripcion;
        switch (tipo) {
            case 'P':
                tipoDescripcion = "Plasma";
                break;
            case 'L':
                tipoDescripcion = "LCD";
                break;
            case 'O':
                tipoDescripcion = "OLED";
                break;
            default:
                tipoDescripcion = "Tipo desconocido";
        }
        return marca + " " + modelo + " -- " + "Año " + anioFabricacion + " -- " + pantalla.toString() + " -- " + smartStr +
                " -- Tipo " + tipoDescripcion + " -- Televisor " + (encendido ? "Encendido" : "Apagado");
    }
}
