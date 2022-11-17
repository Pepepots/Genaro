import java.util.ArrayList;

public class Stack<T> {
    
    ArrayList<T> data;
    int tope;
    int limite;

    public Stack(){
        data = new ArrayList<T>();
        tope = 0;
        limite = 0;
    }

    public Stack(int limite){
        data = new ArrayList<T>();
        tope = 0;
        this.limite = limite;
    }

    public boolean isFull() {
        if (limite == 0) {
            return false;
        }
        return tope == limite;
    }

    public void push(T valor) {
        if (!this.isFull()) {
            data.add(valor);
            tope++;
        } else {
            System.out.println("La pila esta llena");
        }
    }

    public boolean isEmpty() {
        return this.tope == 0;
    } 

    public int length() {
        return tope;
    }

    public T pop() {
        T dato = data.get(tope - 1);
        data.remove(tope - 1 );
        tope--;
        return dato;
    }
    public T peek() {
        return data.get(tope-1);
    }
    @Override
    public String toString(){
        String str = "";
        for (int i = tope - 1; i >= 0 ; i--) {
            str += "|" + data.get(i) + "| \n";
        }
        return str;
    }
}
