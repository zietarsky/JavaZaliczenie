import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Human {
    public Animal pet;
    public String firstName;
    public String lastName;
    private Car car;
    private Double salary;
    private LocalDateTime lastCheck;
    private Double previousSalaryValue;

    Human(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public Double getSalary() {
        if (lastCheck != null) {
            long difference = ChronoUnit.SECONDS.between(lastCheck, LocalDateTime.now());
            System.out.println("Your account was checked " + difference + " ago, its last value was " + previousSalaryValue);
        }
        else{
            System.out.println("your account wasn't checked yet!");
        }
        lastCheck = LocalDateTime.now();
        previousSalaryValue = salary;
        return salary;
    }


        public void setSalary (Double salary){
            if (salary >= 0) {
                System.out.println("New information was sent to system. Go get new files from Hania (HR) - FYI ZUS and US already heard about new salary, busted!");
                this.salary = salary;
            } else {
                System.out.println("Salary can't be a negative value!");
            }
        }

        public Car getCar () {
            return car;
        }


        public void setCar (Car car){
            if (salary > car.getValue()) {
                System.out.println("You bought with cash");
                this.car = car;
            } else if (salary > (car.getValue())/12) {
                System.out.println("Bought with a credit");
                this.car = car;
            } else {
                System.out.println("You need a raise! Go get some knowledge or something");
            }
        }


        @Override
        public String toString () {
            return "Human{" +
                    "pet=" + pet +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", car=" + car +
                    '}';
        }
    }
