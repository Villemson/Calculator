import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisestage esimene number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Sisestage teine number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Valige operatsioon (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = AdditionCalculator.add(num1, num2);
                break;
            case '-':
                result = SubtractionCalculator.subtract(num1, num2);
                break;
            case '*':
                result = MultiplicationCalculator.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = DivisionCalculator.divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Vigane operatsioon.");
                return;
        }

        System.out.println("Tulemus: " + result);
    }
}
