package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,  "Lizzy", 500);
        Teacher melissa = new Teacher(2,  "Melissa", 700);
        Teacher paolo = new Teacher(3,  "Paolo", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(paolo); 

        Student tamara = new Student(1, "Tamara", 4);
        Student bill = new Student(2, "Bill", 5);
        Student luca = new Student(3, "Luca", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(bill);
        studentList.add(luca);

        School ghs = new School(teacherList, studentList);
        

        tamara.payFees(5000);
        bill.payFees(6000);
        System.out.println("GHS has earned " + ghs.getTotalMoneyEarned());

        System.out.println("--------Making GHS School pay salaries-------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has paid " +  lizzy.getName() + " and now has $ " + ghs.getTotalMoneyEarned());
        paolo.receiveSalary(paolo.getSalary());
        System.out.println("GHS has paid " + lizzy.getName() + " and now has $ " + ghs.getTotalMoneyEarned());

        System.out.println(luca);
        System.out.println(melissa);

// all of this shoul be on a application interface, because that's hard-coding and usually it's not done like that. 
    }
}
