package recursion;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int result = product(numbers, 0);

        System.out.println("Product = " + result);

        input.close();
    }

    public static int product(int[] nums, int index) {

        if (index == nums.length - 1) {
            return nums[index];
        }

        return nums[index] * product(nums, index + 1);
    }
}