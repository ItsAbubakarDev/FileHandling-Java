import java.io.*;
public class Filecreation{
    // throws means the main methods is not handling the exception itself
    // The exception is handling by the caller of the main method which is JVM
    public static void main (String[] args)throws IOException{

            File f = new File("D:\\Mubashir.pdf");
            if(f.createNewFile()) { // this method is used to ceate new file
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already exists");
            }
    }

}