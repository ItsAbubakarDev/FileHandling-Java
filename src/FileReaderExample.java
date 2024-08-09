import java.io.*;
// Here we are using the class FileReader but we can also
// use the Scanner class or BufferedReader stream class or FileInputStream class to read the file

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("D://Sugar.txt");
            try {
                int i;
                //read is the method in java which reads file character by character and returns value in the form of integer
                // while using Scanner class we will use the method readLine() instead of read which reads the whole line at same time
                //In java the read() method return the value of -1 which shows there is no character left to read
                while ((i = r.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                r.close();
                System.out.println("\nFile closed");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
