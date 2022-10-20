/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodaFide;

/**
 *
 * @author Wstov
 */
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

//    @Override
//    public String toString() {
//        return "Nombre: "+orden.getNombre()+
//                " Cedula: "+orden.getCedula();
//    }
//        
}
