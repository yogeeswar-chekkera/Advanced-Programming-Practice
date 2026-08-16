class Rectangle {
double length, breadth;
void area() {
double a = length * breadth;
System.out.println("Area = " + a);
}
public static void main(String[] args) {
Rectangle r = new Rectangle();
r.length = 10;
r.breadth = 5;
r.area();
}
}
