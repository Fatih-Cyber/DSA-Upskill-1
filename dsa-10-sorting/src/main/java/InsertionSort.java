public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int toBeInserted=array[i]; // temp var toBeInserted
            int j=i-1;// this is predecessor
            // start shifting operation here
            while(j>=0 && toBeInserted<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeInserted;
        }
        return array;
    }
}
