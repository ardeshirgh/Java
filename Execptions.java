package ca.ardeshir.main;

import java.util.Scanner;

public class Execptions {
    public static void exeptions(){

        System.out.println("welcome to Java");
        //CATCH THE EXCEPTION START
        try {
            System.out.println(5 / 0);//error
        } catch (ArithmeticException e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println("arithmetic exception done");
            System.out.println("_______________");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println("null pointer exception done");
            System.out.println("_______________");
        }

        try {
            int[] nums = {1, 2, 3, 4, 5};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println("Array index out of bounds exception done");
            System.out.println("_______________");
        }


        try {

            double result = divide(5, 0);
            System.out.println("your first payment is " + result / 2);
            System.out.println("your second payment is " + result / 2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("custom divide by zero done");
            System.out.println("_______________");
        }

        try {
            String num1 = "10a";
            String num2 = "0";

            System.out.println(divide(Double.parseDouble(num1), Double.parseDouble(num2)));

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException error : " + e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException : " + e.getMessage());

        } finally {

            System.out.println("custom divide by zero exception done");
            System.out.println("_______________");
        }
        // CATCH THE EXCEPTION FINISH

        System.out.println("thank you for using the Java");

        //IF VALUE TRUE OR FALSE ASK CUSTOMER START

        Scanner sn = new Scanner(System.in);
        while (true){

            System.out.println("give me a number");

            double userInput;

            if (sn.hasNextDouble()){
                userInput = sn.nextDouble();
                System.out.println("thats a double value : " + userInput);
            } else {
                System.out.println("thats not double sorry");
                System.out.println("try again");
                sn.next();
                //IF VALUE TRUE OR FALSE ASK CUSTOMER FINISHED
            }
        }
    }
    static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("divide by zero exception detected");
        return a / b;
    }
}
