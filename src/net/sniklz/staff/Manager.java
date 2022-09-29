package net.sniklz.staff;

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


    @Override
    public double getSalary() {
        return super.getSalary() + _bonus;
    }

}
