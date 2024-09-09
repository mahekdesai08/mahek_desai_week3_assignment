package Xenosis_Internship.Assignment3.Q2;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
   private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
}

class Tringle extends Shape {
    private double base;
    private double height;

    Tringle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(4);
        System.out.println("Area of Circle : " + circle.calculateArea());
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of Rectangle : " + rectangle.calculateArea());
        Shape tringle = new Tringle(6, 8);
        System.out.println("Area of Triangle :" + tringle.calculateArea());
        Shape circle2 = new Circle(2);
        circle2.calculateArea();

    }
}


