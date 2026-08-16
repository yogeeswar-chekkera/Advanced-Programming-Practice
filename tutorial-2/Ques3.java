class Student {
String name;
int rollNo;
void display() {
System.out.println("Name    : " + name);
System.out.println("Roll No : " + rollNo);
}
public static void main(String[] args) {
Student s = new Student();
s.name = "Yogeeswar";
s.rollNo = 305;
s.display();
}
}
