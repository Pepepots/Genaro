public class ListasADT<T> {
    Nodo<T> head;
    int tamanio;

    public ListasADT() {
        head = null;
        tamanio = 0;
    }

    public boolean vacio() {
        return this.head == null;

    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void agregarAlFinal(T valor) {
        if (this.head == null) {
            head = new Nodo<T>(valor);
        } else {
            Nodo<T> currNode = head;

            while (currNode.getSiguiente() != null) {
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new Nodo<>(valor));

        }
        this.tamanio++;

    }

    // public void transversal() {
    //     Nodo<T> currNode = head;
    //     String str = "";

    //     while (currNode != null) {
    //         str = str + currNode.getDato() + "-->"; 
    //         currNode = currNode.getSiguiente();
    //     }
    //     tmp
    //     System.out.println(str);
    // }

    public void agregarAlInicio(T valor) {
        if (head==null) {
            head = new Nodo<T>(valor);
        }
        else{
            Nodo<T>currNode = head;
            currNode.getSiguiente().setSiguiente(head);
            head= currNode;
        }
        
    }
    public void agregarDespuesDe() {
        
    }

}
