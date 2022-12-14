package sodaFide;

public class Orden {

    private int precio;
    private String Combo;
    private Persona personita;

    //constructor para inicializar
    public Orden(int precio, String Combo, String nombre, int cedula,
            boolean discapacidad) {
        this.precio = precio;
        this.Combo = Combo;
        // aca creamos a la persona que va a estar asociada a la orden
        this.personita = new Persona(nombre, cedula, discapacidad);

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCombo() {
        return Combo;
    }

    public void setCombo(String Combo) {
        this.Combo = Combo;
    }

    public Persona getPersonita() {
        return personita;
    }

    public void setPersonita(Persona personita) {
        this.personita = personita;
    }

    @Override
    public String toString() {
        return "Orden{ " + " precio: " + precio + ", " + Combo
                + ", Cliente: " + personita;
    }

}
