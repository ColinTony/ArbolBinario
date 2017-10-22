package arbolbinario;

/**
 *
 * @author colin
 * @param <E> Recibira clase u objeto que implemete o extienda de comparable
 */
public class ArbolBusquedaBinaria <E extends Comparable> extends ArbolBinario{
    
    /**
     * Metodo para insertar elementos al arbolito
     * @param elemento elemento para insertar
     */
    public void insertar(E elemento){
        Nodo nuevo = new Nodo(null, null, elemento); // nodo izq. y Der. nulos
        if(getRaiz() == null){
            this.setRaiz(nuevo);
        }else{
            Nodo temporal = this.getRaiz();
            Nodo padre;
            while(true){
                padre = temporal;
                if(elemento.compareTo(temporal.getElemento())<0){
                    temporal = temporal.getIzquierdo();
                    if(temporal == null){
                        padre.setIzquierdo(nuevo);
                        return;
                    }
                }else{
                    temporal = temporal.getDerecho();
                    if(temporal == null){
                        padre.setDerecho(nuevo);
                        return;
                    }
                }
            }
        }
    }
    
    /**
     * Metodo para insertar en el arbol
     * @param key llave del elemento
     * @param valor objeto
     */
    public void insertar (int key, Object valor){
        Nodo nuevo = new Nodo(key, null, null, valor); // nodo izq. y Der. nulos
        if(getRaiz() == null){
            this.setRaiz(nuevo);
        }else{
            Nodo temporal = this.getRaiz();
            Nodo padre;
            while(true){
                padre = temporal;
                if(key < temporal.getKey()){
                    temporal = temporal.getIzquierdo();
                    if(temporal == null){
                        padre.setIzquierdo(nuevo);
                        return;
                    }
                }else{
                    temporal = temporal.getDerecho();
                    if(temporal == null){
                        padre.setDerecho(nuevo);
                        return;
                    }
                }
            }
        }
        
    }
    
}
