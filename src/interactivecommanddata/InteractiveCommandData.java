/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactivecommanddata;

import java.util.Scanner;

public class InteractiveCommandData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "raj", heshe = "";
        int age = 26;
        int retirement = 55, daystill = 0;
        boolean isFemale;
        double gpa = 6.5;
        if (70 > 0) {
            System.out.println("your older");
        } else if (0 < 68) {
            System.out.println("your not older");
        }
        System.out.println("Enter Student name: ");
        name = input.nextLine();
        System.out.println("Enter Student age: ");
        age = input.nextInt();
        System.out.println("Enter Student gpa: ");
        gpa = input.nextDouble();
        System.out.println("Are you Female ? (true/false) :");
        isFemale = input.nextBoolean();
        heshe = isFemale ? "she" : "he";
        daystill = retirement - age;
        System.out.println("Enter retirement age: ");
        retirement = input.nextInt();

        // System.out.printf("%s is %d year old. (%d year to retirement). %s has a %5.5f cgpa.\n",
        //    name,age,heshe,gpa);
        //  System.out.printf("raj" + "26" + "7.6");
    }

}
