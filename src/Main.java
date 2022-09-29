import staff.*;

public class Main {
    public static void main(String[] args) {
        Emploee[] workers = new Emploee[3];


        workers[0] = new Emploee("Vlad", 9300, 2022, 9,28);
        workers[1] = new Emploee(null, 7400, 2022, 3,3);
        workers[2] = new Emploee("Gordon Freeman", 3, 1998, 11,19);

        Manager manager = new Manager("Starnger",6600, 2022,9,10, 5);


        manager.set_bonus(30);
        manager.addBonus(5);



        System.out.println("Name: " + manager.get_name() + ", Salary: " + manager.getSalary() + ", Hair Day:" + manager.getHireDay() + ", Current Bonus:" + manager.get_bonus());


        for (Emploee people :workers)
        {
            people.raiseSalary(10);
            System.out.println("Name: " + people.get_name() + ", Salary: " + people.getSalary() + ", Hair Day:" + people.getHireDay());
        }

    }
}