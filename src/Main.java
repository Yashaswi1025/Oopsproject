package school.management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Adding new teachers to the Teacher CLass
        Teacher harika = new Teacher(1, "Harika", 500);
        Teacher nishitha = new Teacher(2, "Nishitha", 500);

        //Creating an Array List of Teachers to the School
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(harika);
        teacherList.add(nishitha);

        //Adding new students to the Student Class
        Student riya = new Student(1, "Riya", 5);
        Student john = new Student(2, "John", 8);

        //Creating an Array List of Students to the School
        List<Student> studentList = new ArrayList<>();
        studentList.add(riya);
        studentList.add(john);

        //Creating a new School
        School dps = new School(teacherList, studentList);
        //System.out.println(dps.getTotalMoneyEarned());

        //fees paid by the students
        riya.payFees(5000);
        john.payFees(6000);
        System.out.println("DPS has earned: " + dps.getTotalMoneyEarned());


        //salary paid to the teacher Harika by the school
        harika.receiveSalary(harika.getSalary());
        System.out.println("DPS has spent salary to " + harika.getName() + " and now has " + dps.getTotalMoneySpent());
        System.out.println(harika);

        //adding new student
        //Student ruby = new Student(2, "Ruby", 9);
        //studentList.add(ruby);










    }
}

