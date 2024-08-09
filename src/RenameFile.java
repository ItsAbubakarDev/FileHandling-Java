import java.io.*;
public class RenameFile {
    public static void main(String[] args) throws IOException{
        File f = new File("D://Sugar.txt");
        File r = new File("D://Asma.txt");
        if(f.exists()){
            System.out.println("File name changed to : "+ f.renameTo(r) );
        }else{
            System.out.println("File does not exists");
        }

    }

}
