package listas;

/**
 * Clase que implementa una Lista Enlazada mediante Referencias ("punteros").
 * Para asegurarnos de que se defina minimamente lo especificado por la InterfazLista,
 * esta clase implementa dicha Interfaz.
 * <p>
 * Para evitar tener una version de esta clase por cada tipo de dato, se utiliza
 * Generics de Java para generalizar y parametrizar el tipo de dato a almacenar.
 *
 * @param <TipoDeDato> Tipo de Dato a almacenar dentro de la lista
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @author Prof. Saúl Zalimben (szalimben93@gmail.com)
 */
public class ListaEnlazadaSimple<TipoDeDato> implements InterfazLista<TipoDeDato> {

    /**
     * Cabecera de la Lista. No almacena datos, solo el puntero al primer
     * elemento o NULL si la lista es vacia
     */
    private NodoLista<TipoDeDato> cabecera;
    /**
     * Tamanho actual de la lista
     */
    private int tamanoLista;

    /**
     * Constructor de la clase, se inicializa la lista
     */
    public ListaEnlazadaSimple() {
        tamanoLista = 0;
        cabecera = new NodoLista<>();
        cabecera.siguiente = null;
    }

    @Override
    public void insertar(TipoDeDato nuevoDato) {
        NodoLista<TipoDeDato> nuevoNodo = new NodoLista<>();
        nuevoNodo.dato = nuevoDato;
        nuevoNodo.siguiente = cabecera.siguiente;
        cabecera.siguiente = nuevoNodo;
        tamanoLista = tamanoLista + 1;
    }

    @Override
    public void insertar(TipoDeDato nuevoDato, int posicion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int buscar(TipoDeDato dato) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoDeDato obtenerDato(int posicion) throws Exception {
        int posActual = 1;
        TipoDeDato retorno = null;
        NodoLista<TipoDeDato> actual;

        if (posicion > 0 && posicion <= tamanoLista) {
            actual = cabecera.siguiente;
            while (actual != null) {
                if (posicion == posActual) {
                    retorno = actual.dato;
                    break;
                } else {
                    actual = actual.siguiente;
                    posActual++;
                }
            }
        } else {
            throw new Exception("Intento de acceso a posicion inexistente");
        }

        return retorno;
    }

    @Override
    public void eliminar() {
        if (!esVacia()) {
            cabecera.siguiente = cabecera.siguiente.siguiente;
            tamanoLista = tamanoLista - 1;
        }
    }

    @Override
    public void eliminar(int posicion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTamanoLista() {
        return tamanoLista;
    }

    @Override
    public boolean esVacia() {
        return tamanoLista == 0;
    }

    public IteradorLista<TipoDeDato> getIterador() {
        return new IteradorLista<>(cabecera);
    }
}
