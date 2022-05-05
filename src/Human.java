public class Human {
    public Animal pet;
    public String firstName;
    public String lastName;
    private Car car;

    Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", car=" + car +
                '}';
    }
}
