package A_Java_Basics;

import java.util.Scanner;

public class F_Conditionals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Your Income: ");
//        int income = input.nextInt();


        //if statement
//        System.out.println("Enter Your Age: ");
//        int age = input.nextInt();
//
//        if (age >= 18) {
//            System.out.println("You're Eligible to Vote.");
//        }

        //if else statement
//        System.out.print("Enter Your Income: ");
//        income = input.nextInt();
//        if (income > 300000) {
//            System.out.println("I am Rich");
//        } else {
//            System.out.println("I am Poor");
//        }

        //ternary operator
//        System.out.println((income>100000)? "I am Rich" : "I am Poor");
//        boolean ans = (10 > 20) ? true : false;
//        System.out.println(ans);

        //Nested If-Else
//        System.out.println("Enter Your Age: ");
//        int age = input.nextInt();
//        boolean knowDriving = input.nextBoolean();
//        if (age > 18) {
//            System.out.println("Your age is > 18");
//            if (knowDriving) {
//                System.out.println("You can get a licence");
//            } else {
//                System.out.println("Learn Driving First");
//            }
//        } else {
//            System.out.println("You are Underage, Not Eligible For Driving");
//        }
        //you can use logical operator instead
//        if (age > 18 || knowDriving) {
//            System.out.println("You will get a Licence");
//        } else {
//            System.out.println("Either you are <18 or you don't know driving");
//        }

        //if - else if - else
//        if (income >= 100000) {
//            System.out.println("You're Among Top 5% Indians.");
//        } else if (income >= 90000) {
//            System.out.println("You're Among Top 10% Indians.");
//        } else if (income >= 50000) {
//            System.out.println("You're Among Top 20% Indians.");
//        } else if (income >= 30000) {
//            System.out.println("You're Among Top 40% Indians.");
//        } else if (income >= 20000) {
//            System.out.println("You're Among Top 50% Indians.");
//        } else {
//            System.out.println("You're Standout in Somewhere.");
//        }

        //Switch
        System.out.print("Enter Your Number:");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("No Day Available");
        }
    }
}
