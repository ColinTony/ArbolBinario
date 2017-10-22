package arbolbinario;

/**
 *
 * @author colin
 * @param <E> elemento
 */
public class Nodo <E>{
    // Agregamos una variable más a esta clase para saber
    // la llave o identificador del elemento para que sea LLave/Valor
    // y asi saber en que parte del arbol estamos
    private int key; 
    private Nodo <E> izquierdo; // Izquierdo
    private Nodo <E> derecho; // derecho
    private E elemento;

     
    /**
     * Contructor
     * @param key llave para posicion del elemento
     * @param izquierdo elemeto menor
     * @param derecho elemento mayor
     * @param elemento Objeto recibido
     */
    
    public Nodo(int key,Nodo<E> izquierdo, Nodo<E> derecho, E elemento) {
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.elemento = elemento;
        this.key = key;
    }

    /**
     * Constructor sin pedir la llave del elemento
     * @param izquierdo
     * @param derecho
     * @param elemento
     */
    public Nodo(Nodo<E> izquierdo, Nodo<E> derecho, E elemento) {
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.elemento = elemento;
    }
    
    // Getters y Setters

    /**
     *
     * @return devuelve nodo izq.
     */
    public Nodo<E> getIzquierdo() {
        return izquierdo;
    }

    /**
     *
     * @param izquierdo define nodo izq
     */
    public void setIzquierdo(Nodo<E> izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     *
     * @return devuelve nodo derecho
     */
    public Nodo<E> getDerecho() {
        return derecho;
    }

    /**
     *
     * @param derecho define nodo Derecho
     */
    public void setDerecho(Nodo<E> derecho) {
        this.derecho = derecho;
    }

    /**
     *
     * @return devuelve el elemento
     */
    public E getElemento() {
        return elemento;
    }

    /**
     *
     * @param elemento establece valor hacia el elemento
     */
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    /**
     *
     * @return
     */
    public int getKey() {
        return key;
    }

    /**
     *
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }
    
}
