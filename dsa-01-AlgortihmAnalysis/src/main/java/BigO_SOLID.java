public class BigO_SOLID {
    public static void main(String[] args) {

        int n = 10000;// size of  Data
        int m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);
        singleLoop(n);
        nestedLoop(n);
        tripleLoop(n);
        nmNestedLoop(n, m);
        nmConsecutiveLoop(n, m);
        logaritmicComplexity(n);
    }


    public static void singleLoop(int n){
        long startTime;
        long endTime;
        long numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Single Loop Number of operations : "+numberOfOperations
                + " in "+ (endTime-startTime) +" milliseconds");

    }

    public static void nestedLoop(int n){
        long startTime;
        long endTime;
        long numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop Number of operations : "+numberOfOperations
                +" in "+ (endTime-startTime) +" milliseconds");
    }

    public static void tripleLoop(int n){
        long startTime;
        long endTime;
        long numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Triple Nested Loop Number of operations : "+numberOfOperations
                + " in "+ (endTime-startTime) +" miliseconds");
    }
    public static void nmNestedLoop(int n,int m){
        long startTime;
        long endTime;
        long numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperations
                + " in "+ (endTime-startTime) +" miliseconds");
    }
    public static void nmConsecutiveLoop(int n,int m){
        long startTime;
        long endTime;
        long numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperations+=1;
        }
        for (int i = 0; i < m ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Consecutive Loops O(n+m) Number of operations : "
                +numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");

    }
    public static void logaritmicComplexity(int n){
        long startTime;
        long endTime;
        long numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

    }
}

