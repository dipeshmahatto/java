package lab.Assignment;

// Define an enum for days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        // Using enum constants
        Day today = Day.WEDNESDAY;

        System.out.println("Today is: " + today);

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's the start of the workweek.");
                break;
            case WEDNESDAY:
                System.out.println("Halfway through the week.");
                break;
            case FRIDAY:
                System.out.println("It's Friday, time to relax!");
                break;
            default:
                System.out.println("It's an ordinary day.");
        }

        // Enum iteration
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.print(day+" ");
        }
    }
}
