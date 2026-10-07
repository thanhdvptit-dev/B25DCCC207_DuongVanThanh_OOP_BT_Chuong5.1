abstract class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.printf("%-15s | Tuổi: %d | Lương: %.2f%n",
                name, age, calculateSalary());
    }
}

class OfficeEmployee extends Employee {
    public static final double DAILY_RATE = 100; 
    private int workDays;

    public OfficeEmployee(String name, int age, int workDays) {
        super(name, age);
        this.workDays = workDays;
    }

    @Override
    public double calculateSalary() {
        return workDays * DAILY_RATE;
    }
}

class TechnicalEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, int workHours, double hourlyRate) {
        super(name, age);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Employee[] employees = {
            new OfficeEmployee("Nguyễn ăn A", 30, 22),
            new OfficeEmployee("Trần Thị B", 27, 20),
            new TechnicalEmployee("Lê Văn C", 35, 160, 15),
            new TechnicalEmployee("Phạm Thị D", 29, 150, 20)
        };

        for (Employee e : employees) {
            e.display();
        }
    }
}