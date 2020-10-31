// Import libraries
import java.util.Scanner;

/**
 * Class that returns yes or no using random number generation.
 */

public class YesNo {

    public static void main(String[] args) {

        String answer = ""; // Initialize the answer variable

        int num = (int)(Math.random() * 2); // Returns 0 or 1

        // Return yes or no based on the resulting number
        if (num == 0)
            answer = "Yes";
        else if (num == 1)
            answer = "No";

        // Ask to write something
        Scanner question = new Scanner(System.in);
        System.out.print("Write a question: ");
        question.next();

        System.out.println(answer); // Output yes or no

    }

}
