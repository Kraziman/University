/*Задача 5Създайте програма, която с помощта на подходящи методи
да намира трите най-големи четни елементи от предварително
създаден масив, съдържащ 10 естественичисла.  */

public class main5 {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 18, 24, 10, 6, 30, 42, 15};

        findThreeLargestEvenNumbers(numbers);
    }

    public static void findThreeLargestEvenNumbers(int[] arr) {
        int firstLargest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;

        for (int number : arr) {
            if (number % 2 == 0) {
                if (number > firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = firstLargest;
                    firstLargest = number;
                } else if (number > secondLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = number;
                } else if (number > thirdLargest) {
                    thirdLargest = number;
                }
            }
        }

        System.out.println("Трите най-големи четни числа са: " + firstLargest + ", " + secondLargest + ", " + thirdLargest);
    }
}
