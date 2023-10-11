/*ЗАДАЧА 3
Дефинирайте клас, който да описва атрибутите на къща.
Инициализирайте обектите с параметризиран конструктор.
Като поведение използвайте методи за текстово описание
на обектите от клас къща.*/
public class House {
    String location, size, condition, price;

//    public House(){
//
//    }

    public House(String location, String size, String condition, String price){
        this.location = location;
        this.size = size;
        this.condition = condition;
        this.price = price;
    }

    String getLocation(){
        return location;
    }

    String getSize(){
        return size;
    }

    String getCondition(){
        return condition;
    }

    String getPrice(){
        return price;
    }

    void setSize(String size){
        this.size = size;
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
        return "\nSize: " + size +
                "\nLocation: " + location +
                "\nCondition: " + condition +
                "\nPrice: " + price + "BGN";
    }
}
