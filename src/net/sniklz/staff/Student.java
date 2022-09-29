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
/*
    @Override
    public boolean equals(Object other) {


        /*if(other instanceof Student) {
            return ((Student) other).get_name() == this.get_name() && ((Student) other)._collegeName == this._collegeName ? true : false;
        } else {
            return false;
        }
    }
 */
}
