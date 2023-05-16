public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 30;
        if (age > 20) {
            System.out.println("Вы взрослый человек");
        } else {
            System.out.println("Вы молодой");
        }
        
        boolean isMaleGender = false;
        if (!isMaleGender) {
            System.out.println("Вы женского пола");
        } else {
            System.out.println("Вы мужского пола");
        }

        double height = 1.74;
        if (height < 1.80) {
            System.out.println("Вы легко умещаетесь на полке в купе поезда");
        } else {
            System.out.println("Вам мало места на полке в купе поезда");
        }

        char firstLetterOfName = 'Y';
         if (firstLetterOfName == 'M') {
            System.out.println("Ваше имя начинается на букву M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Ваше имя начинается на букву I");
        } else {
            System.out.println("Ваше имя не начинается на буквы M и I");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 25;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println("max = " + num1 + " , min = " + num2);
        } else if (num1 < num2) {
            System.out.println("max = " + num2 + " , min = " + num1);
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 10;
        System.out.print(num + " является ");
        if (num == 0) {
            System.out.println(num);
        } else {
            if (num % 2 == 0) {
                System.out.print("чётным ");
            } else {
                System.out.print("нечётным ");
            }
            if (num > 0) {
                System.out.print("положительным ");
            } else {
                System.out.print("отрицательным ");
            }
        System.out.println("числом");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 223;
        System.out.println("В исходных числах: " + num1 + ", " + num2);
        int hundred1 = num1 / 100;
        int hundred2 = num2 / 100;
        int ten1 = (num1 % 100) / 10;
        int ten2 = (num2 % 100) / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        if (hundred1 != hundred2 && ten1 != ten2 && ones1 != ones2) {
            System.out.println("нет одинаковых цифр, стоящих в одном и том же разряде");
        } else {
            if (hundred1 == hundred2) {
                System.out.println("одинаковая цифра " + hundred1 + " в разряде сотен");
            }
            if (ten1 == ten2) {
                System.out.println("одинаковая цифра " + ten1 + " в разряде десятков");
            }
            if (ones1 == ones2) {
                System.out.println("одинаковая цифра " + ones1 + " в разряде единиц");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.print(symbol + " - это ");
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 300_000d;
        double percent = 0.1d;
        if (deposit < 100_000) {
            percent = 0.05d;
        } else if (deposit <= 300_000) {
            percent = 0.07d;
        }
        double accruedInterest = deposit * percent;
        double totalSum = deposit + accruedInterest;
        System.out.printf("Сумма вклада: %.2f руб., начисленный процент: %.2f руб., итоговая сумма "
                + "с процентами: %.2f руб.\n", deposit, accruedInterest, totalSum);
        
        System.out.println("\n7. Определение оценки по предметам");
        double percentHistory = 59d;
        int markHistory = 5;
        if (percentHistory <= 60) {
            markHistory = 2;
        } else if (percentHistory <= 73) {
            markHistory = 3;
        } else if (percentHistory <= 91) {
            markHistory = 4;
        }
        double percentProgramming = 91d;
        int markProgramming = 5;
        if (percentProgramming <= 60) {
            markProgramming = 2;
        } else if (percentProgramming <= 73) {
            markProgramming = 3;
        } else if (percentProgramming <= 91) {
            markProgramming = 4;
        }
        System.out.println("История - " + markHistory +"\nПрограммирование - " + markProgramming);
        double averagePercent = (percentHistory + percentProgramming) / 2;
        double averageMark = (markHistory + markProgramming) / 2;
        System.out.printf("Средний балл оценок по предметам - %.2f \nСредний процент по предметам:" 
            + " %.2f \n", averageMark, averagePercent);

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int purchase = 9000;
        int salePrice = 13000;
        int profit = (salePrice - purchase - rent) * 12;
        if (profit <= 0) {
            System.out.println("прибыль за год: " + profit + " руб.");
        } else {
            System.out.println("прибыль за год: +" + profit + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int amount = 567;
        int hundred = 0;
        int ten = 0;
        int ones = 0;
        int remainingHundred = 10;
        int remainingTen = 5;
        int remainingOnes = 50;
        int needHundred = amount / 100;
        int needTen = (amount % 100) / 10;
        int needOnes = amount % 10;
        boolean isNeedNextCheck = true;

        if (remainingHundred * 100 + remainingTen * 10 + remainingOnes < amount) {
            System.out.println("Не хватает банкнот для выдачи нужной суммы");
            isNeedNextCheck = false;
        }

        if (isNeedNextCheck && remainingOnes < needOnes) {
            System.out.println("Не хватает банкнот номиналом 1 USD для выдачи нужной суммы");
            isNeedNextCheck = false;
        } else {
            remainingOnes -= needOnes;
            ones = needOnes;
            needOnes = 0;
        }

        if (isNeedNextCheck && needTen <= remainingTen) {
            remainingTen -= needTen;
            ten = needTen;
            needTen = 0;
        } else {
            needTen -= remainingTen;
            ten = remainingTen;
            remainingTen = 0;
        }

        if (isNeedNextCheck && needTen * 10 > remainingOnes) {
            System.out.println("Не хватает банкнот номиналом 10 USD и 1 USD для выдачи нужной " 
                    + "суммы");
            isNeedNextCheck = false;
        } else {
            remainingOnes -= needTen * 10;
            ones += needTen * 10;
            needTen = 0;
        }

        if (isNeedNextCheck && needHundred <= remainingHundred) {
            remainingHundred -= needHundred;
            hundred = needHundred;
            needHundred = 0;
        } else {
            needHundred -= remainingHundred;
            hundred = remainingHundred;
            remainingHundred = 0;
        }

        if (isNeedNextCheck && needHundred * 10 <= remainingTen) {
            remainingTen -= needHundred * 10;
            ten +=  needHundred * 10;
            needHundred = 0;
        } else {
            ten += remainingTen;
            ones = ones + needHundred * 100 - remainingTen * 10;
            remainingOnes = remainingOnes - (needHundred * 100 - remainingTen * 10);
            needHundred = 0;
            remainingTen = 0;
        }
        
        if (isNeedNextCheck) {
            System.out.printf("Выдана сумма %d USD.\nНоминал банкнот: 100 USD, требуемое"
                    + " количество: %d шт.\nНоминал банкнот: 10 USD, требуемое количество: %d шт."
                    + "\nНоминал банкнот: 1 USD, требуемое количество: %d шт.\n", amount, hundred,
                    + ten, ones);
        }
    }
}