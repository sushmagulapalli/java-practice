package org.example.Array;

public class TwoDimensionalArray2 {
    public static void main(String[] args) {

        int a[][] = {{10, 20, 30}, {20, 30, 40}, {30, 40, 50}, {50, 60, 70}, {50, 60, 70}};
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + "  ");

            }
            {
                System.out.println();
            }
        }


    }
}
