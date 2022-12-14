package sodaFide;

public class Persona {

    private String nombre;
    private int cedula;
    private boolean discapacidad;

//constructor para inicializar
    public Persona(String nombre, int cedula, boolean discapacidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.discapacidad = discapacidad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public String toString() {
        return " " + nombre + ", cedula: " + cedula
                + ", discapacidad: " + discapacidad + '}';
    }

}
