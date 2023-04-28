public class FunctionOverloading_Polymorphism {

    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        int sum1 = add(1, 2);
        double sum2 = add(1.5, 2.5);
        String sum3 = add("Hello", "World");

        System.out.println("Sum of 1 and 2: " + sum1);
        System.out.println("Sum of 1.5 and 2.5: " + sum2);
        System.out.println("Concatenation of Hello and World: " + sum3);
    }
}
