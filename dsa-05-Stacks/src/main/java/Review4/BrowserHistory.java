package Review4;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> history, forwardStack;
    String currentPage;
    public BrowserHistory(String homepage) {
       // Initialize stacks and set current Url to Homepage
         history=new ArrayDeque<>();
         forwardStack=new ArrayDeque<>();
         currentPage=homepage;
    }

    public void visit(String url) {
      history.push(currentPage);
      System.out.println(url + " is visited");
      currentPage=url;
      forwardStack=new ArrayDeque<>();
    }

    public String back(int steps) {
        int stepNumber=steps;
        while(steps>0 && !history.isEmpty()){
            forwardStack.push(currentPage);
            currentPage= history.pop();
            steps--;
        }
      return currentPage;
    }

    public String forward(int steps) {
        int stepNumber=steps;
        while(steps>0 && !forwardStack.isEmpty()){
            history.push(currentPage);
            currentPage= forwardStack.pop();
            steps--;
        }
        return currentPage;
    }



}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
