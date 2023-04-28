import java.util.Scanner;

public class Four_Equal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        int num4 = input.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
