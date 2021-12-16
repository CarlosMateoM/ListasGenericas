/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listagenerica;

/**
 *
 * @author cmateo
 */
public class TListaGenerica <T> {
    private TNodo <T> cabeza;
    
    public TListaGenerica(){
        cabeza = null;
    }
    
    public void setCabeza(TNodo<T> cabeza){
        this.cabeza = cabeza;
    }
    
    public TNodo<T> getCabeza() {
        return cabeza;
    }

    public TNodo<T> getUltimo() {
        TNodo temp = getCabeza();
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public void agregar(TNodo<T> nodo) {
        if (getCabeza() == null) {
            setCabeza(nodo);
        } else {
            getUltimo().setSiguiente(nodo);
        }
        nodo.setSiguiente(null);
    }

    public void insertar(TNodo<T> nodo) {
        if (getCabeza() == null) {
            setCabeza(nodo);
            nodo.setSiguiente(null);
        } else {

            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }

    }

    public TNodo<T> anterior(TNodo<T> nodo) {
        TNodo temp = getCabeza();
        while(temp != null){
            if(temp.getSiguiente() == nodo){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(TNodo <T> nodo){
        TNodo anterior;
        if(nodo == getCabeza()){
            setCabeza(getCabeza().getSiguiente());
        }else{
            anterior = anterior(nodo);
            anterior.setSiguiente(nodo.getSiguiente());
        }
        nodo.setSiguiente(null);
        nodo.setDatos(null);
    }

    public TNodo<T> nodoPosicion(int pos){
        int p = 0;
        TNodo<T> nodo = getCabeza();
        while(nodo != null){
            if(p == pos){
             break;  
            }else{
                p++;
                nodo = nodo.getSiguiente();
            }
        }
        return nodo;
    }
    
    public void limpiarLista(){
        while(getCabeza() != null){
            eliminar(cabeza);
        }
    }
    
    public int contarNodos() {
        int cantidad = 0;
        TNodo temp = getCabeza();
        while(temp != null){
            cantidad++;
            temp = temp.getSiguiente();
        }
        return cantidad;
    }
}
