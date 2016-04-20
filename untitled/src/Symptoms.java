/**
 * Created by Edgar on 4/14/2016.
 */


import java.util.Scanner;
import java.lang.String;



 class Symptoms
 {
      String output;
      double symptomOne;
      double symptomTwo;
      double symptomThree;
      double symptomFour;
      Scanner userInput;
      double input;

     Symptoms()
     {

         symptomOne = 0;
         symptomTwo = 0;
         symptomThree = 0;
         symptomFour = 0;
         input = 0;
     }

     void information ()
     {

         System.out.println ("Are you feeling symptom one? If so enter 1, if not enter 0");
         symptomOne = userInput.nextDouble();
         System.out.println ("Are you feeling symptom two? If so enter 1, if not enter 0");
         symptomTwo = userInput.nextDouble();
         System.out.println ("Are you feeling symptom three? If so enter 1, if not enter 0");
         symptomThree = userInput.nextDouble();
         System.out.println ("Are you feeling symptom four? If so enter 1, if not enter 0");
         symptomFour = userInput.nextDouble();
     }

     void loops ()
     {
         if( (symptomOne == 1) && (symptomTwo == 0)  ) {
             System.out.println ("You have this illness");
         }else if ( (symptomOne == 1) && (symptomTwo == 1) && (symptomThree == 0)){
             System.out.println ("You have this other illness");
         }else if ( (symptomOne == 1) && (symptomTwo == 1) && (symptomThree == 1) && (symptomFour == 0)){
             System.out.println ("You have this dire illnes");
         }else if ( (symptomOne == 1) && (symptomTwo == 1) && (symptomThree == 1) && (symptomFour == 1)){
             System.out.println ("You have this curable illness");
         }
     }

}


