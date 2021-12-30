package org.example.ExceptionHandling;


/* Airthmetic Exception
  NullPointer Exception
  NumberFormatException
  ArrayIndexOutOfBoundException
 */

public class UncheckedException {
    public static void main(String[] args) {
        int a=20;
        //System.out.println(a/0);// Airthemetic Exception

        String s=null;
       // System.out.println(s.length());//Null Pointer Exception

        String st="abcdef";
       // int i=Integer.parseInt(st);// NUmber Format Exception
       // System.out.println(i);

        int arr[]=new int[5];
        arr[10]=100;  //ArrayIndex Out Of Bound Exception


    }
}
