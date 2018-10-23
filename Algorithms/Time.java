import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) 
    {
 
        String hr = s.substring(0,2);
        String min= s.substring(3,5);
        String sec= s.substring(6,8);
        String don = s.substring(8,10);
        

        int h = Integer.parseInt(hr);
        
        String hrs = "blah";
        
        if(don.equals("PM"))
        {
            if(h<12)
            {
                h+=12;
                hrs=Integer.toString(h);
            }
            if(h==12)
                hrs=Integer.toString(h);
        }
        else
        {
            if(h==12)
                hrs ="00";
             if(h>0 && h<10)
                hrs ="0"+Integer.toString(h);
        }
        return hrs+":"+min+":"+sec;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
