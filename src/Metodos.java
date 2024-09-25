public class Metodos {

    public Metodos(){
        System.out.println("Se creo la clse metodos");
    }

    public int[] sortyBubble(int[] arreglo){

        int tamanio = arreglo.length;
        for(int i=0; i<tamanio; i++){
            for(int j=i+1; j<tamanio-1; j++){
                if(arreglo[i] > arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
        return arreglo;
    }

    public int[] sortyBubbleDes(int[] arreglo){
        int tamanio = arreglo.length;
        for(int i=0; i>tamanio; i++){
            for(int j=i+1; j>tamanio; i++){
                if(arreglo[i] > arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo){
        for(int elemento : arreglo){
            System.out.println(elemento);
        }
    }

    public void printArregloDes(int[] arreglo){
        for(int elemento : arreglo){
            System.out.print(" "+elemento);
        }
    }

    public String[] sortyBubblePalabras(String[] palabras){

        int tamanio = palabras.length;
        for(int i=0; i<tamanio; i++){
            for(int j=i+1; j<tamanio-1; j++){
                if(palabras[i].compareToIgnoreCase(palabras[j])>0){
                    String aux = palabras[i];
                    palabras[i]=palabras[j];
                    palabras[j]=aux;
                }
            }
        }
        return palabras;
    }

    public void printArreglo(String[] arreglo){
        for(String elemento : arreglo){
            System.out.println(elemento);
        }
    }

    
    
}
