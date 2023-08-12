public class JD1MergeSort {
   public static void mergeSort(int[] array){
       if (array.length<2) return;// if you have an array with one element STOP
       int mid=array.length/2;
       int[] leftArray=new int[mid];
       for (int i = 0; i <mid ; i++) leftArray[i]=array[i];
       int[] rightArray=new int[array.length-mid];
       for (int i = mid; i < array.length ; i++) rightArray[i-mid]=array[i];
       mergeSort(leftArray);
       mergeSort(rightArray);
       merge(leftArray, rightArray, array);


   }
    public static void merge(int[] left, int[] right, int[] result){
        int i=0,j=0,k=0;
       while(i<left.length && j<right.length){
           if (left[i]<=right[j]) result[k++]=left[i++];
           else result[k++]=right[j++];
       }
       while(i<left.length) result[k++]=left[i++];
       while(j<right.length) result[k++]=right[j++];
    }
}
