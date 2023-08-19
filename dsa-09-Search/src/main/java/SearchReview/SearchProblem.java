package SearchReview;

public class SearchProblem {
    public static void main(String[] args) {
        int[] nums={-1,0,2,4,5,6,7,8};
        System.out.println(search(nums, 9));
    }
    public static int search(int[] array, int data) {
        // initialize left and right
        int left=0;
        int right=array.length-1;
        // have a while loop (left<=right)
        while (left<=right) {
            // calculate mid
            int mid=(left+right)/2;
            // compare == mid then return mid index
            // else if data<mid then right=mid-1
            // else left =mid+1
            if (data==array[mid]) return mid;
            else if(data<array[mid]) right=mid-1;
            else left=mid+1;
        }
       return -1;
    }

}
