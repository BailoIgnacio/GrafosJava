package Metodos;

import interfaces.GrafosTDA;

public class DijkstraBasico {
    public static int[] dijkstra(GrafosTDA grafo, int origen) {
        int[] vertices = grafo.vertices();
        int n = vertices.length;

        int[] dist = new int[n];
        boolean[] visitado = new boolean[n];

        for (int i = 0; i < n; i++) {        // Inicializa distancias a infinito y visitados en false
            dist[i] = 9999; // usamos 9999 como "infinito"
            visitado[i] = false;
            if (vertices[i] == origen) {
                dist[i] = 0;
            }
        }

        for (int k = 0; k < n; k++) {
            int min = -1;
            int minValor = 9999;

            for (int i = 0; i < n; i++) {            // Busca el nodo no visitado con menor distancia
                if (!visitado[i] && dist[i] < minValor) {
                    min = i;
                    minValor = dist[i];
                }
            }

            if (min == -1) break; // Todos visitados o inaccesibles

            visitado[min] = true;
            int actual = vertices[min];
            int[] ady = grafo.adyacentes(actual);

            for (int j = 0; j < ady.length; j++) {
                int posVecino = buscarPosicion(ady[j], vertices);
                int nuevoValor = dist[min] + grafo.pesoArista(actual, ady[j]);

                if (nuevoValor < dist[posVecino]) {
                    dist[posVecino] = nuevoValor;
                }
            }
        }

        return dist;
    }

    private static int buscarPosicion(int valor, int[] array) {    // Función auxiliar para buscar la posición de un nodo en el arreglo de vértices
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) return i;
        }
        return -1;
    }
}