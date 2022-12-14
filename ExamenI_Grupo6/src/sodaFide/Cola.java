package sodaFide;

public class Cola {

    private NodoCola frente;
    private NodoCola ultimo;
    public int largo;

    public Cola() {
    }

    //metodo que agrega una orden a la cola
    public void encola(Orden orden) {

        NodoCola nodito = new NodoCola();
        nodito.setOrden(orden);
        nodito.setAtras(null);

        if (ColaVacia()) {
            //si está vacía el primer nodo lo define como primero y último
            frente = nodito;
            ultimo = nodito;
        } else if (orden.getPersonita().isDiscapacidad()) {
            //si la persona es discapacitada, la pondrá de primera
            nodito.setAtras(frente);
            frente = nodito;
        } else {
            //si no está vacía el nuevo nodo lo manda de último
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
        largo++;
    }

    //metodo para determinar si la cola está vacía
    public boolean ColaVacia() {

        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    //metodo que elimina al primero de la cola
    public NodoCola eliminaPrimero() {

        NodoCola aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        largo--;
        return aux;
    }

    @Override
    public String toString() {
        String stringConTodalaInfodelaCola = "";
        NodoCola aux = frente;
        while (aux != null) {

            stringConTodalaInfodelaCola = stringConTodalaInfodelaCola
                    + aux.getOrden().toString() + "\n";
            aux = aux.getAtras();
        }
        stringConTodalaInfodelaCola = "<Frente>\n"
                + stringConTodalaInfodelaCola + "<Final>";
        return stringConTodalaInfodelaCola;
    }
}
