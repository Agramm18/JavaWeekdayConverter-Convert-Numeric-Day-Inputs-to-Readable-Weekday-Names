import java.util.Scanner; 

// This program maps a numerical day input to the corresponding day of the week.
// Useful for quick validation or data entry scenarios where users may enter a numeric representation for days.

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize scanner to capture user input.
        System.out.println("\n"); // Print an empty line for better readability.

        // Prompt the user to enter a numerical value representing the day of the week.
        System.out.print("Enter the numerical day of the week (1 for Monday, 7 for Sunday): ");
        int day = scanner.nextInt(); // Store the user's input in the variable 'day'.

        // Use a switch statement to determine which day of the week corresponds to the given input.
        switch (day) {
            case 1:
                System.out.println("Today is Monday.");
                break;

            case 2:
                System.out.println("Today is Tuesday.");
                break;

            case 3:
                System.out.println("Today is Wednesday.");
                break;

            case 4:
                System.out.println("Today is Thursday.");
                break;

            case 5:
                System.out.println("Today is Friday.");
                break;

            case 6:
                System.out.println("Today is Saturday.");
                break;

            case 7:
                System.out.println("Today is Sunday.");
                break;

            default:
                // Handle cases where input is outside the range of 1-7.
                if (day > 7) {
                    System.out.println("Invalid input: The week does not have more than 7 days.");
                } else if (day < 1) {
                    System.out.println("Invalid input: The week has at least 1 day.");
                } else {
                    // Catch-all message for unexpected input, ensuring robustness in user experience.
                    System.out.println("No errors were found; thank you for using this program.");
                }
        }
    }
}
