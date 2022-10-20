package sodaFide;

public class Traste {
    private int id ;
    private boolean tieneCubiertos;
    
    public Traste() {
    }

    public Traste(int id, boolean tieneCubiertos) {
        this.id =id;
        this.tieneCubiertos = tieneCubiertos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTieneCubiertos() {
        return tieneCubiertos;
    }

    public void setTieneCubiertos(boolean tieneCubiertos) {
        this.tieneCubiertos = tieneCubiertos;
    }

    @Override
    public String toString() {
        return "Traste{" + "id=" + id + ", tieneCubiertos=" + tieneCubiertos + '}';
    }
        
        
}
