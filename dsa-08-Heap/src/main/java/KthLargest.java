public class KthLargest {
    public static void main(String[] args) {
        int[] numbers={3,2,1,5,6,4};
        System.out.println(getKthLargest(numbers, 2));
    }
    public static int getKthLargest(int[] array, int k){
        // create a heap
        MyHeap heap=new MyHeap(array.length);
        for (int i = 0; i < array.length; i++) {
          heap.insert(array[i]);
        }
        for (int i = 0; i <k-1 ; i++) {
            heap.remove();
        }
        return heap.peek();
    }
}
