package staff;

public class Student extends People{
    @Override
    public String getDescription() {
        return new String("Name: " + super.get_name());
    }

    public Student(String name) {
        super(name);
    }
}
