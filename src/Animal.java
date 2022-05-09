public class Animal implements Sellable {
    final String species;
    private Double weight;
    Boolean isAlive = true;

    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_HAMSTER_WEIGHT = 0.5;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;

    public Animal(String species) {
        this.species = species;

        if (species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("felis")){
            this.weight = DEFAULT_CAT_WEIGHT;
        } else if (species.equals("cricetus")){
            this.weight = DEFAULT_HAMSTER_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed(){
        if (!isAlive)
            System.out.println("FYI - your animal is dead ;(");
        else {
            this.weight += 0.1;
            System.out.println("thx for food");
        }
    }

    public void takeForAWalk(){
        if (!isAlive)
            System.out.println("FYI - your animal is dead ;(");
        else {
            this.weight -= 0.2;
            System.out.println("thx for a walk");
            if (weight < 0) {
                isAlive = false;
                System.out.println("that's sad - your animal has passed away [*]");
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(seller.pet != this) throw new Exception("Seller isn't owner of the subject of the transaction");
        if(buyer.cash > price) {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;

            System.out.println(buyer.pet.toString() + " has been sold to " + buyer.toString() + " from "+seller.toString() + " for " + price.toString());
        }
        else{
            System.out.println("no cash");
        }
    }
}
