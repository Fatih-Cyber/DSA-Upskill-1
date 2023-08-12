public class ExponentialSearch {
    public static int exponentialSearch(int[] array, int data){
        int bound=1;
        while (bound<array.length && array[bound]<data) bound*=2;

        int left=bound/2;
        int right=Math.min(bound, array.length-1);
        return BinarySearch.binarySearchRecursive(array, data, left,right);
    }
}
