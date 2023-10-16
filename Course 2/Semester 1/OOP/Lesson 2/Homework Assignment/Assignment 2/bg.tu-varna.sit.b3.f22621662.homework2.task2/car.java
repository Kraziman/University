public class car {
    String brand;
    String registrationNumber;
    int mileage;

    public car(String brand, String registrationNumber, int mileage){
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
    }

    String getBrand(){
        return brand;
    }

    String getRegistrationNumber(){
        return registrationNumber;
    }

    int getMileage(){
        return mileage;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    void setMileage(int mileage){
        this.mileage = mileage;
    }

    public String print(){
        return "\nBrand: " + brand + "\nRegistration Number: " + registrationNumber + "\nMileage: " + mileage;
    }
}
