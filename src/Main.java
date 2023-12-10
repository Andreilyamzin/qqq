import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();

Gryffindor harry = new Gryffindor("Harry",
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101));
Gryffindor hermiona = new Gryffindor("Hermiona",
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101));
Gryffindor ron = new Gryffindor("Ron",
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101),
        random.nextInt(101));
        System.out.println(harry);
        System.out.println(hermiona);
        System.out.println(ron);
        harry.compare(hermiona);
        hermiona.compare(harry);
        ron.compare(hermiona);
        System.out.println();

        Revenclaw chang = new Revenclaw("Chang",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Revenclaw markys = new Revenclaw("Markys",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Revenclaw padma = new Revenclaw("Padma",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        System.out.println(chang);
        System.out.println(markys);
        System.out.println(padma);
        markys.compare(padma);
        chang.compare(markys);
        padma.compare(chang);
        System.out.println();

        Slytherin drako = new Slytherin("Drako",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Slytherin gregory = new Slytherin("Gregory",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Slytherin graham = new Slytherin("Graham",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));

        System.out.println(drako);
        System.out.println(gregory);
        System.out.println(graham);
        drako.compare(gregory);
        gregory.compare(graham);
        graham.compare(drako);
        System.out.println();

        Hyfflepuff zaharia = new Hyfflepuff("Zaharia",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Hyfflepuff sedrik = new Hyfflepuff("Sedrik",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Revenclaw gastin = new Revenclaw("Gastin",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));

        System.out.println(zaharia);
        System.out.println(sedrik);
        System.out.println(gastin);
        zaharia.compare(sedrik);
        sedrik.compare(gastin);
        gastin.compare(zaharia);
        System.out.println();

        harry.compare(drako);
        drako.compare(markys);
        markys.compare(zaharia);
        zaharia.compare(hermiona);

    }



}