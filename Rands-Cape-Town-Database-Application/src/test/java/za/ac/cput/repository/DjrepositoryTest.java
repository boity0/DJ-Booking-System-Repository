
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.cput.repository;
/*
DjrepositoryTest.java
DJ Repository Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.DJ;
import za.ac.cput.repository.Djrepository;

public class DjrepositoryTest {

    @Test
    @Order(1)
    public void testCreateDj() {
        System.out.println("createDj");
        DJ dj = null;
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.createDj(dj);
        assertEquals(expResult, result);
        fail("Create DJ Test Fail.");
    }

    @Test
    @Order(2)
    public void testReadId() {
        System.out.println("readId");
        String djId = "";
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.readId(djId);
        assertEquals(expResult, result);
        fail("Read Id Test Fail");
    }

    @Test
    @Order(3)
    public void testReadName() {
        System.out.println("readName");
        String djName = "";
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.readName(djName);
        assertEquals(expResult, result);
        fail("Read Name Test Fail");
    }

    @Test
    @Order(4)

    public void testReadContact() {
        System.out.println("readContact");
        String djContact = "";
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.readContact(djContact);
        assertEquals(expResult, result);
        fail("Read Contact Test Fail");
    }

    @Test
    @Order(5)
    public void testReadEmail() {
        System.out.println("readEmail");
        String djEmail = "";
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.readEmail(djEmail);
        assertEquals(expResult, result);
        fail("Read Email Test Fail.");
    }

    @Test
    @Order(6)
    public void testReadAvailability() {
        System.out.println("readAvailability");
        String djAvailability = "";
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.readAvailability(djAvailability);
        assertEquals(expResult, result);
        fail("Read Availability");
    }

    @Test
    @Order(7)
    public void testUpdateId() {
        System.out.println("updateId");
        DJ djId = null;
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.updateId(djId);
        assertEquals(expResult, result);
        fail("Update ID.");
    }

    @Test
    @Order(8)
    public void testUpdateName() {
        System.out.println("updateName");
        DJ name = null;
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.updateName(name);
        assertEquals(expResult, result);
        fail("Update Name Test Fail");
    }

    @Test
    @Order(9)
    public void testUpdateContact() {
        System.out.println("updateContact");
        DJ contact = null;
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.updateContact(contact);
        assertEquals(expResult, result);
        fail("Update Contact Fail");
    }

    @Test
    @Order(10)
    public void testUpdateEmail() {
        System.out.println("updateEmail");
        DJ email = null;
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.updateEmail(email);
        assertEquals(expResult, result);
        fail("Email Test Fail.");
    }

    @Test
    @Order(11)
    public void testUpdateAvailability() {
        System.out.println("updateAvailability");
        DJ availability = null;
        Djrepository instance = null;
        DJ expResult = null;
        DJ result = instance.updateAvailability(availability);
        assertEquals(expResult, result);
        fail("Test Availability Fail");
    }

    @Test
    @Order(12)
    public void testDeleteId() {
        System.out.println("deleteId");
        DJ id = null;
        Djrepository instance = null;
        instance.deleteId(id);
        fail("Delete ID Test Fail.");
    }

    @Test
    @Order(13)
    public void testDeleteName() {
        System.out.println("deleteName");
        DJ name = null;
        Djrepository instance = null;
        instance.deleteName(name);
        fail("Delete Name Test Fail.");
    }

    @Test
    @Order(14)
    public void testDeleteContact() {
        System.out.println("deleteContact");
        DJ contact = null;
        Djrepository instance = null;
        instance.deleteContact(contact);
        fail("Delete Contact Fail.");
    }

    @Test
    @Order(15)
    public void testDeleteEmail() {
        System.out.println("deleteEmail");
        DJ email = null;
        Djrepository instance = null;
        instance.deleteEmail(email);
        fail("Delete Email Test Fail.");
    }

    @Test
    @Order(16)
    public void testDeleteAvailability() {
        System.out.println("deleteAvailability");
        DJ availability = null;
        Djrepository instance = null;
        instance.deleteAvailability(availability);
        fail("The Delete Availability Test Fail.");

    }

}//End of DjrepositoryTest Class
