import java.util.Scanner;
import java.io.*;
public class ScannerRead {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\Asma.txt");
            Scanner sc = new Scanner(f);
            if (f.exists()) {
                while (sc.hasNextLine()) {
                    String s = sc.nextLine();
                    System.out.println(s);
                }
            }
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
