package org.example.Calculator;

import static org.example.Main.scanner;

public class Numbers {
    public static double numbers() {
        //        Запрашиваем ввод двух чисел через консоль.
//        В случае ошибки, вводим повторно.
        System.out.print("Введите дробное число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы неверно ввели число. Попробуйте снова.");
            num = numbers();
        }
        return num; //Возвращаем введенные числа
    }
}
