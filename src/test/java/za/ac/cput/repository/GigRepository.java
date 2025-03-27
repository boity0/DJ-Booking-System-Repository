package za.ac.cput.repository;

import za.ac.cput.domain.Gig;

import java.util.HashSet;
import java.util.Set;

public class GigRepository {
    private static GigRepository repository = null;
    private Set<Gig> gigDB;

    private GigRepository() {
        gigDB = new HashSet<>();
    }

    public static GigRepository getInstance() {
        if (repository == null) {
            repository = new GigRepository();
        }
        return repository;
    }

    public Gig create(Gig gig) {
        if (gigDB.add(gig)) {
            return gig;
        }
        return null;
    }

    public Gig read(int gigId) {
        return gigDB.stream().filter(gig -> gig.getGigId() == gigId).findFirst().orElse(null);
    }

    public Gig update(Gig gig) {
        Gig existingGig = read(gig.getGigId());
        if (existingGig != null) {
            gigDB.remove(existingGig);
            gigDB.add(gig);
            return gig;
        }
        return null;
    }

    public boolean delete(int gigId) {
        Gig gigToDelete = read(gigId);
        if (gigToDelete != null) {
            gigDB.remove(gigToDelete);
            return true;
        }
        return false;
    }

    public Set<Gig> getAll() {
        return gigDB;
    }
}
