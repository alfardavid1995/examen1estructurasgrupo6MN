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
public class Cola {
    private NodoCola frente;
    private NodoCola finall;
    public int largo;

    public Cola(){}

    public void encola(NodoCola valor){
        if(valor.getPersona().isDiscapacidad()){
            if (frente == null){
                frente = valor;
                finall = valor;
            }else {//Trabajar logicamente este elmento
                NodoCola aux;
                aux = frente;
                frente = valor;
                finall.setAtras(aux);
            }
        }else {
            if (frente == null){
                frente = valor;
                finall = valor;

            }else {
                finall.setAtras(valor);
                finall = valor;
            }
        }
        largo++;
    }

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
    public String toString(){
        String s = "";
        NodoCola aux = frente;
        while(aux != null){
            s += aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
