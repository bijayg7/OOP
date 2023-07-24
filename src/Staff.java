public class Staff extends Person {
    private String officeLocation;

    public Staff(){
       super();
    }

    public Staff(String name, String email, int age, String officeLocation) {
        super(name, email, age);
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }
    public void setOfficeLocation(String officeLocation) {
        if (officeLocation.equals(""))
        {
            throw new IllegalArgumentException("Office location cannot be empty.");
        }
        this.officeLocation = officeLocation;
    }
}