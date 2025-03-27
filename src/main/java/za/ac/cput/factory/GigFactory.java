package za.ac.cput.factory;

import za.ac.cput.domain.Gig;

public class GigFactory {
    public static Gig createGig(int gigId, double gigSalary, String gigVenue) {
        if (gigId <= 0 || gigSalary <= 0 || gigVenue == null || gigVenue.isEmpty()) {
            return null;
        }
        return new Gig.Builder()
                .setGigId(gigId)
                .setGigSalary(gigSalary)
                .setGigVenue(gigVenue)
                .build();
    }
}
