/*Задача 3Лекарски кабинет работи през понеделник, сряда и петък от
13:30 до 18:00 часа, а във вторник и четвъртък –от 8:00 до 12:30 часа.
Събота и неделя са почивни дни. Създайте програма, при която с помощта
на подходящи методи при зададен (в кода) пореден ден от седмицата да
изведе дали е работен и в кой часови диапазон е работното време.  */

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.next();

        System.out.println("Insert day of the week: ");
        checkWorkingHours(dayOfWeek);
    }

    // Check working hours
    public static void checkWorkingHours(String dayOfWeek) {
        dayOfWeek = dayOfWeek.toLowerCase();

        if (dayOfWeek.equals("monday") || dayOfWeek.equals("wednesday") || dayOfWeek.equals("friday")) {
            System.out.println(dayOfWeek + " - work time is between 13:30 and 18:00.");
        } else if (dayOfWeek.equals("tuesday") || dayOfWeek.equals("thursday")) {
            System.out.println(dayOfWeek + " - work time is between 8:00 and 12:30.");
        } else if (dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday")) {
            System.out.println(dayOfWeek + " - day off.");
        } else{
            System.out.println("Invalid day of the week.");
        }
    }
}
