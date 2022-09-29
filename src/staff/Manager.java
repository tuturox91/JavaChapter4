package staff;

public class Manager extends Emploee {

    private double _bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name,salary, year,month,day);
        this._bonus = bonus;
    }

    public void set_bonus(double bonus) {
        _salary += bonus;
        this._bonus = bonus;
    }

    public void addBonus(double bonus) {
        _salary -= _bonus;
        this._bonus += bonus;
        _salary += _bonus;
    }

    public double get_bonus() {
        return _bonus;
    }

}
