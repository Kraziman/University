public class City {
    private String name;
    private int postalCode;

    public City() {
    }

    public City(String name, int postalCode) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public int getPostalCode() {
        return postalCode;
    }
}

class IdentificationCard{
    private int number;
    private int year;
    private int egn;

    private City city;

    public IdentificationCard(int number, int year, int egn, City city) {
        this.number = number;
        this.year = year;
        this.egn = egn;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public int getEgn() {
        return egn;
    }

    public String publishedBy(){
        return "МВР" + city.getName();
    }

    public int validUntil(){
        return year+10;
    }
}

class Person {
    private String firstName;
    private String secondName;
    private String thirdName;

    public Person() {
    }

    public String iAm(){
        return thirdName + " " + firstName + " " + secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
}

class Adult extends Person{
    private IdentificationCard identificationCard;

    public Adult() {
    }

    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(IdentificationCard identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getPersonalInformation(){
        return
                iAm() + "\n\nЛична карта номер: " + identificationCard.getNumber() + "\t\tИздадена от: " + identificationCard.publishedBy();


    }
}