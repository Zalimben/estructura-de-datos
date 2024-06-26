package pilas;

/**
 * Clase de prueba Pila
 *
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @author Prof. Saúl Zalimben (szalimben93@gmail.com)
 */
public class PruebaPila {

    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<>();
        Pila<String> pilaStr = new Pila<>();

        try {
            pila.apilar(1);
            pila.apilar(2);
            pila.apilar(3);

            int n = pila.tamanoPila();
            for (int i = 1; i <= n; i++) {
                System.out.println("Valor " + i + ": " + pila.desapilar());
            }

            //otra forma de iterar..
            pilaStr.apilar("a");
            pilaStr.apilar("b");
            pilaStr.apilar("c");
            while (!pilaStr.esVacia()) {
                System.out.println("Valor : " + pilaStr.desapilar());
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar el programa. " + e.getMessage());
        }

    }
}
