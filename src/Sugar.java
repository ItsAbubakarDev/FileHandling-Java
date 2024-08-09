import java.io.*;
public class Sugar {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Sugariiii.txt");
        if (f.createNewFile()){
            System.out.println("File has been created successfully");
        }else{
            System.out.println("File already exists");
        }
    }
}
