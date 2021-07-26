import java.io.*;
 
public class Freq
{
    public static void main(String args[]) throws IOException
    {
        int i,len,freq=0;
        String s;
        char c;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter the string: ");
        s = in.readLine();
        System.out.print("Enter the character to be checked: ");
        c = (char)in.read();
        len = s.length();
        for(i=0; i<len; i++)
        {
            if(s.charAt(i) == c)
                freq++;
        }
        System.out.println("Frequency of " + c + " in " + s + " is " + freq);
    }
} 