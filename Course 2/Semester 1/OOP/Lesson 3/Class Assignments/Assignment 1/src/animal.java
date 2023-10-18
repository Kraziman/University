import java.util.Objects;

public class animal {
    protected String name;
    protected int age;

    public animal(){

    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        animal animal = (animal) o;
        return age == animal.age && name.equals(animal.name);
    }
}

class dog extends animal{
    private int numOfLearnedCommands;
    private int numOfWalks;

    public dog(String name, int age, int numOfLearnedCommands, int numOfWalks) {
        super(name, age);
        this.numOfLearnedCommands = numOfLearnedCommands;
        this.numOfWalks = numOfWalks;
    }

    public int getNumOfLearnedCommands() {
        return numOfLearnedCommands;
    }

    public void setNumOfLearnedCommands(int numOfLearnedCommands) {
        this.numOfLearnedCommands = numOfLearnedCommands;
    }

    public int getNumOfWalks() {
        return numOfWalks;
    }

    public void setNumOfWalks(int numOfWalks) {
        this.numOfWalks = numOfWalks;
    }

    @Override
    public String toString() {
        return "dog{" +
                "numOfLearnedCommands=" + numOfLearnedCommands +
                ", numOfWalks=" + numOfWalks +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class cat extends animal{
    private int requiredHoursOfSleep;
    private String fur;

    public cat(String name, int age, int requiredHoursOfSleep, String fur) {
        super(name, age);
        this.requiredHoursOfSleep = requiredHoursOfSleep;
        this.fur = fur;
    }

    public int getRequiredHoursOfSleep() {
        return requiredHoursOfSleep;
    }

    public void setRequiredHoursOfSleep(int requiredHoursOfSleep) {
        this.requiredHoursOfSleep = requiredHoursOfSleep;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public String toString() {
        return "cat{" +
                "requiredHoursOfSleep=" + requiredHoursOfSleep +
                ", fur='" + fur + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


