package net.sniklz;

import net.sniklz.staff.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People[] people = new People[5];

        Size size = Size.LARGE;


        Manager manager = new Manager("Starnger",6600, 2022,9,10, 5);
        Manager manager2 = new Manager("Starnger",6600, 2022,9,10, 5);
        Emploee emploee = new Emploee("Jonny Cash", 7700, 2022, 3,3);
        Emploee emploee2 = new Emploee("Jonny Cash", 7700, 2022, 3,3);

        System.out.println(size.toString());


        people[0] = manager;
        people[1] = new Emploee("Jonny Cash", 7700, 2022, 3,3);
        people[2] = new Emploee("Gordon Freeman", 3, 1998, 11,19);
        people[3] = new Student("Jonny Bungalo", "Kiev Aviation College");
        people[4] = new Emploee("Jonny Cash", 7400, 2022, 3,3);



        /* test Compare interface and sort
        for (People human : people)
        {
            System.out.println(human.getDescription());
        }
        System.out.println("-------------------------------------------------------");

        Arrays.sort(people);

        for (People human : people)
        {
            System.out.println(human.getDescription());
        } */



        /*Student student = new Student("Gregory Atols", "Hogvarts College");

        if(people[0].equals(people[1])) {
            System.out.println("Right");
        } else {
            System.out.println("Not right");
        }

        System.out.println(people[1].hashCode());
        System.out.println(people[4].hashCode());


        manager.set_bonus(30);
        manager.addBonus(10);


        for (People human : people)
        {
            if(human instanceof Emploee) {
                Emploee staff = (Emploee)human;
                staff.raiseSalary(10);
            }
            System.out.println(human.getDescription());
        }*/

    }
}