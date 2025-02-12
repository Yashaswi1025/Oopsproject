package school.management;

public class Teacher {
    private int teacherId;
    private String teacherName;
    private int salary;
    private int salaryEarned;

    //constructor
    public Teacher(int teacherId, String teacherName, int salary) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return this.teacherName;
    }

    public int getId() {
        return this.teacherId;
    }

    public int getSalary() {
        return this.salary = salary;
    }

    //set the salary
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        school.management.School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of teacher: " + teacherName + " - Total salary earned: " + salaryEarned;
    }

}
