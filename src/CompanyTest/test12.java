package CompanyTest;
import java.io.*;
import java.util.*;
public class test12 {
    public static void main(String[] args) {
        Hashtable<Integer, String> mp1 = new Hashtable<>();
        Hashtable<Integer, String> mp2 = new Hashtable<Integer, String>();
        mp1.put(1, "one");
        mp1.put(2, "two");
        mp1.put(3, "three");
        mp2.put(4, "four");
        mp2.put(5, "five");
        mp2.put(6, "six");
        System.out.println(mp1);
        System.out.println(mp2);
    }
}
