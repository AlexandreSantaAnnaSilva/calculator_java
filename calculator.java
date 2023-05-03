public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não se pode dividir por zero");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;
        int sum = calculator.sum(a, b);
        int subtract = calculator.subtract(a, b);
        int multiply = calculator.multiply(a, b);
        int divide = calculator.divide(a, b);
        System.out.println("Soma: " + sum);
        System.out.println("Subtração : " + subtract);
        System.out.println("Multiplicação: " + multiply);
        System.out.println("Divisão: " + divide);
    }
}
