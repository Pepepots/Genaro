public class ListaLigada<T> {
    private class Nodo<E> {

        E data;
        Nodo<E> next;

        public Nodo(E valor) {
            this.data = valor;
        }

        public Nodo(E valor, Nodo<E> siguiente) {
            this.data = valor;
            this.next = siguiente;
        }
    }

    private Nodo<T> head;
    private int tamanio;

    public ListaLigada() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    private Nodo<T> getTail() {
        Nodo<T> currNode = this.head;
        if ( !this.isEmpty() ) {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
        }
        return currNode;
    }

    public void append(T valor) {
        if (this.isEmpty()) {
            this.head = new Nodo<T>(valor);
        } else {
            this.getTail().next = new Nodo<T>(valor);
        }
        this.tamanio++;
    }
    
    public void preAppend( T valor ){
        Nodo<T> tmp = this.head;
        this.head = new Nodo<T>( valor, tmp );
        this.tamanio++;
    }

    public void transversal() {

        Nodo<T> currNode = this.head;
        while (currNode != null) {
            if (currNode.next == null) {
                System.out.print(currNode.data);
            } else {
                System.out.print(currNode.data + " ---> ");
            }
//            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("");
    }

    // public void remove(){
        
    // }

    public void agregarImportancia(int importancia, T dato) {
        Nodo<T> currNode = this.head;
        
        if(currNode.data.get >importancia){

        }
    }
    
}
