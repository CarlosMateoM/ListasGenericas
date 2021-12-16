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
public class TNodo <T> {
    
    private T datos;
    private TNodo <T> siguiente;
    
    public <T> TNodo(){
        datos = null;
        siguiente = null;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public TNodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(TNodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
}
