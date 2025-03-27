package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeslotTest {

    Timeslot timeSlotId1;
    Timeslot timeSlotId2;
    Timeslot timeSlotId3;





    @BeforeEach
    void setUp() {
        timeSlotId1 = new Timeslot(1);
         timeSlotId2 = new Timeslot(1);
        timeSlotId3 = new Timeslot(1);



    }

    @AfterEach
    void tearDown() {
    }

    @Test
   public void testTimeSlotId() {
        assertEquals(timeSlotId1, timeSlotId2);
        System.out.println("TimeslotTest.testTimeSlotId");
    }

    @Test
  public   void getTimeSlotDuration() {

    }
}