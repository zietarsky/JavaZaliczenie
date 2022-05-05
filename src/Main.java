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
    }
}
