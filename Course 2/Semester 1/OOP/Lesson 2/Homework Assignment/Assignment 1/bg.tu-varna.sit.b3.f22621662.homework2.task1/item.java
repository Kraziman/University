public class item {
    private String type;
    private int quantity;
    private double price;
    private int expirationDays;

    public item(){

    }

    public item(String type, int quantity, double price, int expirationDays){
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.expirationDays = expirationDays;
    }

    String getType(){
        return type;
    }

    int getQuantity(){
        return quantity;
    }

    double getPrice(){
        return price;
    }

    int getExpirationDays(){
        return expirationDays;
    }

    void setType(String type){
        this.type = type;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }

    void setPrice(double price){
        this.price = price;
    }

    void setExpirationDays(int expirationDays){
        this.expirationDays = expirationDays;
    }

    public String print(){
        return "\nType: " + type + "\nQuantity: " + quantity + "\nPrice: " + price + "\nExpiration Days: " + expirationDays;
    }
}
