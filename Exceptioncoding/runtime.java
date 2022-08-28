package Exceptioncoding;
import java.util.Scanner;


class runtime{
    public static void main(String[] args){
        // initialized the Scanner Class
        Scanner inp =new Scanner(System.in);
        
        try{
            // Asking user to input their age(integer)
            System.out.println("Enter your age: ");
            int a = inp.nextInt();
            // printing user age
            System.out.println("Your age is: " + a);
        }

        // if the user enter an invalid input i.e anything other than an integer. the catch block will catch the exception.
        catch(RuntimeException er){
            System.out.println("RunTime Exception is Catched");
        }

        // no matter if we get a valid or an invalid input, "finally statement" will always be printed
        System.out.println("Program ended");

    }
}