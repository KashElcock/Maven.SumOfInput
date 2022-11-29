import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    // for Extra Credit
    public int gaussianSumOfNumbers(int n) {
        return 0;
    }

    // for Extra extra credit - compare the methods and show which one is faster


    public static void main(String[] args) {
        Scanner scanner = null;
        Integer userInput;
        boolean exit = false;
        while (!exit) {
            int sum = 0;
            System.out.println("Please enter a number" + "\n enter 0 to exit");
            scanner = new Scanner(System.in);
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput==0) exit = true;
            for (int i = 1; i <= userInput; i++) {
                sum += i;
            }
            System.out.println("Sum of n:" + userInput + " is:" + sum);
        }
    }
}
