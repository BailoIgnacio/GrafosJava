import Implementaciones.GrafoEstatico;
import Metodos.DijkstraBasico;

public class Main {
    public static void main(String[] args) {
        GrafoEstatico grafo = new GrafoEstatico();
        grafo.inicializarGrafo();

        grafo.agregarVertice(0);
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);

        grafo.agregarArista(0, 1, 4);
        grafo.agregarArista(0, 2, 2);
        grafo.agregarArista(1, 2, 5);
        grafo.agregarArista(1, 3, 10);
        grafo.agregarArista(2, 4, 3);
        grafo.agregarArista(4, 3, 4);

        int[] resultado = DijkstraBasico.dijkstra(grafo, 0);

        System.out.println("Distancias mínimas desde nodo 0:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Hasta " + i + ": " + (resultado[i] == 9999 ? "∞" : resultado[i]));
        }
    }
}
