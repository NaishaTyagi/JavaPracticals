
class Shape {
void display() {
 System.out.println("This is shape");
 }
}


class Rectangle extends Shape {
void displayRectangle() {
  System.out.println("This is rectangular shape");
 }
}

class Circle extends Shape {
 void displayCircle() {
 System.out.println("This is circular shape");
 }
}

class Square extends Rectangle {
void displaySquare() {
 System.out.println("Square is a rectangle");
 }
}

public class MainShape {
public static void main(String[] args) {
System.out.println("Naisha Tyagi,24csu315");
 Square sq = new Square();
sq.display();
 sq.displayRectangle();
 sq.displaySquare();
    }
}