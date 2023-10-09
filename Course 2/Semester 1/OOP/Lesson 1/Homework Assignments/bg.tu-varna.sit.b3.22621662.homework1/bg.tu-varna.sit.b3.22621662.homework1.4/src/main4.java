/*Задача 4Предвидете масив, в който да се включват факултетните
 номера (7-цифрено число) на всички 10 студенти, заявили участие
 в университетска олимпиада по програмиране. Разпишете алгоритъм,
 който да изброи и изведе колко от студентите в кой курс се обучават.
 Приемаме, че ФН на първокурсниците започват с 23, втори курс –22,
 трети –21и четвърти -20. Ако ФН започва с други цифри,   да се
 добави към група „неидентифицирани“.  */

public class main4 {
    public static void main(String[] args) {
        String[] facultyNumbers = {"2301234", "2205678",
                                   "2109876", "2305432",
                                   "2408765", "2206543",
                                   "2307654", "2108765",
                                   "2309876", "2203456"};

        int firstYearCount = 0;
        int secondYearCount = 0;
        int thirdYearCount = 0;
        int fourthYearCount = 0;
        int unidentifiedCount = 0;

        // For-each loop
        for (String facultyNumber : facultyNumbers) {
            if (facultyNumber.startsWith("23")) {
                firstYearCount++;
            } else if (facultyNumber.startsWith("22")) {
                secondYearCount++;
            } else if (facultyNumber.startsWith("21")) {
                thirdYearCount++;
            } else if (facultyNumber.startsWith("20")) {
                fourthYearCount++;
            } else {
                unidentifiedCount++;
            }
        }

        System.out.println("First course: " + firstYearCount + " student(s)");
        System.out.println("Second course: " + secondYearCount + " student(s)");
        System.out.println("Third course: " + thirdYearCount + " student(s)");
        System.out.println("Fourth course: " + fourthYearCount + " student(s)");
        System.out.println("Unidentified: " + unidentifiedCount + " student(s)");
    }
}
