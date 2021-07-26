import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int ch, sum = 0;
        String str = "", filename;

        FileReader fr = null;
        System.out.print("Enter filename to read: ");
        filename = in.nextLine();
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
            System.out.println(fe);
        }

        if (fr != null) {
            while ((ch = fr.read()) != -1)
                str += (char) ch;
            fr.close();
        }

        String integers[] = str.split(" ");
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
            sum += Integer.parseInt(integers[i]);
        }

        System.out.println("Sum: " + sum);

        in.close();
    }
}