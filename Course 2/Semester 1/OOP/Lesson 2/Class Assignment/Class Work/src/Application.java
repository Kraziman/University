public class Application {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        System.out.println("First Student is " + firstStudent.print());
        firstStudent.setFirstName("Alexander");
        firstStudent.setLastName("Tanchev");
        firstStudent.setFNumber("22621662");
        System.out.println("First Student is " + firstStudent.print());

        Student secondStudent = new Student("Alexander", "Tanchev", "23621662");
        Student thirdStudent = new Student("Alexander", "Tanchev", "22621662");

        if(firstStudent.equals(secondStudent)){
            System.out.println("Same student!");
        }
        else{
            System.out.println("Different student!");
        }

        if(firstStudent.equals(thirdStudent)){
            System.out.println("Same student!");
        }
        else{
            System.out.println("Different student!");
        }

        if(firstStudent == thirdStudent){
            System.out.println("Same student!");
        }
        else{
            System.out.println("Different student!");
        }
    }
}
