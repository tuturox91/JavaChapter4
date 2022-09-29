package staff;

public class Manager extends Emploee {

    private double _bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name,salary, year,month,day);
        this._bonus = bonus;
    }

    public void set_bonus(double _bonus) {
        this._bonus = _bonus;
    }

    public void addBonus(double bonus) {
        this._bonus += bonus;
    }

    public double get_bonus() {
        return _bonus;
    }



}
