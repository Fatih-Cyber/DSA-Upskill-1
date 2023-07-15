package Review4;

public class BrowserHistoryMainApp {
    public static void main(String[] args) {

        BrowserHistory bh=new BrowserHistory("leetcode.com");

        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Forward 1 step: "+bh.forward(1));
        bh.visit("linkedin.com");
        System.out.println("Forward 2 steps: "+ bh.forward(2));
        System.out.println("Back 2 steps: "+bh.back(2));
        System.out.println("Back 7 steps: "+bh.back(7));

    }
}
