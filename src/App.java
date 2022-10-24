import Clases.Heap_Max;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //int[] ar = {20,6,10,8,11,9,12,14,4,5,7};
        //Heap_Max h1 = new Heap_Max(ar,ar.length);
        Heap_Max h1 = new Heap_Max();
        
        h1.add(7);
        h1.add(6);
        h1.add(4);
        h1.add(11);
        h1.add(9);
        h1.add(5);
        h1.add(12);
        h1.add(20);
        h1.add(10);
        h1.add(8);
        h1.add(14);

        h1.mostar();
        
        System.out.println(h1.extraer());
        
        //h1.heapUp(ar.length-1);
        h1.mostar();
        


    }
}
 