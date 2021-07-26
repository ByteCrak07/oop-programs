import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int ch;
        String str, filename;
        System.out.print("Enter a string to write to text file: ");
        str = in.nextLine();

        System.out.print("Enter filename to write: ");
        filename = in.nextLine();
        FileWriter fw = new FileWriter(filename);

        fw.write(str);

        System.out.println("Writing successful");
        fw.close();

        FileReader fr = null;
        System.out.print("Enter filename to read: ");
        filename = in.nextLine();
        try {
            fr = new FileReader(filename);
        } catch (Exception fe) {
            System.out.println("File not found");
        }

        if (fr != null) {
            while ((ch = fr.read()) != -1)
                System.out.print((char) ch);

            fr.close();
        }

        in.close();
    }
}