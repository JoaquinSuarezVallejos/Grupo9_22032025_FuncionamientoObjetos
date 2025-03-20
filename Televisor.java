public class Televisor {
    // Atributos básicos
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private char tipo; // 'P' para Plasma, 'L' para LCD, 'O' para OLED

    // Características adicionales
    private int pulgadas; // Tamaño de la pantalla en pulgadas
    private String resolucion; // Ejemplo: "1080p", "4K"
    private boolean smart; // true si es Smart, sino es false

    // Constructor para inicializar todas las características del televisor
    public Televisor(String marca, String modelo, int anioFabricacion, char tipo,
            int pulgadas, String resolucion, boolean smart) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.smart = smart;
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    // Método para mostrar la información de un televisor
    @Override
    public String toString() {
        String smartStr = smart ? "Smart" : "No Smart";
        return marca + " " + modelo + " -- " + pulgadas + " pulgadas -- "
                + resolucion + " -- " + smartStr;
    }
}
