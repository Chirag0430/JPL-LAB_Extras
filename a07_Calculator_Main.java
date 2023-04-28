class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public float sub(float a, float b) {
        return a - b;
    }

    public Complex sub(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imaginary - b.imaginary);
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public float multi(float a, float b) {
        return a * b;
    }

    public Complex multi(Complex a, Complex b) {
        return new Complex(a.real * b.real - a.imaginary * b.imaginary, a.real * b.imaginary + a.imaginary * b.real);
    }
}

class Complex {
    public double real;
    public double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}

public class a07_Calculator_Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 5, num2 = 10;
        System.out.println("Addition of two integers: " + calc.add(num1, num2));
        System.out.println("Subtraction of two integers: " + calc.sub(num1, num2));
        System.out.println("Multiplication of two integers: " + calc.multi(num1, num2));

        float f1 = 2.5f, f2 = 3.5f;
        System.out.println("Addition of two floats: " + calc.add(f1, f2));
        System.out.println("Subtraction of two floats: " + calc.sub(f1, f2));
        System.out.println("Multiplication of two floats: " + calc.multi(f1, f2));

        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -1);
        Complex c3 = calc.add(c1, c2);
        Complex c4 = calc.sub(c1, c2);
        Complex c5 = calc.multi(c1, c2);

        System.out.println("Addition of two complex numbers: " + c3.real + " + " + c3.imaginary + "i");
        System.out.println("Subtraction of two complex numbers: " + c4.real + " + " + c4.imaginary + "i");
        System.out.println("Multiplication of two complex numbers: " + c5.real + " + " + c5.imaginary + "i");
    }
}
