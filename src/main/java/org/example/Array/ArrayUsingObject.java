package org.example.Array;

import sun.tools.jconsole.inspector.XObject;

public class ArrayUsingObject {
    public static void main(String[] args) {
        //Object a[]=new Object[5];
        //a[0]=10;
        //a[1]=20.456;
        //a[2]='S';
        //a[3]="Sushma";
        //a[4]= true;
        Object a[]= {10,20.45678,"Sushma","chintu",'s'};
        for (Object i:a)
        {
            System.out.println(i);
        }
    }
}
