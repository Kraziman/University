/*ЗАДАЧА 4
Дефинирайте клас, който да описва атрибутите на къща.
Инициализирайте обектите с параметризиран конструктор.
Като поведение използвайте методи за текстово описание
на обектите от клас къща и сравнение на къщите по площ.*/
public class House2 {
    String location, condition, price;
    double sizeSqrM;

//    public House2(){
//
//    }

    public House2(String location, double sizeSqrM, String condition, String price){
        this.location = location;
        this.sizeSqrM = sizeSqrM;
        this.condition = condition;
        this.price = price;
    }

    String getLocation(){
        return location;
    }

    double getSize(){
        return sizeSqrM;
    }

    String getCondition(){
        return condition;
    }

    String getPrice(){
        return price;
    }

    void setSize(double sizeSqrM){
        this.sizeSqrM = sizeSqrM;
    }

    void setLocation(String location){
        this.location = location;
    }

    void setCondition(String condition){
        this.condition = condition;
    }

    void setPrice(String price){
        this.price = price;
    }

    public String printDescription(){
        return "\nSize(In square meters): " + sizeSqrM +
                "\nLocation: " + location +
                "\nCondition: " + condition +
                "\nPrice: " + price + "BGN";
    }

    public String compareHouses(House2 otherHouse){
        if(this.sizeSqrM > otherHouse.sizeSqrM){
            return "Bigger";
        }
        else if (this.sizeSqrM < otherHouse.sizeSqrM){
            return "Smaller";
        }
        else{
            return "Equal";
        }

    }
}