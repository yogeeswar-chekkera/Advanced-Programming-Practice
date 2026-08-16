class Car {
String model;
double price;
// Default constructor
Car() {
model = "Not Specified";
price = 0;
}
// Constructor with model
Car(String model) {
this.model = model;
price = 0;
}
// Constructor with model and price
Car(String model, double price) {
this.model = model;
this.price = price;
}
void display() {
System.out.println("Model : " + model);
System.out.println("Price : " + price);
System.out.println();
}
public static void main(String[] args) {
Car c1 = new Car();
Car c2 = new Car("BMW");
Car c3 = new Car("Audi", 5000000);
c1.display();
c2.display();
c3.display();
}
}
