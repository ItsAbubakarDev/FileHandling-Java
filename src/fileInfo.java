import java.io.File;
import java.io.IOException;
public class fileInfo{
    public static void main(String[] args){
        try {
            File f = new File("D:\\Saim.pdf"); // this is to create a file
            if (f.createNewFile()) { // This is to check if the new file is created
                System.out.println("File name:" + f.getName());
                System.out.println("File location:" + f.getAbsolutePath());
                System.out.println("File writeable:" + f.canWrite());
                System.out.println("File readable:" + f.canRead());
                System.out.println("File size:" + f.length());
                System.out.println("Delete file:" +f.delete());
            } else {
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Exception Handled");
        }
    }
}