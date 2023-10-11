public class Student {
    String firstName, lastName, fNumber;

    // Default constructor
    public Student() {

    }
    public Student(String firstName, String lastName, String fNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fNumber = fNumber;
    }

    // Returns the value of firstName
    String getFirstName(){
        return firstName;
    }

    // Returns the value of lastName
    String getLastName(){
        return lastName;
    }

    // Returns the value of fNumber
    String getfNumber(){
        return fNumber;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setFNumber(String fNumber){
        this.fNumber = fNumber;
    }

    public String print(){
        return firstName + " " + lastName + " " + fNumber;
    }

    public boolean equals(Object o){
        Student s = (Student) o;
        return this.fNumber == s.fNumber;
    }
}
