import java.io.*;

public class Palindrome {
    public static void main(String args[]) throws IOException {
        int i, len, flag = 1;
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        s = in.readLine();
        len = s.length();
        for (i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i))
                flag = 0;
        }
        if (flag == 1)
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " is not palindrome");
    }
}