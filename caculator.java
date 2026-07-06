import java.util.Scanner;

public class ScientificCalculator {

    // Method to calculate factorial
    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Log (Base 10)");
            System.out.println("11. Natural Log (ln)");
            System.out.println("12. Factorial");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0)
                        System.out.println("Result = " + (num1 / num2));
                    else
                        System.out.println("Error! Division by zero.");
                    break;

                case 5:
                    System.out.print("Enter base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(num1, num2));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0)
                        System.out.println("Result = " + Math.sqrt(num1));
                    else
                        System.out.println("Invalid input.");
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result = " + Math.sin(Math.toRadians(num1)));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result = " + Math.cos(Math.toRadians(num1)));
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result = " + Math.tan(Math.toRadians(num1)));
                    break;

                case 10:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    if (num1 > 0)
                        System.out.println("Result = " + Math.log10(num1));
                    else
                        System.out.println("Invalid input.");
                    break;

                case 11:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    if (num1 > 0)
                        System.out.println("Result = " + Math.log(num1));
                    else
                        System.out.println("Invalid input.");
                    break;

                case 12:
                    System.out.print("Enter an integer: ");
                    int n = sc.nextInt();
                    long fact = factorial(n);
                    if (fact == -1)
                        System.out.println("Factorial not defined for negative numbers.");
                    else
                        System.out.println("Factorial = " + fact);
                    break;

                case 13:
                    System.out.println("Thank you for using the Scientific Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 13);

        sc.close();
    }
}