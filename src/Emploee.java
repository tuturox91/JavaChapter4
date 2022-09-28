import java.time.LocalDate;
import java.util.Objects;

public class Emploee {

    private final String _name;
    private double _salary;
    private final LocalDate _hireDay;

    public Emploee(String name, double salary, int year, int month, int day) {

        _name = Objects.requireNonNullElse(name, "unknown");
        _salary = salary;
        _hireDay = LocalDate.of(year,month,day);
    }

    public String get_name() {
        return _name;
    }

    public double getSalary() {
        return _salary;
    }

    public LocalDate getHireDay() {
        return _hireDay;
    }

    public void raiseSalary(double byPercent) {
        double rise = _salary * byPercent /100;
        _salary+=rise;
    }

}
