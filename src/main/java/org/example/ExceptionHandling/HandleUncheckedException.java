package org.example.ExceptionHandling;

public class HandleUncheckedException {
    public static void main(String[] args)
    {
        System.out.println("Program is started");
        int a = 20;// Airthemetic Exception


        try
        {
            System.out.println(a/0);//Airthemetic Exception
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in the final block");
        }
        System.out.println("Program in Progress");
        System.out.println("Program Completed");
    }
}
