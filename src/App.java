public class App {
    public static void main(String[] args) throws Exception {
        Metodos burbujas = new Metodos();
        int[] arreglo = {5, 7, 43, 12, 10};

        // Ordenar de manera ascendente
        int[] arregloOrdenado = burbujas.burbuja(arreglo);

        // Imprimir el arreglo ordenado de manera ascendente
        burbujas.printarreglo(arregloOrdenado);

        // Ordenar el mismo arreglo de manera descendente
        int[] arregloDescendente = burbujas.burbujaDescendente(arregloOrdenado);

        // Imprimir el arreglo ordenado de manera descendente
        burbujas.printdescent(arregloDescendente);
        //Ordenar las palabras alfabeticamente de la cadena de texto:
        String cadena= "este es un ejemplo de texto para Ordenar";
        String [] palabras= cadena.split(" ");
        String [] palabrasOrdenadas= burbujas.sortByBubble(palabras);

        burbujas.printArreglo(palabrasOrdenadas);
    }
    }
