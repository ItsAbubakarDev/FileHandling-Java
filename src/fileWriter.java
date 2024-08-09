import java.io.*;
import java.io.IOException;
public class fileWriter {
    public static void main(String[] args) {
        // In this we will learn how to write something in a file
        try {
            FileWriter f = new FileWriter("D://Mubashir.txt");
            try {
                f.write("Sugar is the best coder hehe");
                System.out.println("Write successfully");
            }

            finally{
                f.close();
            }
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
}
