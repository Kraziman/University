/*ЗАДАЧА 1
Дефинирайте клас, който да описва атрибутите на котка. Като поведение
използвайте методи за достъп до атрибутите за четене и запис.*/

public class Cat {
    String name, breed, size, gender;
    int age;

    String getName(){
        return name;
    }

    String getbreed(){
        return breed;
    }

    String getSize(){
        return size;
    }

    String getGender(){
        return gender;
    }

    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }
    void setBreed(String breed){
        this.breed = breed;
    }

    void setSize(String size){
        this.size = size;
    }

    void setGender(String Gender){
        this.gender = gender;
    }

    void setAge(int age){
        this.age = age;
    }

    public String print(){
        return name + " " + breed + " " + size + " " + gender + " " + age;
    }

}
