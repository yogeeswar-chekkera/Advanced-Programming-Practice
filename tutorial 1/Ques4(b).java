import java.util.Scanner;
public class SwapWithoutTemp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first roll number: ");
int roll1 = sc.nextInt();
System.out.print("Enter second roll number: ");
int roll2 = sc.nextInt();
// Swapping without temporary variable
roll1 = roll1 + roll2;
roll2 = roll1 - roll2;
roll1 = roll1 - roll2;
System.out.println("\nAfter Swapping:");
System.out.println("First Roll Number = " + roll1);
System.out.println("Second Roll Number = " + roll2);
sc.close();
}
}
