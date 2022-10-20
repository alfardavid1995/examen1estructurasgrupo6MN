
package sodaFide;


public class Orden {
    private int precio;
    private String Combo;
    private  Persona personita;

    public Orden(int precio, String Combo, Persona personita) {
        this.precio = precio;
        this.Combo = Combo;
        this.personita = personita;
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
        return "Orden{" + "precio=" + precio + ", Combo=" + Combo + ", personita=" + personita + '}';
    }
    
    
    
}
