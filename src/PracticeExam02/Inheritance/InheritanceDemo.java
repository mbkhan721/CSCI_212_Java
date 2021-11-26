package PracticeExam02.Inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        HourlyEmployee joe = new HourlyEmployee("Joe Schmo",
                new Date("January", 1, 2015), 50.50, 160);

        System.out.println("Joe's longer name is " + joe.getName());
        System.out.println("Changing Joe's name to Josephine");
        joe.setName("Josephine");
        System.out.println("Joe's record is as follows:");
        System.out.println(joe);
    }
}
