import java.util.*;
import java.io.*;
public class ScannerClass {
    public static void main(String[] args) throws IOException{
        File f = new File("D:\\John.txt");
        /*
        Now instead of writing System.in which reads the input from the user
        we will just give the name of object of file so that Scanner class can
        read the input from the file
         */
        Scanner sc = new Scanner(f);
        if (f.exists()){
            /*
           scanner.hasNextLine() is a method call that belongs to the Scanner class in Java.
           It's a boolean method that checks whether there is another line in the input of the Scanner object.
             */
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        }
        else{
            System.out.println("File does not exists");
        }
    }
}
