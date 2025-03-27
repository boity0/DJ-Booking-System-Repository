/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.factory;

/*
DJHelper.java
DJ Helper class
Author: Maphelo Shaun Tshapile (213152231)
Date: 17 March 2025
 */


public class DJHelper {

    //Change djId datatype on the UML Class Diagram to String. 
    public static String validatedjId(String i) {

        if (!i.isEmpty() || i != null) {
            System.out.print(i);
        }
        return i;

    }

    public static String validatedjName(String n) {

        if (!n.isEmpty() || n != null) {
            System.out.print(n);
        }
        return n;
    }

    public static String validatecontactNumber(String c) {

        String defaultNumber = c.replaceAll("[^\\d]", "");

        if (defaultNumber.startsWith("0") && defaultNumber.length() == 10)

            return c;
    }

    public static String validateEmailAddress(String e) {

        EmailValidator valid = EmailValidator.getInstance();

        if (valid.isValid(e)) {

            System.out.println(e);

        }
        return e;
    }

    public static String validateavailabilityStatus(String s) {

        String statusAvailable = "Available";
        String statusnotAvailable = "Not Available";

        if (s == statusAvailable || s == statusnotAvailable) {

            System.out.println(s);

        }
        return s;

    }

}//End of Class Helper.
