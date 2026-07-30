import java.util.Scanner;
public class EmployeeSalary {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Basic Salary: ");
double basicSalary = sc.nextDouble();
System.out.print("Enter the Allowance: ");
double allowance = sc.nextDouble();
double totalSalary = basicSalary + allowance;
System.out.println("Total Monthly Salary = " + totalSalary);
sc.close();
}
}
