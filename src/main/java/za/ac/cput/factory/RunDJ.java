/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.factory;
/*
RunDJ.java
DJ DJ Main Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 17 March 2025
 */
import za.ac.cput.domain.DJ;

public class RunDJ {

    public static void main(String[] args) {

        DJ blackcoffee = new DJ.DJBuilder()
                .setdjId("XI205")
                .setdjName("DJ Black Coffee")
                .setcontactNumber("0634012040")
                .setemailAddress("blackcoffee@soulisticmusic.co.za")
                .setavailabilityStatus("Available").DJBuild();

        System.out.println(blackcoffee.toString());

    }

}//End of Class RunDJ.
