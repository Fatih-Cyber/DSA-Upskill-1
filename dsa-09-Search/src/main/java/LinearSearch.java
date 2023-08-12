public class LinearSearch {
    public int linearSearch(int[] array, int data){
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==data) return i;
        }
        return -1;
    }
}
