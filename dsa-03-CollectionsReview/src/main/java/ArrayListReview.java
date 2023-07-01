import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
   List<Student> students=new ArrayList<>();

// Add elements to ArrayList
        students.add(new Student(1,"Jack"));
        students.add(new Student(2,"Julia"));
        students.add(new Student(3,"Mike"));
        students.add(new Student(4,"Mary"));

        // Iteration on ArrayLists
        // 1. For Loop with get(index)

        System.out.println("Printing with legacy for-loop..............");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with iterator..............");
        Iterator iter= students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Backwards Iteration
        System.out.println("Printing Backwards with iterator..............");

        while(((ListIterator<Student>) iter).hasPrevious()){
            System.out.println(((ListIterator<Student>) iter).previous());
        }

        // 3. for each loop
        System.out.println("Printing with for_each loop..............");
        for (Student s:students) {
            System.out.println(s);
        }

        // 4. Lambda
        System.out.println("Printing with Lambda function loop..............");
        students.forEach(student-> System.out.println(student));


        // Sorting Elements in List using comparator interface
        System.out.println("Sorting with Comparator Interface by Id Desc......");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student-> System.out.println(student));

        System.out.println("Sorting with Comparator Interface by Name Desc......");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student-> System.out.println(student));

    }
      //  implementations of  Comparator
    static class sortByIdDesc implements Comparator<Student> {

          @Override
          public int compare(Student o1, Student o2) {
              return o2.id-o1.id;
          }
      }
    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
