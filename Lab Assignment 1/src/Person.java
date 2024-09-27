public class Person {
private String name;
private String contactNumber;

    public Person(String name, String contactNumber, String contactNumber1) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.contactNumber = contactNumber1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
public void Display(){
    System.out.println("name:"+name+"contactNumber:"+contactNumber);
}
}
