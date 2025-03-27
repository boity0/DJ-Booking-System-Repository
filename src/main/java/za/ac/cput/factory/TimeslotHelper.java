package za.ac.cput.factory;


public class TimeslotHelper {

    //Change timeslot datatype on the UML Class Diagram to String.
    public static String validatetimeSlotId(String i) {

        System.out.print(i);
        return i;


    }

    public static String validatedAvailabilitystatus(String s) {

        String statusAvailable = "Available";
        String statusnotAvailable = "Not Available";

        if (s.equals(statusAvailable) || s.equals(statusnotAvailable)) {

            System.out.println(s);

        }
        return s;

    }

    public static int validateTimeSlotDuration(int duration) {
        if (duration > 0 && duration <= 120) {
            System.out.println("Valid timeSlotDuration: " + duration);
            return duration;
        } else {
            throw new IllegalArgumentException("Invalid timeSlotDuration. It must be between 1 and 120 minutes.");
        }
    }

    public static void validatedjAvailabilitystatus(String djAvailabilitystatus) {
    }
}