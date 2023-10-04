public class Assignment3{
    public static void main(String[]args){
        double fullAmmount = 10000;
        double night = fullAmmount * 0.5;
        double beachRent = fullAmmount * 0.05;
        double Restaurants = fullAmmount * 0.3;
        double additionalActivities = fullAmmount * 0.1;
        double Other = fullAmmount * 0.05;

        System.out.println("Пълната сума е " + fullAmmount + "лв.");
        System.out.println("Нощувката е на стойност " + night + "лв.");
        System.out.println("Наемът на плажните артикули са " + beachRent + "лв.");
        System.out.println("Разходите за ресторанти са " + Restaurants + "лв.");
        System.out.println("Допълнителните забавления са " + additionalActivities + "лв.");
        System.out.println("Другите разходи са " + Other + "лв.");
    }
}