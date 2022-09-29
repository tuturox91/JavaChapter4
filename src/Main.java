import staff.*;

public class Main {
    public static void main(String[] args) {
        Emploee[] workers = new Emploee[3];

        Manager manager = new Manager("Starnger",6600, 2022,9,10, 5);

        workers[0] = manager;
        workers[1] = new Emploee(null, 7400, 2022, 3,3);
        workers[2] = new Emploee("Gordon Freeman", 3, 1998, 11,19);


        manager.set_bonus(30);
        manager.addBonus(10);


        for (Emploee people :workers)
        {
            people.raiseSalary(10);
            System.out.println(people.getDescription());
        }

    }
}