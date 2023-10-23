public class Car {
    private String brand;
    private String model;
    private int color;
    private int power;
    private String engineType;
    private String gearboxType;
    private int yearOfManufacture;
    private int mileage;

    public Car(String brand, String model, int color, int power, String engineType, String gearboxType, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = 0;
    }

    public Car(String brand, String model, int power, String engineType, String gearboxType, int yearOfManufacture) {
        this(brand, model, 0, power, engineType, gearboxType, yearOfManufacture);
    }

    public int getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

class Truck extends Car {
    protected int loadCapacity;
    protected int elapsedTime;

    public Truck(String brand, String model, int color, int power, String engineType, String gearboxType, int yearOfManufacture, int loadCapacity) {
        super(brand, model, color, power, engineType, gearboxType, yearOfManufacture);
        this.loadCapacity = loadCapacity;
        this.elapsedTime = 0;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public boolean checkIfCanBeStarted() {
        return elapsedTime < 6;
    }
}

class Bus extends Car {
    protected int numberOfSeats;
    protected int coursesTraveled;

    public Bus(String brand, String model, int color, int power, String engineType, String gearboxType, int yearOfManufacture, int numberOfSeats) {
        super(brand, model, color, power, engineType, gearboxType, yearOfManufacture);
        this.numberOfSeats = numberOfSeats;
        this.coursesTraveled = 0;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCoursesTraveled() {
        return coursesTraveled;
    }

    public void incrementCourses() {
        coursesTraveled++;
    }

    public boolean isLimitExceeded() {
        int maxCoursesPerDay = 10;
        int remainingCourses = maxCoursesPerDay - (coursesTraveled % maxCoursesPerDay);
        return remainingCourses < 5;
    }
}
