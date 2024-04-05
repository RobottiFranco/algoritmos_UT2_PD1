package com.example;

public final class App {
    public static void main(String[] args) {

        String[] archivo = ManejadorArchivosGenerico.leerArchivo("src\\main\\java\\com\\example\\numeros.txt");
        int N = Integer.parseInt(archivo[0]);
        int[] arreglo = new int[N];

        for (int i = 0; i < N; i++) {
            arreglo[i] = Integer.parseInt(archivo[i + 1]);
        }

        int contadorSi = miFuncion(arreglo);

        System.out.println("Largo N: " + N);
        System.out.println("Contador si: " + contadorSi);
        System.out.println("Primer número: " + arreglo[0]);
        System.out.println("Último número: " + arreglo[N - 1]);
    }



    public static int miFuncion(int[] arreglo) {
        int contadorSi = 0;
        int temp;
        int N = arreglo.length;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = N; j < i + 1; j--) {
                contadorSi++;
                if (arreglo[j] < arreglo[j - 1]) {
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = temp;
                }
            }
        }
        return contadorSi;
    }
}
