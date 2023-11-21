package OopsConcept;

public class RunTest {

        public static void main(String[] args) {
            System.out.println("Parent Class Building");
            Building a = new Building();
            a.plan();
            a.floor();
            a.cost();

            System.out.println("Child Class Flat");
            Flat b = new Flat();
            b.plan();
            b.floor();
            b.cost();

            System.out.println("Child Class House");
            House c = new House();
            c.plan();
            c.floor();
            c.cost();

            System.out.println("Child Class Bunglow");
            Bunglow d = new Bunglow();
            d.plan();
            d.floor();
            d.cost();
        }

        }
