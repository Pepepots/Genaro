import java.util.ArrayList;

public class QueueAcotada<T> {
    ArrayList<Queue<T>> data;
    int size;

    public QueueAcotada(int niveles) {
        this.size = 0;
        data = new ArrayList<Queue<T>>();
        for (int i = 0; i < niveles; i++) {
            data.add(new Queue<T>());
        }
    }

    public boolean is_empty() {
        return this.size == 0;
    }

    public int length() {
        return this.size;
    }

    public void enqueue(int prioridad, T dato) {
        if (prioridad >= 0 && prioridad < data.size()) {
            data.get(prioridad).enqueue(dato);
            this.size++;
        }
    }

    public T dequeue() {
        if (!this.is_empty()) {
            for (Queue<T> queue : data) {
                if (!queue.is_empty()) {
                    this.size--;
                    return queue.dequeue();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {

        String str = "";

        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).is_empty()) {
                str += String.valueOf(i) + "." + this.data.get(i).getData() + "\n";
            } else {
                str += String.valueOf(i) + "." + this.data.get(i).toString() + "\n";
            }
        }

        return str;

    }

}
