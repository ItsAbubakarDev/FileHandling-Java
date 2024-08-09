import java.io.*;
// BufferedInputStream class is used with other classes to read the data more efficiently
public class BufferedInputClass {
    /*
Buffering refers to the process of temporarily storing data in a memory buffer
before it is processed further or written to its final destination
It reads data in the form of bytes and the default internal buffer value is 8192 bytes
     */
    public static void main(String[] args) {
        try {
            // Create a FileInputStream for the file you want to read


            BufferedInputStream f = new BufferedInputStream( new FileInputStream("D:\\Bluetooth.txt"));

            // Read bytes from the BufferedInputStream
            int data = f.read();
            while (data != -1) {
                System.out.print((char)data);
                data = f.read();
            }

            f.close();
        } catch (IOException e) {
            System.out.println("Exception caught successfully");
        }
    }
}
