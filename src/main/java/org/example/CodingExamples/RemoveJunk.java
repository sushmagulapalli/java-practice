package org.example.CodingExamples;
// How To Remove Junk or Special Characters in String
public class RemoveJunk {
    public static void main(String[] args) {
        String s="!@#@&*()%$#@! , java,*(&";
        s=s.replaceAll("[^a-zA-Z0-9]", "  ").trim();
        System.out.println(s);
    }
}
