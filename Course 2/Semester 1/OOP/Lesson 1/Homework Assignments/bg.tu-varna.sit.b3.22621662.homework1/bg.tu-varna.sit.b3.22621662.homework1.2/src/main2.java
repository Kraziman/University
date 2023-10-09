/*Задача 2 Създайте програма, която с помощта на подходящи методи
да извежда съдържанието на масива {'S', 'o', 'm', 'e', ' ', 't', 'e', 'x', 't'},
така че всеки символ да е на отделен ред. Нека решението да бъде
изпълнено с помощта на while или do-while цикъл. */

public class main2 {
    public static void main(String[] args) {
        char[] charArray = {'S', 'o', 'm', 'e', ' ', 't', 'e', 'x', 't'};
        int index = 0;

        do {
            char currentChar = charArray[index];
            System.out.println(currentChar);
            index++;
        } while (index < charArray.length);
    }
}
