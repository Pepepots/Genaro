import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo<Integer> prueba = new Arreglo<Integer>(5);
        // prueba.limpiar(2);
        // prueba.setElemento(2, 5);
        // prueba.imprimir();
        // System.out.println(prueba.toString());
        
        // Array2D<Integer> pruebas2D = new Array2D<Integer>(2, 2);
        // pruebas2D.clear(1);
        // // pruebas2D.setItem(1, 1, 2);
        // // pruebas2D.setRen(1, 2);
        // pruebas2D.setCol(0, 2);
        // System.out.println(pruebas2D.getItem(0, 0));
        // pruebas2D.imprimir(); 

        // ListaLigada<Integer> lista = new ListaLigada<Integer>();
        // lista.append(1);
        // lista.append(2);
        // lista.append(3);
        // lista.transversal();
    
        ConjuntoADT<Integer> conjuntoA = new ConjuntoADT<Integer>();
        ConjuntoADT<Integer> conjuntoB = new ConjuntoADT<Integer>();
        conjuntoB.agregar(1);
        conjuntoB.agregar(2);
        conjuntoB.agregar(3);
        conjuntoA.agregar(1);
        conjuntoA.agregar(2);
        conjuntoA.agregar(4);

        // conjuntoA.agregar(2);
        //conjuntoA.eliminar(2);
        
        // conjuntoA.imprimir();
        // System.out.println(conjuntoA.contiene(2));
        // System.out.println(conjuntoB.equals(conjuntoA));
        System.out.println(conjuntoA.esSubConjunto(conjuntoB));
    }
}
