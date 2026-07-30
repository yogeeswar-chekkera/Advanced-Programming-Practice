import java.util.Scanner;
public class ArithmeticOperations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the price of Product 1: ");
int product1 = sc.nextInt();
System.out.print("Enter the price of Product 2: ");
int product2 = sc.nextInt();
// Perform arithmetic operations
int sum = product1 + product2;
int difference = product1 - product2;
int product = product1 * product2;
int quotient = product1 / product2;
int remainder = product1 % product2;
// Display results
System.out.println("Arithmetic Operations");
System.out.println("Addition      = " + sum);
System.out.println("Subtraction   = " + difference);
System.out.println("Multiplication= " + product);
System.out.println("Division      = " + quotient);
System.out.println("Remainder     = " + remainder);
sc.close();
}
}
