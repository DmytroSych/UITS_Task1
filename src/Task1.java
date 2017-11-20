import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        System.out.println(
                "1 - Приветствовать любого пользователя при вводе его имени через командную строку." +
                        " \n2 - Отобразить в окне консоли аргументы командной строки в обратном порядке." +
                        " \n3 - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку." +
                        " \n4 - Ввести пароль из командной строки и сравнить его со строкой-образцом." +
                        " \n5 - Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль." +
                        " \n6 - Ввести с консоли n целых чисел. На консоль вывести:" +
                        " \n 6.1 - Четные и нечетные числа." +
                        " \n 6.2 - Наибольшее и наименьшее число." +
                        " \n 6.3 - Числа, которые делятся на 3 или на 9." +
                        " \n 6.4 - Числа, которые делятся на 5 и на 7." +
                        " \n 6.5 - Все трехзначные числа, в десятичной записи которых нет одинаковых цифр." +
                        " \n 6.6 - «Счастливые» числа." +
                        " \n 6.7 - Элементы, которые равны полусумме соседних элементов."
        );
        System.out.print("Chose a Task: ");
        Scanner scanner = new Scanner(System.in);
        String main = scanner.nextLine();
        switch (main) {
            case "1":
                scanner = new Scanner(System.in);
                System.out.print("Enter Your name: ");
                String name = scanner.nextLine();
                System.out.print("Hello " + name);
                break;
            case "2":
                scanner = new Scanner(System.in);
                System.out.print("Enter Values: ");
                String value = scanner.nextLine();
                String reverse = new StringBuffer(value).reverse().toString();
                System.out.println("Reverse Values: " + reverse);
                break;
            case "3":
                System.out.println("Please enter count of random numbers");
                int countNumber = Integer.parseInt(scanner.nextLine());
                Random randomizer = new Random();
                for (; countNumber > 0; countNumber--)
                    System.out.println(randomizer.nextDouble());
                break;
            case "4":
                scanner = new Scanner(System.in);
                System.out.print("Enter Your Pasword: ");
                String password1 = scanner.next();
                String password2 = "123";
                if (password1.equals(password2))
                    System.out.println("Password Accepted!");
                else System.out.println("Invalid Password!");
                break;
            case "5":
                int number1, number2;
                System.out.print("\nEnter 2 numbers:");
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
                System.out.print("\nSum of this numbers = " + (number1 + number2));
                System.out.print("\nComposition of this numbers = " + (number1 * number2));
                break;
            case "6":
                System.out.print("How many numbers in Your array? ");
                scanner = new Scanner(System.in);
                int size = scanner.nextInt();
                int[] sourceNumbers = new int[size];
                System.out.print("Enter You numbers separeted by Space and press Enter");
                for (int i = 0; i < size; i++) {
                    sourceNumbers[i] = scanner.nextInt();
                }
                for (int i = 0; i < size; i++)
                    if (sourceNumbers[i] % 2 != 0)
                        System.out.println("Odd number(s):" + sourceNumbers[i]);
                    else if (sourceNumbers[i] % 2 == 0)
                        System.out.println("Even number(s):" + sourceNumbers[i]);
                int min = sourceNumbers[0];
                for (int i = 0; i < size; i++) {
                    if (min > sourceNumbers[i])
                        min = sourceNumbers[i];
                }
                System.out.println("Minimun number:" + min);
                int max = sourceNumbers[0];
                for (int i = 0; i < size; i++) {
                    if (max < sourceNumbers[i])
                        max = sourceNumbers[i];
                }
                System.out.println("Maximum number:" + max);

                for (int i = 0; i < size; i++)
                    if ((sourceNumbers[i] % 3 == 0) || (sourceNumbers[i] % 9 == 0))
                        System.out.println("A number which can be divisible by 3 or 9: " + sourceNumbers[i]);

                for (int i = 0; i < size; i++)
                    if ((sourceNumbers[i] % 5 == 0) && (sourceNumbers[i] % 7 == 0))
                        System.out.println("A number which can be divisible by 5 or 7: " + sourceNumbers[i]);

                int a = 0, b = 0, c = 0;
                for (int j = 0; j < size; j++)
                    if ((sourceNumbers[j] > 99) && (sourceNumbers[j] < 1000)) {
                        a = sourceNumbers[j] / 10 / 10;
                        b = sourceNumbers[j] / 10 % 10;
                        c = sourceNumbers[j] % 100 % 10;
                        if (a != b && a != c && b != a && b != c && c != a && c != b)

                            System.out.println("A 3-digit number in the decimal notation of which there are no identical digits: " + sourceNumbers[j]);
                    }
                int a1 = 0, b1 = 0;
                for (int j = 0; j < size; j++)
                    if ((sourceNumbers[j] > 99999) && (sourceNumbers[j] < 1000000)) {
                        a1 = sourceNumbers[j] / 1000;
                        b1 = sourceNumbers[j] % 1000;
                        int sum = 0;
                        int sum1 = 0;
                        while (a1 != 0) {
                            sum = sum + a1 % 10;
                            a1 = a1 / 10;
                        }
                        while (b1 != 0) {
                            sum1 = sum1 + b1 % 10;
                            b1 = b1 / 10;
                        }
                        if (sum == sum1) {
                            System.out.println("A happy number: " + sourceNumbers[j]);
                        }
                    }
                for (int j = 0; j < size - 2; j++)
                    if (((sourceNumbers[j]) + (sourceNumbers[j + 2])) / 2 == sourceNumbers[j + 1]) {
                        System.out.println("Elements that are equal to the half-sum of neighboring elements: " + sourceNumbers[j + 1]);
                    }
        }
    }
}