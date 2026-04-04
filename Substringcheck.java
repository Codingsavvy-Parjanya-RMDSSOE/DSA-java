import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class Substringcheck{
    public static void main(String[] args)
    {
        String a = "Parjanya";
        String b = "janya";
        if(a.contains(b))
        {
            System.out.println("b is substring of a");
        }
        else{
            System.out.println("b is not a substring of a");
        }
    }
}