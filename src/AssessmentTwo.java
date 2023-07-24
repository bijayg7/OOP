
public class AssessmentTwo {
    public static void main(String[] args) {
        AssessmentTwo a2 = new AssessmentTwo();
        a2.partOne();
        a2.partTwo();
        a2.partThree();
        a2.partFive();
        a2.partSix();
        a2.partFour(); //printed at last due to exception so that part five and part six can be displayed before showing exception message.
    }

    public void partOne(){
        Unit unit1 = new Unit("Programming","PROG2007");
        Student student1 = new Student("Bijay","bijay1@gmail.com",22,1234,"Bachelor of IT");
        Student student2 = new Student("Samir","samir2@gmail.com",23,2213,"Bachelor of Business Administration");
        Student student3 = new Student("Manish","manish3@hotmail.com",25,1145,"Master of IT");
        Student student4 = new Student("Supriya","supriya2@yahoo.com",24,4455,"Master of Finance");
        Student student5 = new Student("Sujan","sujan55@yahoo.com",29,6755,"Doctor of Arts");
        unit1.addStudent(student1);
        unit1.addStudent(student2);
        unit1.addStudent(student3);
        unit1.addStudent(student4);
        unit1.addStudent(student5);
        System.out.println("Part-1");
        System.out.println("List of Students:");
        unit1.printStudents();
        unit1.removeStudent(1); //removing student
        System.out.println("List of students after removing a student:");
        unit1.printStudents();
        System.out.println("Number of Students:"+unit1.numberOfStudents());
        System.out.println("----------------------------------------------------");

    }


    public void partTwo(){
        Unit unit1 = new Unit("Web Development","WEB1001");
        Student student1 = new Student("Bijay","bijay1@gmail.com",22,6755,"Bachelor of IT");
        Student student2 = new Student("Samir","samir2@gmail.com",23,2213,"Bachelor of Business Administration");
        Student student3 = new Student("Manish","manish3@hotmail.com",25,1145,"Master of IT");
        Student student4 = new Student("Sujan","sujan164@gmail.com",24,4455,"Master of Finance");
        Student student5 = new Student("Bijay","bijay22@yahoo.com",29,1234,"Doctor of Arts");
        unit1.addStudent(student1);
        unit1.addStudent(student2);
        unit1.addStudent(student3);
        unit1.addStudent(student4);
        unit1.addStudent(student5);
        System.out.println("Part-2");
        System.out.println("List of students before sorting name and student number:");
        unit1.printStudents();
        unit1.sortStudents();  //sorting students
        System.out.println("List of students after sorting name and student number:");
        unit1.printStudents();
        System.out.println("----------------------------------------------------");

    }
    public void partThree(){
        Unit unit1 = new Unit("Programming","PROG2007");
        Staff staff1 = new Staff("Abhi","abhi23@gmail.com",31,"Sydney");
        Staff staff2 = new Staff("Nehemia","nehemia12@scu.edu.au",33,"GoldCoast");
        Staff staff3 = new Staff("Ilja","ilja11@scu.edu.au",30,"Sydney");
        Staff staff4 = new Staff("Nector","nector99@scu.edu.au",34,"Melbourne");
        Staff staff5 = new Staff("Edward","edward34@scu.edu.au",29,"Perth");
        unit1.addStaff("TutorOne",staff1);
        unit1.addStaff("Unit Accessor",staff2);
        unit1.addStaff("Lecturer",staff3);
        unit1.addStaff("TutorTwo",staff4);
        unit1.addStaff("TutorThree",staff5);
        System.out.println("Part-3");
        System.out.println("List of staffs:");
        unit1.printStaff();
        unit1.removeStaff("TutorThree");  //removing staff
        System.out.println("List of staffs after removing a staff:");
        unit1.printStaff();
        System.out.println("----------------------------------------------------");

    }


    public void partFour(){
        Student student1 = new Student();
        Staff staff1 = new Staff();
        System.out.println("Part-4");

        student1.setName("Bijay");// Name cannot be empty
        System.out.println("Name: "+student1.getName());

        staff1.setOfficeLocation("Sydney"); // Location cannot be empty
        System.out.println("Office Location: "+staff1.getOfficeLocation());

        student1.setStudentNumber(12345); //Student number must be  4 digits only.
        System.out.println("StudentNumber:"+student1.getStudentNumber());

        System.out.println("----------------------------------------------------");


    }


    public void partFive(){
        Unit unit1 = new Unit("Cyber Security","CYC1005");
        Student student1 = new Student("Bijay","bijay1@gmail.com",22,6755,"Bachelor of IT");
        Student student2 = new Student("Samir","samir2@gmail.com",23,2213,"Bachelor of Business Administration");
        Student student3 = new Student("Manish","manish3@hotmail.com",25,1145,"Master of IT");
        Student student4 = new Student("Sujan","sujan164@gmail.com",24,4455,"Master of Finance");
        Student student5 = new Student("Bijay","bijay22@yahoo.com",29,1234,"Doctor of Arts");
        unit1.addStudent(student1);
        unit1.addStudent(student2);
        unit1.addStudent(student3);
        unit1.addStudent(student4);
        unit1.addStudent(student5);
        System.out.println("Part-5");
        unit1.exportStudents();
        System.out.println("----------------------------------------------------");

    }

    public void partSix(){
        Unit unit1 = new Unit("Cyber Security","CYC1005");
        System.out.println("Part-6");
        unit1.importStudents();
        System.out.println("Number of Student:"+unit1.numberOfStudents());
        unit1.printStudents();
        System.out.println("----------------------------------------------------");
    }

}
