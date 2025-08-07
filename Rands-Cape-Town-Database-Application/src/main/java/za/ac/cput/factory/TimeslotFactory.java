package za.ac.cput.factory;

import za.ac.cput.factory.TimeslotHelper;
import za.ac.cput.utilities.Helper;

public class TimeslotFactory {

    //Apply Validation and Create Timeslot Instances.
    public static void validatedCreateTimeslot(String timeSlotId, int timeSlotDuration, String djAvailabilitystatus){

/// I removed unnecessary import statements and declarations
        //Validate the timeSlotId, timeSlotDuration, and djAvailabilitystatus.
        Helper.validatetimeSlotId(timeSlotId);
        Helper.validateTimeSlotDuration(timeSlotDuration);
        Helper.validatedjAvailabilitystatus(djAvailabilitystatus);

    }




}//End of Class Timeslotfactory


