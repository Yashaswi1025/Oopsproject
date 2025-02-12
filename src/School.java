package school.management;

import java.util.List;

// Creating number of students and teachers using Array Lists
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //Creating a list of students and teachers.
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //Returns the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //Adds the teacher to the school(Array List--Adds each teacher)
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //Returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

    //Adds the students to thr school(Array List--Adds each student)
    public void updateStudent(Student student) {
        students.add(student);
    }


    //Returns total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //Adds the money earned by the school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned = totalMoneyEarned + MoneyEarned;
    }

    //Returns total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //Subtracts the total money spent by the school. Money spent is the salary which is given to the teachers
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent = totalMoneyEarned - moneySpent;
    }
}

