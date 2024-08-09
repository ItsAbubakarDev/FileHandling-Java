import java.io.*;
public class FileCopy {
    public static void main(String[] args) throws IOException{
        //First we have to read the data so we use the class FileInputStream to read data from file
        //FileInputStream class cannot create a new File and read the data from already existing file
        FileInputStream r = new FileInputStream("D://Sugar.txt");
        //FileOutputStream class is used to create a new file and write data into it
        // In the given case it will create a file Sugarii.txt and write data that by copying it from Sugar.txt file
        FileOutputStream w = new FileOutputStream("D://Sugarii.txt");
        int i ;
        while((i = r.read())!=-1){
            w.write((char)i);
        }
        r.close();
        w.close();
        System.out.println("Data copied successfully");
    }
}
