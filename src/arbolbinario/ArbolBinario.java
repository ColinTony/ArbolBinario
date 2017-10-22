package arbolbinario;

/**
 *
 * @author colin
 * @param <E> Clase y Objeto de tipo Generico
 */
public class ArbolBinario <E>{
    private Nodo<E> raiz;

    /**
     * Constructor vacio
     */
    public ArbolBinario() {
        this.raiz = null; // inicializamos la raiz en null
    }
    
    // getters and setters

    /**
     *
     * @return devuelve la raiz
     */
    public Nodo<E> getRaiz() {
        return raiz;
    }

    /**
     *
     * @param raiz defina la raiz
     */
    public void setRaiz(Nodo<E> raiz) {
        this.raiz = raiz;
    }
    
    
    
    // Metodos para recorrer en Preorden

    /**
     * llama al metodo para recorrer en PreoOrden
     */
    public void recorrerPreorden(){
        this.recorrerPreorden(this.getRaiz());
    }

    /**
     * Visita la raiz , luego Izquierda y por ultimo derecha
     * @param raizSubArbol
     * @return devuelve un Nodo
     */
    public Nodo <E> recorrerPreorden(Nodo <E> raizSubArbol){
        if (raizSubArbol != null){
            System.out.println("Llave "+ raizSubArbol.getKey() 
                    + " Elemento : " + raizSubArbol.getElemento());
            recorrerPreorden(raizSubArbol.getIzquierdo());  
            recorrerPreorden(raizSubArbol.getDerecho());
            
        }
        return raizSubArbol;
    }
    // terminado los metodos PreOrden
    
    // Metodos para recorrer en inOrden

    /**
     * llama al metodo para recorrer InOrden
     */
    public void recorrerInOrden(){
        this.recorrerInOrden(this.getRaiz());
    }

    /**
     * Recorrer subArbol izquierdo , examinamos la raiz y despues subArbol derecho
     * @param raizSubArbol
     * @return devuelve un Nodo
     */
    public Nodo <E> recorrerInOrden(Nodo <E> raizSubArbol){
        if(raizSubArbol != null){
            this.recorrerInOrden(raizSubArbol.getIzquierdo());
            System.out.println("Llave "+ raizSubArbol.getKey() 
                    + " Elemento : " + raizSubArbol.getElemento());
            this.recorrerInOrden(raizSubArbol.getDerecho());
        }
        return raizSubArbol;
    }
    // fin de InOrder
    
    // Metodos para recorrer en PostOrden

    /**
     * ejecuta el metodo para recorrer en PostOrden
     */
    public void recorrerPostOrden(){
        this.recorrerPostOrden(this.getRaiz());
    }

    /**
     * primero visitamos hijo izq , hijo Der , Raiz
     * @param raizSubArbol
     * @return devuelve un Nodo
     */
    public Nodo <E> recorrerPostOrden(Nodo <E> raizSubArbol){
        if(raizSubArbol != null){
            this.recorrerPostOrden(raizSubArbol.getIzquierdo());
            this.recorrerPostOrden(raizSubArbol.getDerecho());
            System.out.println("Llave "+ raizSubArbol.getKey() 
                    + " Elemento : " + raizSubArbol.getElemento());
        }
        return raizSubArbol;
    }
    
    // Metodo para visitar 

    /**
     * Metodo para imprimir elemento del Arbol
     */
    public void visitar(){
        System.out.println(getRaiz().getElemento());
    }
}
