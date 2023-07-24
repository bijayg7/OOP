

public class Student extends Person {
    private int studentNumber;
    private String degree;
    private double GPA;

    public Student(){
        super();
    }

    public Student(String name, String email, int age, int studentNumber, String degree) {
        super(name, email, age);
        this.studentNumber = studentNumber;
        this.degree = degree;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if (String.valueOf(studentNumber).length() > 4){
            throw new IllegalArgumentException("Student number can be only 4 digits.");
        }
        this.studentNumber = studentNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if(degree.equals("")){
            throw new IllegalArgumentException("Please fill up the degree.");
        }
        this.degree = degree;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if(GPA > 7 || GPA < 0){
            throw new IllegalArgumentException("GPA cannot be greater than 7 or less than 0.");
        }
        this.GPA = GPA;
    }

}



