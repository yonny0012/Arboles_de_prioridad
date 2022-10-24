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
        int aux = arr[cant-1];

        heapify();
        
        return aux;
    }
    public void heapify(){
        int aux, indx = 0;
        if (arr[2*indx+1] > arr[2*indx+2]){
            if(arr[2*indx+1] > arr[indx]){
                aux = arr[indx];
                arr[indx] = arr[2*indx+1];
                arr[2*indx+1] = aux;
            }
        }
        else {
            if(arr[2*indx+1] > arr[indx]){
                aux = arr[indx];
                arr[indx] = arr[2*indx+2];
                //arr

                //me quede intercabiando os valores de pade e hijo 

            }
        }
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
