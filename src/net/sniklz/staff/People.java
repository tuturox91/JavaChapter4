package net.sniklz.staff;

public abstract class People {
    private  String _name;

    public abstract String getDescription();

    public People(String name) {
        _name = name;
    }


    public String get_name() {
        return _name;
    }
}
