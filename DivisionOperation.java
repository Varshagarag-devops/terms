public class DivisionOperation {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;

        try {
            int div = a / b;
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
