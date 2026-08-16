class Student {
String name;
int age;
void display() {
System.out.println("Name: " + name);
System.out.println("Age : " + age);
}
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
s1.name = "Yogeeswar";
s1.age = 20;
s2.name = "Priya";
s2.age = 19;
s1.display();
s2.display();
}
}
