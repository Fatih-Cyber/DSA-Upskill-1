public class BigOSingleLoop {
    public static void main(String[] args) {
        long numberOfOperations=0;
        int n=10000;// size of  Data
        int m=500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);

        // Task 1 Single Loop................... O(n)
        startTime=System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Single Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

        numberOfOperations=0;
        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
             for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
             }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................
        numberOfOperations=0;
        // Task 3 Triple Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Triple Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops  O(n*m)...................
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        // Task 4 End...................

        // Task 4.5 N and M Consecutive Loops O(n+m)...................
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperations+=1;
        }
        for (int i = 0; i < m ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Consecutive Loops O(n+m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        // Task 4.5 End...................

        // Task 5 Logarithmic Complexity...................
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
       // Task 5 End...................*/
    }
}


