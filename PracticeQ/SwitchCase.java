package PracticeQ;

import java.util.Scanner;

// Write a Java program that takes a day number (1–7) as input and prints the corresponding day name using a switch statement. If the number is outside the range 1–7, print "Invalid day".
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2;
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");   
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;  
            default:
                System.out.println("Invalid day");
        }

        sc.close(); 
        
    }
    
}
