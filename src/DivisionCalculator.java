public class DivisionCalculator {
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Nulliga jagamine pole lubatud.");
        }
    }
}