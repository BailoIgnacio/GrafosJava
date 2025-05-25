package Implementaciones;

import interfaces.GrafoDinamicoTDA;

public class GrafoDinamico implements GrafoDinamicoTDA {
    private int[] nodos;
    private int[][] adyacentes;
    private int[][] pesos;
    private int[] cantAdy;
    private int cantNodos;

    public void inicializarGrafo() {
        nodos = new int[100];
        adyacentes = new int[100][100];
        pesos = new int[100][100];
        cantAdy = new int[100];
        cantNodos = 0;
    }

    public void agregarVertice(int vertice) {
        if (!existeVertice(vertice)) {
            nodos[cantNodos] = vertice;
            cantAdy[cantNodos] = 0;
            cantNodos++;
        }
    }

    public void agregarArista(int origen, int destino, int peso) {
        int i = posicion(origen);
        int j = posicion(destino);
        if (i != -1 && j != -1) {
            adyacentes[i][cantAdy[i]] = destino;
            pesos[i][cantAdy[i]] = peso;
            cantAdy[i]++;
        }
    }

    public boolean existeVertice(int vertice) {
        return posicion(vertice) != -1;
    }

    public boolean existeArista(int origen, int destino) {
        int i = posicion(origen);
        if (i != -1) {
            for (int j = 0; j < cantAdy[i]; j++) {
                if (adyacentes[i][j] == destino) return true;
            }
        }
        return false;
    }

    public int pesoArista(int origen, int destino) {
        int i = posicion(origen);
        if (i != -1) {
            for (int j = 0; j < cantAdy[i]; j++) {
                if (adyacentes[i][j] == destino) {
                    return pesos[i][j];
                }
            }
        }
        return 9999;
    }

    public int[] vertices() {
        int[] copia = new int[cantNodos];
        for (int i = 0; i < cantNodos; i++) copia[i] = nodos[i];
        return copia;
    }

    public int[] adyacentes(int vertice) {
        int i = posicion(vertice);
        int[] resultado = new int[cantAdy[i]];
        for (int j = 0; j < cantAdy[i]; j++) {
            resultado[j] = adyacentes[i][j];
        }
        return resultado;
    }

    private int posicion(int vertice) {
        for (int i = 0; i < cantNodos; i++) {
            if (nodos[i] == vertice) return i;
        }
        return -1;
    }
}
