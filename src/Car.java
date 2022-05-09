public class Car {
    private String model;
    private String producer;
    private String colour;


    public Car(String model, String producer, String colour) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
