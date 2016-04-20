/**
 *Edgar Toro, braeden evenden, abutr sivakoses
 *Period 5
 *Version 1
 */

import java.lang.String;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner userInput;
        double input;
        userInput = new Scanner(System.in);
        String Output;
        input = 0;


        Output = "Please select where the pain in prominent \n 1. Head \n 2. Torso \n 3. Arms \n 4. Legs";
        System.out.println(Output);
        input = userInput.nextDouble();

        Symptoms mySymptoms[] = new Symptoms[5];
        mySymptoms[0] = new Torso();
        mySymptoms[1] = new Head();

        if (input == 1) {
            mySymptoms[1].information();
            mySymptoms[1].loops();
        }

        if (input == 2) {
           mySymptoms[0].information();
           mySymptoms[0].loops();

        }

        if (input == 3) {
            mySymptoms[1].information();
            mySymptoms[1].loops();
        }

        if (input == 4) {
            mySymptoms[0].information();
            mySymptoms[0].loops();

        }
    }



}