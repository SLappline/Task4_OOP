package org.example.Calculator;

import static org.example.Calculator.Operations.getOperation;

public class Calculate {
    public static double calc(double num1, double num2, char operation) {
        double result;
        /*Используем оператор выбора для полученного значения operation
        Если операция отличается от доступных, выводим ошибку с возможностью повторно ввести операцию.*/
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Операция не верна. Попробуйте снова.");
                result = calc(num1, num2, getOperation());
            }
        }
        return result; //Возвращаем результат проведенной операции
    }
}
