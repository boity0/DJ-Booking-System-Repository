package za.ac.cput.repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Gig;
import za.ac.cput.factory.GigFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GigRepositoryTest {

    @Autowired
    private GigRepository repository;

    @Test
    void testSaveAndFindGig() {
        Gig gig = GigFactory.build(null, 500, "Rands CPT", "22:00-00:00", "Friday", null);

        Gig saved = repository.save(gig);
        assertNotNull(saved.getGigId());


        Optional<Gig> found = repository.findById(saved.getGigId());
        assertTrue(found.isPresent());
        assertEquals("Rands CPT", found.get().getGigVenue());


        repository.deleteById(saved.getGigId());
        assertFalse(repository.findById(saved.getGigId()).isPresent());
    }
}

