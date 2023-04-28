abstract class Shape {
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void printArea() {
        int area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void printArea() {
        int area = (width * height) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public void printArea() {
        double area = Math.PI * Math.pow(width, 2);
        System.out.println("Area of Circle: " + area);
    }
}

public class a06_AbstractClass_Shape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape triangle = new Triangle(8, 4);
        Shape circle = new Circle(5);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
