import java.util.Comparator;

public abstract class Person {
    private String name;
    private String email;
    private int age;

    public Person() {

    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(""))
        {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@"))
        {
            this.email = email;
        }
        else {
            throw new IllegalArgumentException("Email format is not correct. It must contain @."); //IllegalArgumentException
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 )
        {
            throw new IllegalArgumentException("Age must be positive number.");
        }
        this.age = age;
    }

}

