import java.util.ArrayList;

public class ConjuntoADT<T> {

    ArrayList<T> conjunto;
    int longitud = 0;

    public ConjuntoADT() {
        this.conjunto = new ArrayList<>();
    }

    public int longitud() {
        return this.longitud;
    }

    public ArrayList<T> getDatos() {
        return this.conjunto;
    }

    public boolean contiene(T elemento) {
        for (T elementoConjunto : conjunto) {
            if (elementoConjunto == elemento) {
                return true;
            }
        }
        return false;
    }

    public void agregar(T elemento) {
        if (this.contiene(elemento)) {
            System.out.println("El elemto " + elemento + " ya esta en el conjunto");
        } else {
            conjunto.add(elemento);
        }
    }

    public void eliminar(T elemento) {
        if (this.contiene(elemento)) {
            conjunto.remove(elemento);
        } else {
            System.out.println("El elemento %s no esta en el conjunto".formatted(elemento));
        }
    }

    public boolean equals(ConjuntoADT<T> otroConjunto) {
        for (T elementoConjunto : conjunto) {
            if (!otroConjunto.contiene(elementoConjunto)) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubConjunto(ConjuntoADT<T> otroConjunto) {
        if (this.longitud <= otroConjunto.longitud()) {
            for (T elementoConjunto : conjunto) {
                if (!otroConjunto.contiene(elementoConjunto)) {
                    return false;
                }
            }
            return true;
        }
        System.out.println("El conjunto recibido es mas grande como para comparar");
        return false;
    }

    public ConjuntoADT<T> union(ConjuntoADT<T> otroConjunto) {
        ConjuntoADT<T> conjuntoNuevo = new ConjuntoADT<T>();
        for (T elementoConjunto : conjunto) {
            if (otroConjunto.contiene(elementoConjunto)) {
                conjuntoNuevo.agregar(elementoConjunto);
            }
        }
        return conjuntoNuevo;
    }

    public void imprimir() {
        System.out.println(conjunto);
    }

}
