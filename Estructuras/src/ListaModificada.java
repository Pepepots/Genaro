public class ListaModificada extends ListaLigada<Integer[]> { 
    public void agregarImportancia(int importancia, Integer[] dato) {
        Nodo<Integer[]> currNode = head;

        if (currNode.data[0] > importancia) {
            preAppend(dato);
        }else{
            while (currNode != null ){
                if (currNode.next == null || currNode.next.data[0] > importancia) {
                    Nodo<Integer[]> tmp = currNode.next;
                    currNode.next = new Nodo<>(dato, tmp);
                    break;
                }
                currNode = currNode.next;
            }
            tamanio++;
        }
    }

    public Integer[] prePop() {
        Integer[] aux = head.data;
        head = head.next;
        tamanio--;
        return aux;
    }

    @Override
    public void transversal() {

        Nodo<Integer[]> currNode = this.head;
        while (currNode != null) {
            if (currNode.next == null) {
                System.out.print(currNode.data[1]);
            } else {
                System.out.print(currNode.data[1] + " ---> ");
            }
            currNode = currNode.next;
        }
        System.out.println("");
    }

}
