
public class Main {
    public static void main(String[] args) {
        Emploee[] workers = new Emploee[3];

        workers[0] = new Emploee("Vladislav", 9300, 2022, 9,28);
        workers[1] = new Emploee("Anton", 7400, 2022, 3,3);
        workers[2] = new Emploee("Gordon Freeman", 3, 1998, 11,19);

        for (Emploee people :workers)
        {
            people.raiseSalary(10);
            System.out.println("Name: " + people.get_name() + ", Salary: " + people.getSalary() + ", " + people.getHireDay());
        }

    }
}