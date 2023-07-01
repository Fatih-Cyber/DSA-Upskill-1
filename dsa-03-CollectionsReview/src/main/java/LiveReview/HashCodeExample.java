package LiveReview;

public class HashCodeExample {
    public static void main(String[] args) {


        Car car1= new Car("BMW", 1);
        Car car2=new Car("Audi", 2);
        System.out.println("Car1 object nextCar value after construction= "+car1.nextCar);

        System.out.println(car1.nextCar);
        car1.nextCar=car2;
        System.out.println("Car1 next car value: "+ car1.nextCar);

        System.out.println("Address of car2: "+ car2);
        System.out.println("Car name is: "+ car1.name+ " Car2 name is: "+car1.nextCar.name);

    }
}
