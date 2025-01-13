import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];  // Month is 1-indexed
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        // Array for days in each month for non-leap years
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];  // Month is 1-indexed
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjustments for January and February (since they are treated as months 13 and 14 of the previous year)
        if (month < 3) {
            month += 12;
            year--;
        }

        // Gregorian algorithm to calculate the first day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;  // 1 is the first day of the month (d)
        
        return d0;  // Return day of the week (0=Sunday, 1=Monday, ..., 6=Saturday)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take month and year as input
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Get the month name
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("\nCalendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // Each day takes 4 spaces
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            
            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // If the last line is incomplete, print a new line
        if ((firstDay + daysInMonth) % 7 != 0) {
            System.out.println();
        }

        scanner.close();
    }
}