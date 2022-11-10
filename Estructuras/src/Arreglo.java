import java.util.ArrayList;

public class Arreglo<T> {

    int tamanio;
    ArrayList<T> datos;

    public Arreglo( int tam ) {
        this.tamanio = tam;
        datos = new ArrayList<T>();
        for (int i = 0; i < this.tamanio; i++) {
            datos.add(null);
        }
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setElemento( int indice, T valor) {
        this.datos.set(indice, valor);
    }

    public T getElemento( int indice ) {
        return this.datos.get(indice);
    }

    public void limpiar( T valor) {
        for (int i = 0; i < tamanio; i++) {
            datos.set( i, valor);
        }
    }

    // public void imprimir() {
    //     for (T dato : datos) {
    //         System.out.println(dato);
    //     }
    // }

    @Override
    public String toString() {
        String estado = "";

        for (T dato : datos) {
            if ( dato != null) {
                estado += dato.toString() + "\n";
            }
        }
        return estado;
    }

}
