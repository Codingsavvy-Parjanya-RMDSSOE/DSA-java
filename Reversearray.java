import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Reversearray
{
    public static void main(String[] args) {
        int a[] = {2,4,1,3};
        int start = 0;
        int end = a.length - 1;

        while(start < end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(a));
    }
}