package sodaFide;

public class Pila {

    private NodoPila cima;
    private int largo;

    //constructor para inicializar
    public Pila() {
        this.cima = null;
        this.largo = 0;
    }

    //metodo para verificar si la pila esta vacia
    public boolean Vacia() {
        return cima == null;
    }

    //metodo que retorna el tamaño de la pila
    public int tamanio() {
        return this.largo;
    }

    //metodo para agregar una plato a la pila
    public void push(Traste trastecito) {
        NodoPila newNode = new NodoPila();
        newNode.setTrasteNodo(trastecito);
        
        //verifica si la pila esta vacia 
        if (this.Vacia()) {
            //si la pila esta vacia
            //agrega el plato como unico nodo en la pila
            this.cima = newNode;
        } else {
       //en caso de que la pila no este vacia, agrega el nuevo plato a la cima
       //y la antigua cima la envia a siguiente
            newNode.setSiguiente(this.cima);     
            this.cima = newNode;
      //verifica si la antigua cima tiene cubiertos o no
            if (cima.getSiguiente().getTrasteNodo().isTieneCubiertos()) {
      //si tiene cubiertos pasa los cubiertos de la antigua cima a la nueva cima
                cima.getSiguiente().getTrasteNodo().setTieneCubiertos(false);
                cima.getTrasteNodo().setTieneCubiertos(true);
            }

        }
        this.largo++;
    }

    @Override
    public String toString() {
        String stringConTodalaInfodelaPila = "";
        NodoPila aux = cima;
        while (aux != null) {

            stringConTodalaInfodelaPila = stringConTodalaInfodelaPila
                    + aux.getTrasteNodo().toString() + "\n";
            aux = aux.getSiguiente();
        }
        stringConTodalaInfodelaPila = "<Cima>\n"
                + stringConTodalaInfodelaPila + "<Final>";
        return stringConTodalaInfodelaPila;
    }

}
