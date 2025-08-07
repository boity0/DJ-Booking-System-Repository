package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Timeslot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class TimeslotRepositoryTest {

    private TimeslotRepository repository;
    private Timeslot timeslot;

    @BeforeEach
    void setUp() {
        repository = new TimeslotRepository();
        timeslot = new Timeslot.Builder()
                .settimeSlotId(2)
                .settimeSlotDuration(60)
                .build();
    }

    @Test
    void create() {
        Timeslot created = repository.create(timeslot);
        assertNotNull(created);
        assertEquals(timeslot, created);
        System.out.println("Created: " + created);
    }

    @Test
    void read() {
        repository.create(timeslot);
        Timeslot read = repository.read(String.valueOf(timeslot.getTimeSlotId()));
        assertNotNull(read);
        assertEquals(timeslot, read);
        System.out.println("Read: " + read);
    }
}
