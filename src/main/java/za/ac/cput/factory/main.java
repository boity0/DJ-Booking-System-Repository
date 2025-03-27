package za.ac.cput.factory;

import za.ac.cput.domain.Timeslot;

import static jdk.internal.classfile.Classfile.build;

class Main {

    public static void main(String[] args) {
        Timeslot timeslot1 = new Timeslot.TimeslotBuilder()
                .settimeSlotId("vdc")
                .settimeSlotDuration("2")
                .setDjStartTime(1)
                .setDjEndTime(2)
                .setdjAvailabilitystatus("Available").TimeslotBuild();

        System.out.println(timeslot1 .toString());
    }
}

