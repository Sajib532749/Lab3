import java.util.Scanner;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int start = input.nextInt();

      
        int end = input.nextInt();

        int[] primes = new int[end - start + 1];
        int count = 0;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primes[count] = num;
                count++;
            }
        }

        System.out.println("Prime numbers in the range:");

        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }

        input.close();
    }
}
