public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte core = 2;
        short ram = 6;
        int systemType = 64;
        long power = 220L;
        float weight = 2.2f;
        double displaySize = 15.6d;
        char disk = 'C';
        boolean white = true;
        System.out.println("Количество ядер: " + core + "\nОперативная память: " + ram 
                + "\nТип системы: " + systemType + "\nМощность: " + power + "\nВес: " + weight 
                + "\nРазмер дисплея: "+ displaySize + "\nДиск: " + disk + "\nБелый: " + white);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int percent = 11;
        int fullSum = penPrice + bookPrice;
        double discount = fullSum * percent / 100;
        double discountPrice = fullSum - discount;
        System.out.println("Общая стоимость товаров без скидки: " + fullSum + "\nСумма скидки: " 
                + discount + "\nОбщая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a       \n   J   a a  v   v  a a         "
                + "\nJ  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9_223_372_036_854_775_807L;
        System.out.println(byteNum + " " + ++byteNum + " " + --byteNum);
        System.out.println(shortNum + " " + ++shortNum + " " + --shortNum);
        System.out.println(intNum + " " + ++intNum + " " + --intNum);
        System.out.println(longNum + " " + ++longNum + " " + --longNum);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("C помощью третьей переменной");
        System.out.println("Исходные значения переменных: \nnum1 = " + num1 + " \nnum2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Новые значения переменных: \nnum1 = " + num1 + "\nnum2 = " + num2);
        System.out.println("C помощью арифметических операций");
        System.out.println("Исходные значения переменных: \nnum1 = " + num1 + " \nnum2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: \nnum1 = " + num1 + "\nnum2 = " + num2);
        System.out.println("C помощью побитовой операции");
        System.out.println("Исходные значения переменных: \nnum1 = " + num1 + " \nnum2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: \nnum1 = " + num1 + "\nnum2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char numberSign = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.printf("%d %c\n", (int) numberSign, numberSign);
        System.out.printf("%d %c\n", (int) ampersand, ampersand);
        System.out.printf("%d %c\n", (int) at, at);
        System.out.printf("%d %c\n", (int) caret, caret);
        System.out.printf("%d %c\n", (int) underscore, underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash +" "+ backslash);
        System.out.println("   " + slash + "   " + backslash);
        System.out.println("  " + slash + " " + underscore + openParenthesis + " "
                + closeParenthesis + backslash);
        System.out.println(" " + slash + "       " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore
                + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundred = srcNum / 100;
        int ten = (srcNum % 100) / 10;
        int ones = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит:\n" + hundred + " сотен\n" + ten 
                + " десятков\n" + ones + " единиц");
        System.out.println("Сумма его цифр = " + (hundred + ten + ones));
        System.out.println("Произведение = " + (hundred * ten * ones));

        System.out.println("\n9. Вывод времени");
        srcNum = 86399;
        int hours = srcNum / 60 / 60;
        int minutes = srcNum % 3600 / 60;
        int seconds = srcNum % 60;
        System.out.println("ЧЧ:ММ:СС = " + hours + ":" + minutes + ":" + seconds);
    }
}