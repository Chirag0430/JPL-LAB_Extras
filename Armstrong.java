public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int remainder, result = 0;
        int n = 0;

        // Count the number of digits in the given number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        // Calculate the sum of nth power of each digit in the number
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the result is equal to the original number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
