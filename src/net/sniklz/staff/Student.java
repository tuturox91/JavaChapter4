package net.sniklz.staff;

public class Student extends People{

    private String _collegeName;

    @Override
    public String getDescription() {
        return new String("Name: " + super.get_name() + "College Name: " + _collegeName);
    }

    public Student(String name, String collegeName) {
        super(name);
        _collegeName = collegeName;
    }
}
