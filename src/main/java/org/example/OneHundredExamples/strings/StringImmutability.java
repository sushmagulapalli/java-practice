package org.example.OneHundredExamples.strings;

public class StringImmutability {
    public static void main(String[] args) {
        //Question-1: Why strings are immutable ?

        //CASE - 1
        String s1 = "Java";
        String s2 = "Java";

        //Before updating the strings, both are pointing to same object reference
        System.out.println(s1 == s2); //true

        //after updating any of the string, it points a different memory address
        s1 = s1 + "J2EE";
        System.out.println(s1 == s2); //false


        //CASE-2:
        String s3 = new String("Java");
        String s4 = s3.concat("J2EE");

        System.out.println(s3);//not modified
        System.out.println(s4);//need to be assigned to a new object

        //Question-2: difference between == and equals for strings ?
        //"==" compares the addresses of the objects
        //"equals" compares the content of the object

        String s5 = "Sushma";
        String s6 = "Sushma";

        System.out.println(s5 == s6); //true
        System.out.println(s5.equals(s6)); //true

        String s7 = new String("Sushma");
        String s8 = new String("Sushma");
        System.out.println(s7 == s8); //false
        System.out.println(s7.equals(s8)); //true

        String s9 = "Sushma";
        String s10 = "Sushma";
        String s11 = new String("Sushma");
        System.out.println(s9 == s10); //true
        System.out.println(s9.equals(s10)); //true

        System.out.println(s9 == s11); //false
        System.out.println(s9.equals(s11)); //true
    }
}
