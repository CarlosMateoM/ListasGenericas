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
public class TNodoP<T>  {

    private T datos;
    private TNodoP siguiente;
    private TListaGenerica lista;
    
    public TNodoP(){
        datos = null;
        siguiente = null;
        lista = new TListaGenerica<TProducto>();
    }
    
    public T getDatos() {
        return datos;
    }   

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public TNodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(TNodoP siguiente) {
        this.siguiente = siguiente;
    }

    public TListaGenerica getLista() {
        return lista;
    }

    public void setLista(TListaGenerica lista) {
        this.lista = lista;
    }  
}
