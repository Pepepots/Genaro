import java.util.ArrayList;

public class Array2D<T> {

    int ren;
    int col;
    ArrayList<ArrayList<T>> datos;

    public Array2D ( int ren, int col ) {
        this.ren = ren;
        this.col = col;
        datos = new ArrayList<ArrayList<T>>();
        for (int i = 0; i < this.ren; i++) {
            datos.add(new ArrayList<T>());
            for (int j = 0; j < this.col; j++) {
                datos.get(i).add(null);
            }
        }
    }

    public void clear( T dato ) {
        for (ArrayList<T> ren : datos) {
            for (int i = 0; i < ren.size(); i++) {
                ren.set(i, dato);
            }
        }
    }

    public int getCol() {
        return this.col;
    }

    public int getRen() {
        return this.ren;
    }
    
    public T getItem(int ren, int col) {
        return datos.get(ren).get(col);
    }

    public void setItem(int ren, int col, T dato ){
        datos.get(ren).set(col, dato);
    }

    public void setRen( int ren, T dato ){
        for (int i = 0; i < this.col; i++) {
            datos.get(ren).set(i, dato);
        }
    }

    public void setCol(int col, T dato){
        for (int i = 0; i < this.ren; i++) {
            datos.get(i).set(col, dato);
        }
    }

    public void imprimir() {
        for (int i = 0; i < this.ren; i++) {
            System.out.println(datos.get(i));
            // for (int j = 0; j < this.col; j++) {
            // }
        }
    }
    


}
