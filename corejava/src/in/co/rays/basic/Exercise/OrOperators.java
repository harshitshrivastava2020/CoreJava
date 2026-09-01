package in.co.rays.basic.Exercise;

public class OrOperators {
    public static void main(String[] args) {
        
        // Student status variables
        int userAge = 16;
        boolean hasAdult = true;
        
        // Day status variables
        boolean isWeekend = true;
        boolean isHoliday = false;

        // Combining both checks using OR logic
        boolean isAgeAllowed = (userAge >= 18 || hasAdult);
        boolean isDayAllowed = (isWeekend || isHoliday);

        // Ultimate decision
        if (isAgeAllowed && isDayAllowed) {
            System.out.println("Access granted to the weekend school campus event!");
        } else {
            System.out.println("Access denied. The event is closed or you do not meet criteria.");
        }
        
    }
}
