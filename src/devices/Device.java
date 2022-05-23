package devices;



public abstract class Device {
     String model;
     String producer;
     Integer yearOfProduction;

    public Device() {
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
