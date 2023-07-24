import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student s2){
        if(s1.getName().equals(s2.getName())){
            if(s1.getStudentNumber()<s2.getStudentNumber()){
                return -1;
            }
            else if(s1.getStudentNumber()> s2.getStudentNumber()){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            return s1.getName().compareTo(s2.getName());
        }
    }
}
