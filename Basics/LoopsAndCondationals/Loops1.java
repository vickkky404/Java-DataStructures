package Basics.LoopsAndCondationals;

import java.util.Scanner;


public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.next();

        // if(fruits.equals("mango")){
        //     System.out.println("King of Fruits.");
        // }

        // if(fruits.equals("apple")){
        //     System.out.println("A sweet red fruit.");
        // }

        //  if(fruits.equals("orange")){
        //     System.out.println("Round fruit.");
        // }

        //lets try switchcases
        switch (fruits) {
            case "mango":
                System.out.println("King of Fruits.");
                break;
            case "apple":
                System.out.println("A sweet red fruit.");
                break;
            case "orange":
                System.out.println("Round fruit.");
                break;
            default:
                System.out.println("Please enter a valid fruit name.");
        }
        
    }
}
