import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int start = input.nextInt();

        
        int end = input.nextInt();

        int[] numbers = new int[end - start + 1];

    
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i;
        }

        System.out.println("Even numbers in the range:");

      
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        input.close();
    }
}
