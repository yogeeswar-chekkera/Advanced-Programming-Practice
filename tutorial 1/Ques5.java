import java.util.Scanner;
public class HighestScore {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter score of First Student: ");
int s1 = sc.nextInt();
System.out.print("Enter score of Second Student: ");
int s2 = sc.nextInt();
System.out.print("Enter score of Third Student: ");
int s3 = sc.nextInt();
if (s1 >= s2 && s1 >= s3) {
System.out.println("First Student has the highest score: " + s1);
} else if (s2 >= s1 && s2 >= s3) {
System.out.println("Second Student has the highest score: " + s2);
} else {
System.out.println("Third Student has the highest score: " + s3);
}
sc.close();
}
}
