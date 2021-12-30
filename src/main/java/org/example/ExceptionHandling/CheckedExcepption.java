package org.example.ExceptionHandling;

///Using try Catch Finally
public class CheckedExcepption {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            arr[8] = 100;// ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("in catch Block");
            System.out.println(e.getMessage());
        } finally
        {
            System.out.println("This is Final Block");
        }
    }
}

