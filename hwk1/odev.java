import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Ensure firstNumber is smaller than secondNumber
        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        System.out.println("Numbers between " + firstNumber + " and " + secondNumber + " (excluding those numbers):");

        // Iterate from firstNumber + 1 to secondNumber - 1 (inclusive)
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            System.out.println(i);
        }
    }
}
