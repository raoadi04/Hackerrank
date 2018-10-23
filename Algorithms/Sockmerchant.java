import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) 
    {
        //Sort
        for(int i=1; i<n; i++)
        {
            int j = i-1;
            int key = ar[i];
            
            while(j>=0 && ar[j] > key)
            {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        //Count for the number of socks of similar types
        int[] count= new int[n];
        int d=0;
        int k=0;
        
        for(int i=0; i<n-1; i++)
        {
            int nf = 0;
            count[k]++;
            int j=i+1;
            while(j<n)
            {
                   if(ar[i]!=ar[j])
                   {
                       nf=1;
                       i=j;
                       k++;
                       break;
                   }
                   else
                       count[k]++;
                   j++;
            }
            if(nf!=0)
                i--; 
            if(j>=n)
                break;
        }
        //Finding number of pairs and Summing tthem up
        int i = 0;
  
        int totalpairs = 0;
        while (count[i] != 0 ) 
        {
            totalpairs = totalpairs + count[i]/2;
            i++;
        }
    
        return totalpairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
