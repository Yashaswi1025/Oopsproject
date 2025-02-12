package school.management;

// Creating the student class and tracks all the data related to the student. DECLARING FIELDS
public class Student {
    private int studentId;
    private String studentName;
    private int studentGrade;
    private int feesPaid;
    private int feesTotal;


    //constructor. INITIALIZING FIELDS
    public Student(int studentId, String StudentName, int studentGrade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }
    //Not changing students name, id
    //changing the grade of the student
    public void setGrade(int StudentGrade) {
        this.studentGrade = studentGrade;
    }

    //changing the feespaid of the student. Keep adding the fees and update
    public void payFees(int fees) {
        feesPaid = feesPaid + fees;
        school.management.School.updateTotalMoneyEarned(feesPaid);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    //return remaining fees
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String toString() {
        return "Students name: " + studentName + "Total fees paid" + feesPaid;
    }

}

