package net.sniklz;

import net.sniklz.staff.*;

public class Main {
    public static void main(String[] args) {
        People[] people = new People[4];

        Manager manager = new Manager("Starnger",6600, 2022,9,10, 5);

        people[0] = manager;
        people[1] = new Emploee(null, 7400, 2022, 3,3);
        people[2] = new Emploee("Gordon Freeman", 3, 1998, 11,19);
        people[3] = new Student("Jonny Bungalo", "Kiev Aviation College");

        Student student = new Student("Gregory Atols", "Hogvarts College");

        if(people[3].equals(student)) {
            System.out.println("Right");
        } else {
            System.out.println("Not right");
        }


        manager.set_bonus(30);
        manager.addBonus(10);


        for (People human : people)
        {
            if(human instanceof Emploee) {
                Emploee staff = (Emploee)human;
                staff.raiseSalary(10);
            }
            System.out.println(human.getDescription());
        }

    }
}