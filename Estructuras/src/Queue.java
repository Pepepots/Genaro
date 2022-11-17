import java.util.ArrayList;

public class Queue <T>{

    ArrayList<T> cola;
    int tamanio;
    
    public Queue() {
        cola = new ArrayList<T>();
        tamanio = 0;
    }

    public boolean is_empty() {
        return this.tamanio == 0;
    }

    public int length() {
        return this.tamanio;
    }

    public void enqueue(T elemento) {
        cola.add(elemento);
        tamanio++;
    }

    public T dequeue() {
        T dato = cola.get(0);
        cola.remove(0);
        tamanio--;
        return dato;
    }

    @Override
    public String toString() {
        String str= "";
        for (int i = 0; i <tamanio ; i++) {
            str+="|"+cola.get(i)+"|";
        }
        
        return str;  
    }


}
