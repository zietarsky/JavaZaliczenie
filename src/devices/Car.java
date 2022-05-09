package devices;

public class Car extends Device{
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
    public void turnOn() {

    }

    @Override
    public String toString() {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", value=" + value +
                '}';
    }


}
