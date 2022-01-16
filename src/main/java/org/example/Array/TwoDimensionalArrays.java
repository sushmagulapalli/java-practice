package org.example.Array;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int a[][] = new int[5][5];

       // a[0][0] = 10;
        //a[0][1] = 20;
        //a[0][2] = 30;
//        a[0][3] = 130;
//        a[0][4] = 390;
//
//        a[1][0] = 310;
//        a[1][1] = 3230;
//        a[1][2] = 3340;
//        a[1][3] = 340;
//        a[1][4] = 350;
//
//        a[2][0] = 230;
//        a[2][1] = 40;
//        a[2][2] = 60;
//        a[2][3] = 370;
//        a[2][4] = 70;
//
//
//        a[3][0] = 310;
//        a[3][1] = 320;
//        a[3][2] = 330;
//        a[3][3] = 340;
//        a[3][4] = 350;
//
//        a[4][0] = 360;
//        a[4][1] = 370;
//        a[4][2] = 380;
//        a[4][3] = 390;
//        a[4][4] = 400;
     //   The below one is using for loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+ "   ");
            }
            {
                System.out.println();
            }
        }
// for each loop
//        for (int i[]:a)
//        {
//           for (int j:i)
//           {
//               System.out.print(j+"  ");
//
//           }
//            {
//                System.out.println();
//            }
//        }

    }
}
