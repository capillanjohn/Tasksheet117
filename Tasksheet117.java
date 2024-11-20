import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();
        
        // Compare the numbers and determine the largest or if all are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            int largest = num1; // Assume num1 is the largest initially
            
            // Compare with num2 and num3 to find the largest number
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            
            // Output the largest number
            System.out.println("The largest number is: " + largest);
        }
        
        s.close();
    }
}
