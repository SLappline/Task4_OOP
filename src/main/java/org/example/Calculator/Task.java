package org.example.Calculator;

import java.util.Arrays;
import static org.example.Calculator.Calculate.calc;
import static org.example.Calculator.Numbers.numbers;
import static org.example.Calculator.Operations.getOperation;
import static org.example.Main.scanner;
import static org.example.MaxWordArray.Complition.getMaxWord;

public class Task {
    public static int getTask(){
        System.out.print("Выберите номер задачи: (1 - калькулятор, 2 - максимальное слово в массиве): ");
        int task = scanner.nextInt();
        if (task == 1) {
            System.out.println("Вы выбрали калькулятор.");
            double num1 = numbers();
            double num2 = numbers();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            //Выводим на экран результат с округлением до 4 знаков после запятой.
            System.out.printf("Результат операции: " + "%.4f", result);
        }
        else if (task == 2) {
            String longestWord = Arrays.toString(getMaxWord());
        } else {
            System.out.println("Вы ввели не верный номер операции. Попробуйте снова.");
            scanner.next();
            task = getTask();
        }
        scanner.close();
        return task;
    }
}
