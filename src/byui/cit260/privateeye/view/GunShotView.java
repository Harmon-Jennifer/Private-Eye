/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import byui.cit260.privateeye.control.MathControl;
import java.util.Scanner;

/**
 *
 * @author Konkles
 */
public class GunShotView {

    public String menu;

    public void GunShotView() {
        System.out.println("\"With the ballistics report and eye-witness "
                + "statements I should have enough data to get an aproximate "
                + "distance for how far the bullet travelled.\"\n");
        this.menu = "Do you want to calculate the distance the bullet"
                + " travelled? Y/N";
    }

    void displayGunShotView() {
        this.GunShotView();
        double distance = 0;
        while (distance <= 0) {
            String menuOption = this.getAnswer(); //call
            if (menuOption.toUpperCase().equals("N")) { //player wants to quit
                System.out.println("\nI have something else to do first.");
                return; //exits story
            } else if (menuOption.toUpperCase().equals("Y")) {
                distance = this.doAction(menuOption);
                if (distance > 0) {
                    System.out.println("The bullet travel aproximately " + distance + " meters.");
                } else {
                    System.out.println("An invalid value was entered, check your data and try again.");
                }
            }
        }
    }

    private String getAnswer() {
        Scanner keyboard = new Scanner(System.in);
        String menuOption = "";
        boolean invalid = false;

        while (!invalid) {
            System.out.println("\n" + this.menu);
            menuOption = keyboard.nextLine(); // get next line typed on the keyboard
            menuOption = menuOption.trim(); // trim off leading and trailing blanks

            if (menuOption.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return menuOption;
    }

    private double doAction(String menuOption) {
        int a = 0, v = 0, i = 0;
        double t = 0, d = 0;
        Scanner keyboard = new Scanner(System.in);
        while (i == 0) {
            System.out.println("What was the acceleraction of the bullet?");
            String acceleration = keyboard.nextLine();
            if (!"".equals(acceleration)) {
                a = Integer.parseInt(acceleration);
                i++;
            } else {
                System.out.println("\n**Invalid value: value can not be blank**\n");
            }
        }
        while (i == 1) {
            System.out.println("What was the velocity of the bullet?");
            String velocity = keyboard.nextLine();
            if (!"".equals(velocity)) {
                v = Integer.parseInt(velocity);
                i++;
            } else {
                System.out.println("\n**Invalid value: value can not be blank**\n");
            }
        }
        while (i == 2) {
            System.out.println("How much time past from the time it was shot until it hit the victum?");
            String time = keyboard.nextLine();
            if (!"".equals(time)) {
                t = Double.parseDouble(time);
                i++;
            } else {
                System.out.println("\n**Invalid value: value can not be blank**\n");
            }

        }
        MathControl distance = new MathControl();
        d = distance.shotDistance(v, a, t);

        return d;
    }
}
