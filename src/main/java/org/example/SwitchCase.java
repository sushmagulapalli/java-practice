package org.example;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

public class SwitchCase {
    public static void main(String[] args) {
        int day=6;
        switch (day)
        {
            case 1:
                System.out.println("Sunday");break;
            case 2:
                System.out.println("Monday");break;
            case 3:
                System.out.println("Tuesday");break;
            case 4:
                System.out.println("Wednesday");break;
            case 5:
                System.out.println("Thursday");break;
            case 6:
                System.out.println("Friday");break;
            default:
                System.out.println("Saturday");
        }
    }
}
