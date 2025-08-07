package za.ac.cput.utilities;

import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.Song;

public class Helper {








//timeslot Validation methods - Alvaro
  ///check that there are methods inside validatedjAvailabilitystatus


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

///we need to add a method that validates the djAvailabilitystatus
    public static void validatedjAvailabilitystatus(String djAvailabilitystatus) {
    }



//Song Helper methods - Indiphile
    /// try giving more utility to the SongHelper class by
/// adding methods that can be used to manipulate or retrieve information from the Song class. this is
    ///present already, but you can add more methods to enhance its functionality.
/// I removed the class surrounding the methods to make them static utility methods.please refer to
/// the other helpers and check the first line of the class to see how they are structured.


    public static printSongDetails(@org.jetbrains.annotations.NotNull Song song) {
        System.out.println("Song Details:");
        System.out.println("ID: " + song.getSongID());
        System.out.println("Title: " + song.getSongTitle());
        System.out.println("Duration: " + song.getSongDuration() + " seconds");
        System.out.println("Genre: " + song.getSongGenre());
        System.out.println("Year: " + song.getSongYear());
    }











//DJ Validation methods-Maphelo

///check your camelCasing in all your entites


   //Change djId datatype on the UML Class Diagram to String.
    public static String validatedjId(String i) {

        if (!i.isEmpty() || i != null) {
            System.out.print(i);
        }
        return i;

    }

    public static String validatedjName(String n) {

        if (!n.isEmpty() || n != null) {
            System.out.print(n);
        }
        return n;
    }

    public static String validatecontactNumber(String c) {

        String defaultNumber = c.replaceAll("[^\\d]", "");

        if (defaultNumber.startsWith("0") && defaultNumber.length() == 10)

        {} return c;
    }

    public static String validateEmailAddress(String e) {

        EmailValidator valid = EmailValidator.getInstance();

        if (valid.isValid(e)) {

            System.out.println(e);

        }
        return e;
    }

    public static String validateavailabilityStatus(String s) {

        String statusAvailable = "Available";
        String statusnotAvailable = "Not Available";

        if (s == statusAvailable || s == statusnotAvailable) {

            System.out.println(s);

        }
        return s;

    }







    //Date validation methods-Dodge
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }


    // Date validation
    public static String validateDay(String day) {
        if (isNullOrEmpty(day)) {
            throw new IllegalArgumentException("Day field can't be empty");}

        try {
            int dayVal = Integer.parseInt(day);
            if (dayVal < 1 || dayVal > 31) {
                throw new IllegalArgumentException("Day must be real and between 1 and 31");
            }
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Day must be a valid day of month");
        }

        return day;
    }

    public static String validateMonth(String month) {
        if (isNullOrEmpty(month)) {
            throw new IllegalArgumentException("Month can't be left empty");
        }

        try {
            int monthVal = Integer.parseInt(month);
            if (monthVal < 1 || monthVal> 12) {
                throw new IllegalArgumentException("Month must be between 1 and 12");
            }
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Month must be a real number");
        }

        return month;
    }

    public static String validateYear(String year) {
        if (isNullOrEmpty(year)) {
            throw new IllegalArgumentException("Year field must contain a value");
        }

        try {
            int yearVal = Integer.parseInt(year);
            if (yearVal < 1900 || yearVal > 2100) {
                throw new IllegalArgumentException("Year must be between 1900 and 2100");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Year must be a valid number");
        }

        return year;
    }

}
