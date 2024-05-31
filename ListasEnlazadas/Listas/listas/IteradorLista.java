package listas;

/**
 * Clase que implementa un Iterador para una Lista Enlazada implementada mediante Referencias ("punteros").
 * Para asegurarnos de que se defina minimamente lo especificado por la InterfazIterador,
 * esta clase implementa dicha Interfaz.
 * <p>
 * Para evitar tener una version de esta clase por cada tipo de dato, se utiliza
 * Generics de Java para generalizar y parametrizar el tipo de dato a almacenar.
 *
 * @param <TipoDeDato> Tipo de Dato a almacenar dentro de la coleccion
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @author Prof. Saúl Zalimben (szalimben93@gmail.com)
 */
public class IteradorLista<TipoDeDato> implements InterfazIterador<TipoDeDato> {

    /**
     * Referencia a la nodoCabecera de la lista sobre la que se va a iterar
     */
    private NodoLista<TipoDeDato> nodoCabecera;
    /**
     * Referencia al nodo de la lista actualmente apuntado por el iterador
     */
    private NodoLista<TipoDeDato> nodoActual;
    /**
     * Variable auxiliar que indica la posicion nodoActual en la lista, que esta
     * siendo apuntada por el iterador
     */
    private int posActual;

    /**
     * Constructor de la clase.
     *
     * @param cabecera Referencia a la cabecera de la lista sobre la que se iterara
     */
    public IteradorLista(NodoLista<TipoDeDato> cabecera) {
        nodoCabecera = cabecera;
        nodoActual = cabecera;
        posActual = 0;
    }

    @Override
    public void first() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoDeDato next() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
