import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) 
    {
        //Sort
        for(int i=0; i<arr.length; i++)
        {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        //Now that the array is sorted 
        //Count for negative, positives and 0's
        double pos=0;
        double neg=0;
        double z=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
                neg++;
            else if(arr[i]>0)
                pos++;
        }
        //Find the proportions and print
        z=(double)arr.length-(pos+neg);
        double posp = pos/arr.length;
        double negp = neg/arr.length;
        double zp = z/arr.length;
        
        System.out.println(posp);
        System.out.println(negp);
        System.out.println(zp);
     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
