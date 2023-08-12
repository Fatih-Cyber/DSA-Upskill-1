public class SelectionSort {
    public static int[] selectionSort(int[] array){
        for (int i = 0;  i< array.length ; i++) {
            int minIndex=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[minIndex]) minIndex=j;
            }
            swap(array, minIndex, i);
        }
        return array;
    }
    public static void swap(int[] array, int idx1, int idx2){
        int temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]=temp;
    }
}
