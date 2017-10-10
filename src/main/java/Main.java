import org.joda.time.DateTime;

/**
 * Created by accas on 03/10/2017.
 */

public class Main {
    public static void main(String[] args) {
        Student john = new Student();
        Student jim = new Student();
        Student tim = new Student();

        john.setAge(20);
        john.setDOB("1/1/1997");
        john.setId(1);
        john.setName("John");
        jim.setAge(21);
        jim.setDOB("1/1/1996");
        jim.setId(2);
        jim.setName("Jim");
        tim.setAge(22);
        tim.setDOB("1/1/1995");
        tim.setId(3);
        tim.setName("Tim");

        Module ct101 = new Module("ct101", "101", new Student[]{john, tim});
        Module ct102 = new Module("ct102", "102", new Student[]{john, jim});
        Module ct103 = new Module("ct103", "103", new Student[]{john, jim, tim});
        Course gy350 = new Course("gy350", new Module[]{ct101, ct102, ct103}, new DateTime().parse("2014-09-01"), new DateTime().parse("2018-06-01"));

        System.out.println(john.getName() + " is in the following modules: " + ct101.getModuleName() + ", " + ct102.getModuleName()
                + ", and " + ct103.getModuleName() + ". He is in course " + gy350.getCourseName() + ".");
        System.out.println(jim.getName() + " is in the following modules: " + ct102.getModuleName()
                + " and " + ct103.getModuleName() + ". He is in course " + gy350.getCourseName() + ".");
        System.out.println(john.getName() + " is in the following modules: " + ct101.getModuleName()
                + " and " + ct103.getModuleName() + ". He is in course " + gy350.getCourseName() + ".");
    }

}
