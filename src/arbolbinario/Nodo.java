package arbolbinario;

/**
 *
 * @author colin
 * @param <E> elemento
 */
public class Nodo <E>{
    private Nodo <E> izquierdo; // Izquierdo
    private Nodo <E> derecho; // derecho
    private E elemento;
    
    // Getters y Setters
    public Nodo<E> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo<E> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo<E> getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo<E> derecho) {
        this.derecho = derecho;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    

    /**
     * Contructor
     * @param izquierdo elemeto menor
     * @param derecho elemento mayor
     * @param elemento Objeto recibido
     */
    
    public Nodo(Nodo<E> izquierdo, Nodo<E> derecho, E elemento) {
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.elemento = elemento;
    }
    
    
    
}
