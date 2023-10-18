public class softDrink {
    private String brand;
    private String expirationDate;
    private double bottleVolume;
    private double sugarAmount;

    public softDrink(String brand, String expirationDate, double bottleVolume, double sugarAmount) {
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.bottleVolume = bottleVolume;
        this.sugarAmount = sugarAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public double getSugarAmount() {
        return sugarAmount;
    }

    public String getDescription() {
        return "Brand: " + brand + ", Expiration Date: " + expirationDate +
                ", Bottle Volume: " + bottleVolume + " ml, Sugar Amount: " + sugarAmount + " g/100ml";
    }

    public boolean equals(softDrink other) {
        return brand.equals(other.brand) &&
                expirationDate.equals(other.expirationDate) &&
                bottleVolume == other.bottleVolume &&
                sugarAmount == other.sugarAmount;
    }
}