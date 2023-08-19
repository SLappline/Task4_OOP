package org.example.Calculator;


import static org.example.Main.scanner;

public class Operations {
    public static char getOperation() {
        System.out.print("Выберите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы неверно ввели операцию. Попробуйте снова.");
            scanner.next();
            operation = getOperation();
        }
        return operation; //Возвращаем введенную операцию
    }
}
