import java.util.Arrays;

public class AnotherOptimal {
    public static void main(String[] args) {
        int [] nums={17, 2,3, 4, 7,9,15,16};// needs to be sorted
        int target=9;
        int [] ind=new int[2];

         //sort method here   nlogn

        for (int i = 0, j=1; i < nums.length; i++,j++) {   // O(n)
            if (nums[i]>target){continue;}                 // constant
            if (target-nums[i]==nums[j]){                  // constant
                ind[0]=i; ind[1]=j;
                System.out.println(Arrays.toString(ind));

            }   //overall complexity will be nlogn+ n
        }
    }
}
