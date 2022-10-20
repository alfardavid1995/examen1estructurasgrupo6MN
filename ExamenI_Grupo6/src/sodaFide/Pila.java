package sodaFide;

public class Pila {
    private NodoPila cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }
    
    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    public void push(Traste trastecito){
        NodoPila newNode = new NodoPila();
        newNode.setTrasteNodo(trastecito);
        
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{  
            if (cima.getTrasteNodo().isTieneCubiertos()){
             cima.getSiguiente().getTrasteNodo().isTieneCubiertos()
           }
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
          
        }
        this.largo++;
    }
    
    
    
        public void listar(){
        // Crea una copia de la pila.
        NodoPila aux = cima;
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            System.out.println("|\t" + aux.getTrasteNodo().toString()+ "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
