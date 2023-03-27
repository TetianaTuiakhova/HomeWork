import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Пожалуйста, введите число:");
        int number333 = scanner.nextInt();


        // result (int) ((3 * Math.pow(16.0, 2.0)) + (3 * (16*1)) + (3*1))
        // Перевести число 333 из шестнадцатиричной в десятичную.
        ToTen(number333, 16);

        //Разложить число 200345 на разряды в десятичной системе.
        // 2*10^5 + 0*10^4 + 0*10^3 +3*10^2+4*10^2+ 5*10^0

        // Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).
        System.out.println(" Пожалуйста, введите число: ");
        int number637 = scanner.nextInt();
        tenTo(number637, 16);
        ToTen(number637, 16);

        //Перевести 637 из десятичной в двоичную.
        tenTo(number637, 2);

        //Перевести 637 из десятичной в троичную.
        tenTo(number637, 3);

        // 11100111 перевести в десятичную.
        ToTen(11100111, 2);

    }
    public static void ToTen(int num, int digit) {
        System.out.println(" Число " + num + " Из " + digit + " в 10 : ");
        int result = 0;
        int value = 0;
        int counter = Integer.toString(num).length();

        for (int i = 0; i < counter; i++) {
            value = num % 10;
            result += value * Math.pow(digit, i);
            num /= 10;
        }

        System.out.println(result);
    }

    public static void tenTo(int num, int digit){
        System.out.print(" Число " + num + " Из 10 в " + digit + " : ");
        String result = " ";
        int value = 0;
        while (num!= 0) {
            value = num % digit;
            result = value + result;
            num /= digit;

        }

        System.out.println(result);
    }
}
