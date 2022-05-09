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

    public void setCar(Car car) {
        this.car = car;
    }

     public Double getSalary() {
        if(lastCheck != null){
            long difference = ChronoUnit.SECONDS.between(lastCheck, LocalDateTime.now());
            System.out.printf("Your account was checked "+difference+" ago, its last value was "+previousSalaryValue);
        }
        lastCheck = LocalDateTime.now();
        previousSalaryValue = salary;
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary >= 0){
            System.out.println("New information was sent to system. Go get new files from Hania (HR) - FYI ZUS and US already heard about new salary, busted!");
            this.salary = salary;
        }
        else{
            System.out.println("Salary can't be a negative value!");
        }
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
