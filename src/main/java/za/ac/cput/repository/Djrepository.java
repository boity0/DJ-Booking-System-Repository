/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.repository;
/*
Djrepository.java
DJ Repository Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */
import java.util.HashSet;
import java.util.Set;
import za.ac.cput.domain.DJ;

public class Djrepository {

    private Set<DJ> djDB;

    private Djrepository() {

        djDB = new HashSet<>();

    }

    public DJ createDj(DJ dj) {

        this.djDB.add(dj);

        return dj;

    }

    public DJ readId(String djId) {

        DJ id = this.djDB.stream()
                .filter(g -> g.getDjId().equalsIgnoreCase(djId))
                .findAny()
                .orElse(null);
        return id;

    }

    public DJ readName(String djName) {
        DJ name = this.djDB.stream()
                .filter(g -> g.getDjId().equalsIgnoreCase(djName))
                .findAny()
                .orElse(null);
        return name;

    }

    public DJ readContact(String djContact) {

        DJ contact = this.djDB.stream()
                .filter(g -> g.getDjId().equalsIgnoreCase(djContact))
                .findAny()
                .orElse(null);
        return contact;

    }

    public DJ readEmail(String djEmail) {

        DJ email = this.djDB.stream()
                .filter(g -> g.getDjId().equalsIgnoreCase(djEmail))
                .findAny()
                .orElse(null);

        return email;

    }

    public DJ readAvailability(String djAvailability) {

        DJ status = this.djDB.stream()
                .filter(g -> g.getDjId().equalsIgnoreCase(djAvailability))
                .findAny()
                .orElse(null);
        return status;

    }

    public DJ updateId(DJ djId) {

        String oldId = djId.getDjId();

        if (oldId != null) {

            this.djDB.remove(oldId);
            this.djDB.add(djId);

        }

        return djId;

    }

    public DJ updateName(DJ name) {

        String oldName = name.getName();

        if (oldName != null) {

            this.djDB.remove(oldName);
            this.djDB.add(name);

        }

        return name;

    }

    public DJ updateContact(DJ contact) {

        String oldContact = contact.getName();

        if (oldContact != null) {

            this.djDB.remove(oldContact);
            this.djDB.add(contact);

        }

        return contact;

    }

    public DJ updateEmail(DJ email) {

        String oldEmail = email.getName();

        if (oldEmail != null) {

            this.djDB.remove(oldEmail);
            this.djDB.add(email);

        }

        return email;

    }

    public DJ updateAvailability(DJ availability) {

        String oldAvailability = availability.getAvailabilityStatus();

        if (oldAvailability != null) {

            this.djDB.remove(oldAvailability);
            this.djDB.add(availability);

        }

        return availability;

    }

    public void deleteId(DJ id) {

        String deleteId = id.getDjId();

        this.djDB.remove(deleteId);

    }

    public void deleteName(DJ name) {

        String deleteName = name.getName();

        this.djDB.remove(deleteName);

    }

    public void deleteContact(DJ contact) {

        String deleteContact = contact.getContactNumber();

        this.djDB.remove(deleteContact);

    }

    public void deleteEmail(DJ email) {

        String deleteEmail = email.getEmailAddress();

        this.djDB.remove(deleteEmail);

    }

    public void deleteAvailability(DJ availability) {

        String deleteAvailability = availability.getAvailabilityStatus();

        this.djDB.remove(deleteAvailability);

    }

}//End of Class Djrepository.

