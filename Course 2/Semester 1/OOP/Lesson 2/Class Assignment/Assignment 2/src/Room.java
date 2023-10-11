/*ЗАДАЧА 2
Дефинирайте клас който да описва атрибутите на стая. Инициализирайте
обектите с параметризиран конструктор. Като поведение
използвайте методи за достъп до атрибутите само за четене.*/
public class Room {
    String size, lighting, ventilation;

//    public Room(){
//
//    }

    public Room(String size, String lighting, String ventilation){
        this.size = size;
        this.lighting = lighting;
        this.ventilation = ventilation;
    }

    String getSize(){
        return size;
    }

    String getLighting(){
        return lighting;
    }

    String getVentilation(){
        return ventilation;
    }

//    void setSize(String size){
//        this.size = size;
//    }

//    void setLighting(String lighting){
//        this.lighting = lighting;
//    }

//    void setVentilation(String ventilation){
//        this.ventilation = ventilation;
//    }

//    public String print(){
//        return size + " " + lighting + " " + ventilation;
//    }
}
