package org.example.CodingExamples;

//Check Given Number is Prime Or Not

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 156787;
        int count = 0;

        if(num > 1)
        {
            for (int i = 1; i <=num ; i++)
            {
                if (num%i==0)
                    count++;

            }
            if (count==2)
            {
                System.out.println("It is a Prime NUmber");
            }
            else
            {
                System.out.println("Not Prime NUmber");
            }

        }
        else {
            System.out.println("It is not a prime number");
        }
    }
}
