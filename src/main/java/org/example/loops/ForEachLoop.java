package org.example.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        int a[] = new int[15];
        a[0] = 5;
        a[1] = 10;
        a[2] = 20;
        a[3] = 30;
        a[4] = 40;
        a[5] = 50;
        a[6] = 60;
        a[7] = 70;
        a[8] = 80;
        a[9] = 90;
        a[10] = 100;
        a[11] = 110;
        a[12] = 120;
        a[13] = 130;
        a[14] = 140;
        for (int i : a) {
            System.out.println(i);
        }

    }
}
