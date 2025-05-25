import Implementaciones.GrafoDinamico;
import interfaces.GrafoDinamicoTDA;

public class Main {
    public static void main(String[] args) {
        GrafoDinamicoTDA grafo = new GrafoDinamico();
        grafo.inicializarGrafo();

        grafo.agregarVertice(1);        // Agrega vértices
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);

        grafo.agregarArista(1, 2, 5);        // Agrega aristas con pesos
        grafo.agregarArista(1, 3, 3);
        grafo.agregarArista(2, 4, 2);
        grafo.agregarArista(3, 4, 4);

        System.out.println("Vértices en el grafo:");        // Muestra vértices
        int[] vertices = grafo.vertices();
        for (int v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println("\n");
 
        for (int v : vertices) {       // Muestra adyacentes de cada vértice
            System.out.println("Adyacentes de " + v + ":");
            int[] ady = grafo.adyacentes(v);
            for (int a : ady) {
                int peso = grafo.pesoArista(v, a);
                System.out.println("  → " + a + " (peso " + peso + ")");
            }
        }

        System.out.println("\n¿Existe arista de 1 a 3? " + grafo.existeArista(1, 3));// Verificar si existen algunas aristas
        System.out.println("¿Existe arista de 2 a 3? " + grafo.existeArista(2, 3));
    }
}
