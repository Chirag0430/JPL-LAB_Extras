import java.util.Scanner;

public class Switch_Continue_Break{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 5: ");
        int num = scanner.nextInt();

        switch(num) {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            case 4:
                System.out.println("You entered 4.");
                break;
            case 5:
                System.out.println("You entered 5.");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }

        System.out.println("Printing even numbers from 1 to 10:");
        for(int i=1; i<=10; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Printing numbers from 1 to 10 until 5 is reached:");
        for(int i=1; i<=10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
