class Student {
String name;
int rollNo;
String department;
void display() {
System.out.println("Name       : " + name);
System.out.println("Roll No    : " + rollNo);
System.out.println("Department : " + department);
}
public static void main(String[] args) {
Student s = new Student();
s.name = "Yogeeswar";
s.rollNo = 305;
s.department = "CSE";
s.display();
}
}
