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
        String uno = "uno";
        String dos = "dos";
        String gato = "gato";
        String pollo = "pollo";
        String alce = "alce";
        String haz = "haz";
        String deporte = "deporte";
        ArbolBusquedaBinaria arbol = new ArbolBusquedaBinaria();
        
        arbol.insertar(2,uno);
        arbol.insertar(7,dos);
        arbol.insertar(2,gato);
        arbol.insertar(6,pollo);
        arbol.insertar(5,alce);
        arbol.insertar(11,haz);
        arbol.insertar(5,deporte);
        arbol.insertar(9,gato);
        arbol.insertar(4,gato);
       
       //arbol.recorrerInOrden(); // funcionando al 100%
       //arbol.recorrerPreorden();  // funcionando al 100%
       //arbol.recorrerPostOrden(); // funcionando al 100%
       arbol.visitar();
    }
    
}
