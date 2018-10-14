import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) 
    {
        for(int i =1; i < 5 ;i++)
        {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
            
        
        long minSum = 0;
        long maxSum = 0;
        for(int i = 0; i < 4; i++ )
        {
            minSum += arr[i];
        }
        
        for(int i = 1; i < 5; i++ )
        {
            maxSum += arr[i];
        }
        System.out.println(minSum+" "+maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
