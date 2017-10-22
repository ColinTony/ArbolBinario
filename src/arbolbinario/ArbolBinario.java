package arbolbinario;

/**
 *
 * @author colin
 * @param <E> Clase y Objeto de tipo Generico
 */
public class ArbolBinario <E>{
    private Nodo<E> raiz;

    public ArbolBinario() {
        this.raiz = null; // inicializamos la raiz en null
    }
    
    // getters and setters
    public Nodo<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<E> raiz) {
        this.raiz = raiz;
    }
    
    
    
    // Metodos para recorrer en Preorden
    public void recorrerPreorden(){
        this.recorrerPreorden(this.getRaiz());
    }
    public Nodo <E> recorrerPreorden(Nodo <E> raizSubArbol){
        // Visita la raiz , luego Izquierda y por ultimo derecha
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
    public void recorrerInOrden(){
        this.recorrerInOrden(this.getRaiz());
    }
    public Nodo <E> recorrerInOrden(Nodo <E> raizSubArbol){
        // Recorrer subArbol izquierdo , examinamos la raiz y despues subArbol derecho
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
    public void recorrerPostOrden(){
        this.recorrerPostOrden(this.getRaiz());
    }
    public Nodo <E> recorrerPostOrden(Nodo <E> raizSubArbol){
        // primero visitamos hijo izq , hijo Der , Raiz
        if(raizSubArbol != null){
            this.recorrerPostOrden(raizSubArbol.getIzquierdo());
            this.recorrerPostOrden(raizSubArbol.getDerecho());
            System.out.println("Llave "+ raizSubArbol.getKey() 
                    + " Elemento : " + raizSubArbol.getElemento());
        }
        return raizSubArbol;
    }
    
    // Metodo para visitar 
    public void visitar(){
        
    }
}
