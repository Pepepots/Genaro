public class PriorityQueue {
    ListaModificada cola;

    public PriorityQueue() {
        cola = new ListaModificada();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public int length() {
        return cola.tamanio;
    }

    public void enqueue( int prioridad, int dato ) {
        Integer par[] = { prioridad, dato };

        if ( cola.isEmpty() ) {
            cola.append(par);
        } else {
            cola.agregarImportancia(prioridad, par);
        }
    }

    public Integer[] dequeue() {
        if (!cola.isEmpty()) {
            return cola.prePop();
        }
        return null;
    }

    public void transversal(){
        cola.transversal();
    }

}
