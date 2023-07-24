import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Unit {
    private String unitName;
    private String unitCode;

    LinkedList<Student> list1 = new LinkedList<>(); //creating linkedlist to store collection of students

    HashMap<String,Staff> map1 = new HashMap<>(); //creating hashmap

    private Lock lock;  //lock

    public Unit(String unitName, String unitCode) {
        this.unitName = unitName;
        this.unitCode = unitCode;
        this.lock = new ReentrantLock();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        if(unitName.equals("")){
            throw new IllegalArgumentException("Please fill up the unit name.");
        }
        this.unitName = unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        if(unitCode.equals("")){
            throw new IllegalArgumentException("Please fill up the unit code. It cannot be empty.");
        }
        this.unitCode = unitCode;
    }


    //add student to unit
    public void addStudent(Student student){
        lock.lock();
        try{
            this.list1.add(student);
        } catch (IllegalMonitorStateException e){     //exception
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //remove student from unit
    public void removeStudent(int index){
        this.list1.remove(index);
    }

    //returns number of students in a unit
    public int numberOfStudents(){
        return list1.size();
    }

    //print the details using iterator
    public void printStudents(){
        Iterator<Student> iter1 = this.list1.iterator();
        iter1.forEachRemaining(i ->{
            System.out.println("Name:"+i.getName()+", "+"Student Number:"+i.getStudentNumber()+", "+"Age:"+i.getAge()+", "+"Email:"+i.getEmail()+", "+"Degree:"+i.getDegree());
        });
    }

    //returns the linkedlist
    public LinkedList allStudents(){
        return this.list1;
    }

    public void sortStudents(){
        Collections.sort(list1, new StudentComparator());
    }

    //method to add staff member and their role to hashmap
    public void addStaff(String role,Staff staff){
        if(role.equals("")){
            throw new IllegalArgumentException("");  // exception
        }
        this.map1.put(role,staff);
    }

    //method to remove staff member and their role from hashmap using index
    public void removeStaff(String role){
        this.map1.remove(role);
    }

    public void printStaff(){
        Set<String> keys = map1.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            System.out.println("Role:" + key + ", " + "Name:" + map1.get(key).getName()+", "+"Email:"+map1.get(key).getEmail()+", "+"Age:"+map1.get(key).getAge()+", "+"Office Location:"+map1.get(key).getOfficeLocation());
        }
    }

    public void exportStudents(){
        File file = new File("/Users/bijay/Documents/SCU/PROG2004 Object Oriented Programming/bgauta12-assignment2/test.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
                for (Student student : this.list1) {
                bufferedWriter.write(student.getName() + ", " + student.getEmail() + ", " + student.getAge() + ", " + student.getStudentNumber() + ", " + student.getDegree());
                bufferedWriter.newLine();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void importStudents(){
        File file = new File("/Users/bijay/Documents/SCU/PROG2004 Object Oriented Programming/bgauta12-assignment2/test.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(", ");
                Student student = new Student(split[0],split[1],Integer.parseInt(split[2]),Integer.parseInt(split[3]),split[4]);
                addStudent(student);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
