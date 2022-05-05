public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
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
        Human me = new Human("Maciej", "Ziętarski");
        Human adam = new Human("Adam", "Borsuk");
        Car Honda = new Car("civic", "Honda", "red");
        Car Megane = new Car("megane", "Renault", "blue");
        System.out.println(Honda);
        me.setCar(Megane);
        adam.setCar(Honda);
        System.out.println(Megane);
        System.out.println(me);
        System.out.println(adam);

    }
}
