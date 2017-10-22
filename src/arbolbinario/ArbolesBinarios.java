package arbolbinario;

/**
 *
 * @author colin
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String gato = "gato";
        String perro = "perro";
        String animal = "animal";
        String coco = "coco";
       ArbolBusquedaBinaria arbol = new ArbolBusquedaBinaria();
       
       arbol.insertar(8, gato);
       arbol.insertar(3, coco);
       arbol.insertar(10, gato);
       arbol.insertar(14, coco);
       arbol.insertar(13, perro);
       arbol.insertar(1, perro);
       arbol.insertar(6, gato);
       arbol.insertar(4, gato);
       arbol.insertar(7, coco);
       
       //arbol.recorrerInOrden(); // funcionando al 100%
       //arbol.recorrerPreorden();  // funcionando al 100%
       arbol.recorrerPostOrden(); // funcionando al 100%
       
    }
    
}
