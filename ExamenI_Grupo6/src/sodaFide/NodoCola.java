
package sodaFide;

public class NodoCola {
    private NodoCola atras;
    private Orden orden;

    public NodoCola() {
    }

    public NodoCola(Orden orden) {
        this.orden = orden;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
        }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "NodoCola{" + "atras=" + atras + ", orden=" + orden + '}';
    }

  
}
