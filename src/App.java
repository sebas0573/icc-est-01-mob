public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenamiento = new Metodos();

        int[] arreglo = {5,7,30,12,9};
        
        int[] arregloOrdenado = metodosOrdenamiento.sortyBubble(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenado);

        int[] arregloOrdenadoDes = metodosOrdenamiento.sortyBubbleDes(arreglo);
        metodosOrdenamiento.printArregloDes(arregloOrdenadoDes);


        String cadena ="este es un ejemplo de texto para ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenada = metodosOrdenamiento.sortyBubblePalabras(palabras);
        metodosOrdenamiento.printArreglo(palabrasOrdenada);

            
    }
}
