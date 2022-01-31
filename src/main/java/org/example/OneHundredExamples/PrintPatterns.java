package org.example.OneHundredExamples;

public class PrintPatterns {

    public static void logic(int count) {
        int rowCount = 1;

        for (int i = count; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();

            rowCount++;
        }
    }


    public static void main(String[] args) {
        logic(5);
    }
}
