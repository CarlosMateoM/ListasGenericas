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
public class TListaPrincipal<T> {
    
    private TNodoP <T> cabeza;
    
    public TListaPrincipal(){
        cabeza = null;
    }
    
    public void setCabeza(TNodoP<T> cabeza){
        this.cabeza = cabeza;
    }
    
    public TNodoP<T> getCabeza() {
        return cabeza;
    }

    public TNodoP<T> getUltimo() {
        TNodoP temp = getCabeza();
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public void agregar(TNodoP<T> nodo) {
        if (getCabeza() == null) {
            setCabeza(nodo);
        } else {
            getUltimo().setSiguiente(nodo);
        }
        nodo.setSiguiente(null);
    }

    public void insertar(TNodoP<T> nodo) {
        if (getCabeza() == null) {
            setCabeza(nodo);
            nodo.setSiguiente(null);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }

    }

    public TNodoP<T> anterior(TNodoP<T> nodo) {
        TNodoP temp = getCabeza();
        while(temp != null){
            if(temp.getSiguiente() == nodo){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(TNodoP <T> nodo){
        TNodoP anterior;
        if(nodo == getCabeza()){
            setCabeza(getCabeza().getSiguiente());
        }else{
            anterior = anterior(nodo);
            anterior.setSiguiente(nodo.getSiguiente());
        }
        nodo.setSiguiente(null);
        nodo.setDatos(null);
    }

    public TNodoP<T> nodoPosicion(int pos){
        int p = 0;
        TNodoP<T> nodo = getCabeza();
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
        TNodoP temp = getCabeza();
        while(temp != null){
            cantidad++;
            temp = temp.getSiguiente();
        }
        return cantidad;
    }
}
