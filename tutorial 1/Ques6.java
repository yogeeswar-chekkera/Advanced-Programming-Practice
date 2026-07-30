import java.util.Scanner;
public class EvenOddSeat {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the seat number: ");
int seatNumber = sc.nextInt();
if (seatNumber % 2 == 0) {
System.out.println("Seat Number " + seatNumber + " is Even.");
} else {
System.out.println("Seat Number " + seatNumber + " is Odd.");
}
sc.close();
}
}
