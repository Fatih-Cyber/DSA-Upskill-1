public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(5));
    }
    public static int fib(int n){
        if (n==0) return 0;// termination
        if (n==1) return 1;// termination
        return fib(n-1)+fib(n-2);
    }
}
