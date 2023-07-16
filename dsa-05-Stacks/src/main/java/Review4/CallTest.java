package Review4;

public class CallTest {
    public static void main(String[] args) {
        System.out.println(aA());

    }
    static String aA(){
        System.out.println("A has started");
        bB();
        return "Completed";
    }
    static void bB(){
        System.out.println("B visited");
        cC();
    }
    static void cC(){
        System.out.println("C visited");
    }
}
