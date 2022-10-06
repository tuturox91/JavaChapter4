package net.sniklz.staff;

import java.util.Objects;

public class Manager extends Emploee {

    private double _bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name,salary, year,month,day);
        this._bonus = bonus;
    }

    public void set_bonus(double bonus) {
        this._bonus = bonus;
    }

    public void addBonus(double bonus) {
        this._bonus += bonus;

    }

    public double get_bonus() {
        return _bonus;
    }

    @Override
    public String getDescription() {
        return  new String("Name: " + super.get_name() + " Salary: " + getSalary() + " Hire Day: " + getHireDay() + " Bonus: " + _bonus);
    }

/*
    @Override
    public double getSalary() {
        return super.getSalary() + _bonus;
    } */
    public double getSalaryWithBonus() {
        return super.getSalary() +_bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (super.equals(otherObject)) {
           Manager other =  (Manager) otherObject;
           return Double.valueOf(this._bonus).equals(Double.valueOf(other.get_bonus()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(get_name(), getSalary(), getHireDay(), _bonus);
    }
}
