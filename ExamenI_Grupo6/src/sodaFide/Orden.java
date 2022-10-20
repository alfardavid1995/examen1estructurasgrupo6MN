
package sodaFide;


public class Orden {
    private int precio;
    private String Combo;
    private  Persona personita;
    private  boolean tieneCubiertos;
    
    public Orden(int precio, String Combo, String nombre, int cedula, boolean discapacidad, boolean tieneCubiertos ) {
        this.precio = precio;
        this.Combo = Combo;
        this.personita = new Persona(nombre, cedula, discapacidad);// aca creamos a la persona que va a estar asociada a la orden
        this.tieneCubiertos=tieneCubiertos;
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

    public boolean isTieneCubiertos() {
        return tieneCubiertos;
    }

    public void setTieneCubiertos(boolean tieneCubiertos) {
        this.tieneCubiertos = tieneCubiertos;
    }

    @Override
    public String toString() {
        return "Orden{" + "precio=" + precio + ", Combo=" + Combo + ", personita=" + personita + ", tieneCubiertos=" + tieneCubiertos + '}';
    }

   
    
    
}
