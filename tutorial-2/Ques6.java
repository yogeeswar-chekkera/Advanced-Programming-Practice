class Employee {
String name, department;
int id;
double salary;
void display() {
System.out.println("ID         : " + id);
System.out.println("Name       : " + name);
System.out.println("Department : " + department);
System.out.println("Salary     : " + salary);
System.out.println();
}
public static void main(String[] args) {
Employee e1 = new Employee();
Employee e2 = new Employee();
e1.id = 101;
e1.name = "Rahul";
e1.department = "IT";
e1.salary = 35000;
e2.id = 102;
e2.name = "Priya";
e2.department = "HR";
e2.salary = 40000;
e1.display();
e2.display();
}
}
