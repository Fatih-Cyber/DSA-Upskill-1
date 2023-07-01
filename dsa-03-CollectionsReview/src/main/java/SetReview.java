import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
      Set<Student> set =new LinkedHashSet<>();
        // 2 add element

        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(4,"Mary"));
        set.add(new Student(3,"Mike"));
        set.add(new Student(4,"Mary"));


        System.out.println(set);
        //String st= "Javva Developer";

        //System.out.println(firstRepeatingChar(st));

    }
    public static Character firstRepeatingChar(String str){
        // What is the time complexity of the following code? O(n)


        // create a hashSet
        Set<Character> chars=new HashSet<>(); // in here I have Space Complexity of O(n)
        // iterate over the char array and add chars into hashSet


        for(Character ch:str.toCharArray()) if (!chars.add(ch)) return ch;
        // if add ops is false return that char

       return null;
    }

}
