public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while (num <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven 
                + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int sum = 0;
        int digit;
        while (num != 0) {
            digit = num % 10;
            sum += digit;
            num = (num - digit) / 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр числа равна " + sum);
        
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        min = 1;
        max = 24;
        int j = 1;
        for (int i = min; i <= max; i += 2) {
            System.out.printf("%4d", i);
            if (j % 5 == 0) {
                System.out.println("");
            }

            if (i + 1 >= max && j % 5 != 0) {
                for (j += 1; j % 5 -1 != 0; j++) {
                    System.out.printf("%4d", 0);
                }
            }

            j++;
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        sum = 0;
        String oddOrEven = "нечётное";
        while (num != 0) {
            digit = num % 10;
            if (digit == 2) {
            sum += 1;
            }
            num = (num - digit) / 10;
            System.out.print(digit);
        }
        if (sum % 2 == 0) {
            oddOrEven = "чётное";
        }
        System.out.println("число X содержит " + oddOrEven + " количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 1; i <= 100; i++){
            System.out.print("*");
            if (i % 10 ==0) {
                System.out.println("");
            }
        }
        System.out.println("");

        j = 5;
        int count = j;
        while (j > 1) {
            if (count == 0) {
                System.out.println("");
                j--;
                count = j;
            }
            System.out.print("#");
            count--;
        }
        System.out.print("\n\n");

        count = 1;
        j = 1;
        do {
            System.out.print("$");
            j++;
            if (j > count) {
                System.out.println("");
                j = 1;
                count++;
            }
        } while(count <= 3);
        count--;
        do {
            System.out.print("$");
            j++;
            if (j > count) {
                System.out.println("");
                j = 1;
                count--;
            }
        } while(count > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 0; i < (int) '0'; i += 2) {
            System.out.printf("%3d %3c\n", i, (char) i);
        }
        int i = (int) 'a' % 2 == 0 ? (int) 'a' : (int) 'a' + 1;
        for (; i < (int) 'z'; i += 2) {
            System.out.printf("%3d %3c\n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int reverseNum = 0;
        for (i = num; i != 0; i /= 10) {
            digit = i % 10;
            reverseNum = reverseNum * 10 + digit;
        }
        String text = "";
        if (num != reverseNum) {
            text = "не";
        }
        System.out.printf("Число %d %s является палиндромом\n", num, text);


        System.out.println("\n9. Определение, является ли число счастливым");
        num = 835439;
        int num1 = num / 1000;
        int num2 = num % 1000;
        int num1ForPrint = num1;
        int num2ForPrint = num2;
        int sum1 = 0;
        int sum2 = 0;
        for (i = 1; i <= 3; i++) {
            sum1 += num1 % 10; 
            num1 = (num1 - num1 % 10) / 10;
            sum2 += num2 % 10; 
            num2 = (num2 - num2 % 10) / 10;
        }
        System.out.println("Сумма цифр " + num1ForPrint + " = " + sum1);
        System.out.println("Сумма цифр " + num2ForPrint + " = " + sum2);
        if (sum1 != sum2) {
            text = " не";
        } else {
            text = "";
        }
        System.out.printf("Число%s является счастливым\n", text);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        char vertLine = '|';
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                if (i == 1 && j == 1) {
                    System.out.print("    |");
                } else if (j == 1) {
                        System.out.printf("%3d %c", i * j, vertLine);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.print("\n");
            if (i == 1) {
                System.out.println("-----------------------------");
            }
        }
    }
}