import java.util.Scanner;

public class DaysInMonthCalculator {
	
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.println("This month has " + getDaysInMonth(year, month) + " days.");
        
        scanner.close();
    }
    
    private static int getDaysInMonth(int year, int month) {
    	if(month == 2) {
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        }
    	return 31 - (((month - 1)%7)%2);
    }
}
