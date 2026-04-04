import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class Movezero{
    public static void main(String [] args)
    {
        int a[] = {2,0,5,1,7,0,4,6,0};
        int j = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != 0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}