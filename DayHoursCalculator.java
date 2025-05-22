// Define the interface with two methods
interface TimeCalculator {
    int hoursInDay();              // Returns total hours in a day
    int hoursInDayMinusSleep(int sleepHours); // Returns waking hours after sleep
}

// Class implementing the interface
public class DayHoursCalculator implements TimeCalculator {

    // Method returns fixed 24 hours in a day
    @Override
    public int hoursInDay() {
        return 24;
    }

    // Method returns hours left after subtracting sleep hours
    @Override
    public int hoursInDayMinusSleep(int sleepHours) {
        return 24 - sleepHours;
    }

    // Main method to test the class
    public static void main(String[] args) {
        DayHoursCalculator calculator = new DayHoursCalculator();

        System.out.println("Total hours in a day: " + calculator.hoursInDay());

        int sleep = 8; // Example: 8 hours of sleep
        System.out.println("Waking hours after " + sleep + " hours sleep: " 
                            + calculator.hoursInDayMinusSleep(sleep));
    }
}
