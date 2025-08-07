package za.ac.cput.domain;

public class Timeslot {
    private String timeSlotId;
    private int timeSlotDuration;
    private String djAvailabilitystatus;


    Timeslot(int timeslot) {

    }

    private Timeslot(TimeslotBuilder builder) {
        this.timeSlotId = builder.timeSlotId;
        this.timeSlotDuration = builder.timeSlotDuration;
        this.djAvailabilitystatus = builder.djAvailabilitystatus;

    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public int getTimeSlotDuration() {
        return timeSlotDuration;
    }

    @Override
    public String toString() {
        return "Timeslot{" + "timeSlotId=" + timeSlotId + ", timeSlotDuration=" + timeSlotDuration + '}';
    }

    public static class TimeslotBuilder {
        private String timeSlotId;
        private int timeSlotDuration;
        private String djAvailabilitystatus;

        public TimeslotBuilder setTimeSlotId(String timeSlotId) {
            this.timeSlotId = timeSlotId;
            return this;
        }

        public TimeslotBuilder settimeSlotId(String vdc) {
            this.timeSlotId = timeSlotId;
            return this;
        }
    }

            public Timeslot settimeSlotDuration(int timeSlotDuration) {
                this.timeSlotDuration = timeSlotDuration;
                return this;
            }

    public Timeslot setdjAvailabilitystatus(String djAvailabilitystatus) {
                this.djAvailabilitystatus = djAvailabilitystatus;
                return this;
            }
    public Timeslot  TimeslotBuilder() {

        return new Timeslot(this.getTimeSlotDuration());

        }


    }







        

