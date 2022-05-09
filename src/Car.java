public class Car {
    private String model;
    private String producer;
    private String colour;
    private Double value;


    public Car(String model, String producer, String colour, Double value) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
        this.value = value;
    }

    public Double getValue() {
        return value;
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
