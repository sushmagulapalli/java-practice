package org.example.ExceptionHandling;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        System.out.println("Before running the risky code");

        //NumberFormatException
/*        try { //risky code
            Integer integer = new Integer("test");
        } catch (NumberFormatException exception) { //handle the exception
            System.out.println("In catch block - handled the exception!");
        } finally {
            System.out.println("Finally - always I will be executed");
        }*/

        //ArithmeticException
       /* try {
            int i = 100/0;
        } catch (ArithmeticException e) {
            System.out.println("got exception");
        } */

        //ArrayIndexOutOfBoundsException
/*        try {
            String s = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception");
        }
        System.out.println("After everything is over!");*/

        Object o = new Object();
        NumberFormatExceptionExample n = (NumberFormatExceptionExample)o;

        String s = (String)o;

    }
}
