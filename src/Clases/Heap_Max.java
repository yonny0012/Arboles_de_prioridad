package Clases;

public class Heap_Max {
    private int[] arr;
    private int cant;

    //Constructor para crear un heap vacio
    public Heap_Max(){
        arr = new int[20];
        cant = 0;
    }
    //Contructor para crear un heap a partir de un arreglo y cantidad dados
    public Heap_Max(int[] ar, int ca){
        arr = ar;
        cant = ca;
    }
    //metodo anhadir elemento
    public void add(int elem){
        arr[cant] = elem;
        heapUp(cant);
        cant++;
    }
    public void heapUp(int pos){
        int padre_indx = (pos-1)/2;
        int aux;

        while(padre_indx >= 0 && arr[padre_indx] < arr[pos]){
            
            aux = arr[pos];
            arr[pos] = arr[padre_indx];
            arr[padre_indx] = aux;
            
            heapUp(padre_indx);
        }
    }
    //Metodo extraer elemento
    public int extraer(){
        int aux = arr[0];

        heapify();
        
        return aux;
    }
    public void heapify(){
        int padre = 0;
        arr[0] = arr[cant-1];
        int izq = 2 * padre + 1;
        int der = izq + 1;
        int aux;
            
        while(padre < cant-1){
            if ((arr[izq] >= arr[der]) && (arr[izq] > arr[padre])){
                aux = arr[padre];
                arr[padre] = arr[izq];
                arr[izq] = aux;
                padre = izq;                
            }
            else if(arr[der] > arr[padre]){
                aux = arr[padre];
                arr[padre] = arr[der];
                arr[der] = aux;
                padre = der;
            }
            else 
                break;
            
        }
        cant--;
    }
    public void mostar(){
        System.out.print("[");
        for(int i=0; i<cant; i++){
            System.out.print(arr[i]);
            if(i!=cant-1)
                System.out.print(",");
        }
        System.out.println("]");
    }
}
