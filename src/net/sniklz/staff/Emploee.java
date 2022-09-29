package net.sniklz.staff;

import java.time.LocalDate;
import java.util.Objects;

public class Emploee extends People {
    private double _salary;
    private  LocalDate _hireDay;


    public String getDescription() {
        return  new String("Name: " + super.get_name() + "Salary: " + _salary + "Hire Day: " + _hireDay);
    }


    public Emploee(String name, double salary, int year, int month, int day) {
        super(name);
        _salary = salary;
        _hireDay = LocalDate.of(year,month,day);
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

    @Override
    public boolean equals(Object other) {
        if (other instanceof Emploee) {
            Emploee otherObject = (Emploee) other;
            return other != null
                    && getClass() == other.getClass()
                    && Objects.equals(get_name(), otherObject.get_name())
                    && _salary == otherObject._salary
                    && Objects.equals(_hireDay, otherObject._hireDay);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(get_name(), _salary, _hireDay);
    }




}
