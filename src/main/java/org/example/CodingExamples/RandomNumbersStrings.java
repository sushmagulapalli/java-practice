package org.example.CodingExamples;
// How To Generate Random Numbers & Strings

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomNumbersStrings {
    public static void main(String[] args) {
        Random rand=new Random();

        //First type
        int rand_int = rand.nextInt(990);// for numbers
        System.out.println("Random Number" +rand_int);


        //Second Type
        double rand_double=rand.nextDouble();
        System.out.println("Random Number" +rand_double);

         //Third Type
       System.out.println(Math.random());// for decimals 0.0 t0 1.0

        //Using apache common langs
       /*String randNum= RandomStringUtils.randomNumeric(4);
         System.out.println(randNum);

        String randStr=RandomStringUtils.randomAlphabetic(5);
        System.out.println(randStr);*/
    }
}
