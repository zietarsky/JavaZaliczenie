import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("canis");
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println("zwierzę waży " + dog.getWeight());
        Human me = new Human("Maciej", "Ziętarski", 4000.0, 50000.0);
        Human adam = new Human("Adam", "Borsuk", 9000.0, 10000.0);
        Car Honda = new Car("civic", "Honda", "red", 6000.0);
        Car Megane = new Car("megane", "Renault", "blue", 8000.0);
        System.out.println(Honda);
        me.setCar(Megane);
        adam.setCar(Honda);
        me.getSalary();
        me.getSalary();
        System.out.println(Megane);
        System.out.println(me);
        System.out.println(adam);
        System.out.println(dog);
        System.out.println(Honda);
        System.out.println(Honda.equals(Megane));
        Car Golf = new Car("golf", "VW", "yellow", 6000.0);
        Car Golf2 = new Car("golf", "VW", "yellow", 6000.0);
        System.out.println(Golf.equals(Golf));
        System.out.println(Golf.equals(Golf2));
        Golf.turnOn();
        me.setPet(dog);
        dog.sell(me, adam, 30.0);

        Phone Nokia = new Phone("3310", "nokia", 2002);
        Nokia.installAnApp("instagram");
        Nokia.installAnApp("instagram", 3.2);
        Nokia.installAnApp("instagram", 3.2, "192.120.22.40");

        Golf.refuel();

    }
}
