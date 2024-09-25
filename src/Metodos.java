public class Metodos {
    public Metodos(){
        System.out.println("Se creo la clase metodos");
    }
 public int[] burbuja(int[]arreglo){
    int tamano= arreglo.length;
    for (int i = 0; i < tamano; i++) {
        for (int j=i+1 ; j < tamano; j++) {
           if(arreglo[i]>arreglo[j]){
           int aux=arreglo[i];
           arreglo[i]=arreglo[j];
           arreglo[j]=aux;

           } 
        }
    }
    return arreglo;
 } 
 public void printarreglo(int[]arreglo){
    System.out.println("De manera ascendente");
    for (int elemento : arreglo) {
        System.out.print(elemento+" ");
    }
 }
 public int[] burbujaDescendente(int[] arreglo) {
    int tamano = arreglo.length;
    for (int i = 0; i < tamano - 1; i++) {
        for (int j = 0; j < tamano - 1 - i; j++) {
            if (arreglo[j] < arreglo[j + 1]) {
                int aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
            }
        }
    }
    return arreglo;  
 } 
 public void printdescent(int[]arreglo){
    System.out.println("\nDe manera descendente: ");
    for (int elemento : arreglo) {
        System.out.print(elemento+" ");
    }
 }
 public String[] sortByBubble(String[] palabras){
    System.out.println("\nLista Ascendete: ");
    int tamanio = palabras.length;
    for(int i=0; i < tamanio; i++){
        for (int j = i+1; j < tamanio; j++) {
            if(palabras[i].compareToIgnoreCase(palabras[j])>0){
                String aux = palabras[i];
                palabras[i] = palabras[j];
                palabras[j] = aux;
            }
        }
    }
    return palabras;
}
public void printArreglo(String[] palabras){
    for (String elemento : palabras) {
        System.out.print(elemento+ " ");
    }
}
 
}
