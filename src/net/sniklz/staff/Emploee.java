package net.sniklz.staff;

import java.time.LocalDate;
import java.util.Objects;

public class Emploee extends People implements Comparable<Emploee>, MyTestedInterface {
    private double _salary;
    private  LocalDate _hireDay;


    public String getDescription() {
        return  new String("Name: " + super.get_name() +  " Salary: " + _salary + " Hire Day: " + _hireDay);
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
    public boolean equals(Object otherObject) {
        if(this == otherObject) return  true;
        if(otherObject == null) return  false;
        if(this.getClass() != otherObject.getClass()) return false;
        Emploee other = (Emploee) otherObject;
        return this.get_name().equals(other.get_name())
                && this._hireDay.equals(other._hireDay)
                && Double.valueOf(this._salary).equals(Double.valueOf(other.getSalary()));
    }


    @Override
    public int hashCode() {
        return Objects.hash(get_name(), _salary, _hireDay);
    }


    @Override
    public int compareTo(Emploee o) {
        Emploee temp;
        return Double.compare(this._salary, o._salary);
    }
}
