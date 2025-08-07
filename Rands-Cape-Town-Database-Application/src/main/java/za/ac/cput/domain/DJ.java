
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.domain;
/*
DJ.java
DJ model Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 17 March 2025
 */
public class DJ {

    private String djId, djName, contactNumber, emailAddress, availabilityStatus;

    private DJ(DJBuilder builder) {

        this.djId = builder.djId;
        this.djName = builder.djName;
        this.contactNumber = builder.contactNumber;
        this.emailAddress = builder.emailAddress;
        this.availabilityStatus = builder.availabilityStatus;

    }

    public String getDjId() {
        return djId;
    }

    public String getName() {
        return djName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    @Override
    public String toString() {
        return "DJ{" + "contactNumber=" + contactNumber + ", djId=" + djId + ", Name=" + djName + ", emailAddress=" + emailAddress + ", availabilityStatus=" + availabilityStatus + '}';
    }

    public static class DJBuilder {

        private String djId, djName, contactNumber, emailAddress, availabilityStatus;

        public DJBuilder setdjId(String djId) {
            this.djId = djId;
            return this;
        }

        public DJBuilder setcontactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public DJBuilder setdjName(String djName) {
            this.djName = djName;
            return this;
        }

        public DJBuilder setemailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public DJBuilder setavailabilityStatus(String availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        public DJ DJBuild() {

            return new DJ(this);
        }

    }

}//End of Class DJ.
