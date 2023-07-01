public class BiwiseOperations {
    public static void main(String[] args) {
        int N=120 ;
        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) != 0)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
