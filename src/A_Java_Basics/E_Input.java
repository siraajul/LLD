package A_Java_Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class E_Input {
    public static void main(String[] args) {

        //Create an Object of Scanner
        //Scanner is the Main thing to handle user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Integer: ");
        int Integer = input.nextInt();

        System.out.print("Enter Your Float: ");
        float Float = input.nextFloat();

        System.out.print("Enter Your Big Integer: ");
        BigInteger bg = input.nextBigInteger();

        System.out.println("My Integer is: " + Integer);
        System.out.println("My Float is: " + Float);
        System.out.println("My BigInteger is: " + bg);
        //Task - Find Out Other Option -- String, Boolean
        //Task - Memory Leak, Resource Leak in Java

        //Scanner Close--Must Close-- Best Practice
        input.close();

    }
}
