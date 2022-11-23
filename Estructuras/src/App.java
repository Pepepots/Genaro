// import java.util.ArrayList;

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

        // ConjuntoADT<Integer> conjuntoA = new ConjuntoADT<Integer>();
        // ConjuntoADT<Integer> conjuntoB = new ConjuntoADT<Integer>();
        // conjuntoB.agregar(1);
        // conjuntoB.agregar(2);
        // conjuntoB.agregar(3);
        // conjuntoA.agregar(1);
        // conjuntoA.agregar(2);
        // conjuntoA.agregar(4);

        // conjuntoA.agregar(2);
        // conjuntoA.eliminar(2);

        // conjuntoA.imprimir();
        // System.out.println(conjuntoA.contiene(2));
        // System.out.println(conjuntoB.equals(conjuntoA));
        // System.out.println(conjuntoA.esSubConjunto(conjuntoB));

        // Stack<Integer> pilaA = new Stack<Integer>();
        // pilaA.push(5);
        // pilaA.push(4);
        // pilaA.push(7);
        // pilaA.push(3);

        // System.out.println(pilaA.isEmpty());
        // System.out.println(pilaA.length());
        // System.out.println(pilaA.peek());
        // System.out.println(pilaA.toString());

        // Stack<Integer> pilaB = new Stack<Integer>(2);
        // pilaB.push(5);
        // pilaB.push(4);
        // pilaB.push(7);

        // Queue<Integer> colaA = new Queue<Integer>();
        // colaA.enqueue(58);
        // colaA.enqueue(4);
        // colaA.enqueue(18);
        // int quienSigue = colaA.dequeue();
        
        // System.out.println(quienSigue);
        // System.out.println(colaA.is_empty());
        // System.out.println(colaA.length());

        // System.out.println("");

        // System.out.println(colaA.toString());

        // ListasADT<Integer> prueba = new ListasADT<Integer>();

        // prueba.agregarAlFinal(1);
        // prueba.agregarAlFinal(2);
        // prueba.agregarAlFinal(3);
        // prueba.agregarAlFinal(4);
        // prueba.agregarAlInicio(98);

        // prueba.transversal();

        // PriorityQueue cola = new PriorityQueue();
        // cola.enqueue(1, 2);
        // cola.enqueue(1, 3);
        // cola.enqueue(1, 1);
        // cola.enqueue(0, 5);
        // cola.enqueue(80, 78);
        // cola.enqueue(3, 67);
        // cola.enqueue(4, 799);
        // cola.dequeue();
        // cola.transversal();

        QueueAcotada<Integer> colaAcotada = new QueueAcotada<Integer>(3);
        colaAcotada.enqueue(0, 1);
        colaAcotada.enqueue(1, 2);
        colaAcotada.enqueue(0, 3);
        colaAcotada.enqueue(1, 1);
        System.out.println(colaAcotada.toString());
    }

}
