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
            //si la cima trae 
//            if (cima.getTrasteNodo().isTieneCubiertos()){
//             cima.getSiguiente().getTrasteNodo().setTieneCubiertos(false);
//           }else{
//                if(cima.getSiguiente().getTrasteNodo().isTieneCubiertos() != true){
//                    cima.getTrasteNodo().setTieneCubiertos(false);
//                }
//              
//            }
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
          
        }
        this.largo++;
    }

      @Override
    public String toString(){
        String stringConTodalaInfodelaPila="";
        NodoPila aux=cima;
        while(aux!=null){
            
            stringConTodalaInfodelaPila=stringConTodalaInfodelaPila
                    +aux.getTrasteNodo().toString()+"\n";
            aux=aux.getSiguiente();
        }
        stringConTodalaInfodelaPila="<Cima>\n"
                + stringConTodalaInfodelaPila+"<Final>"; 
        return stringConTodalaInfodelaPila;
    }
    
    
     
    
}
