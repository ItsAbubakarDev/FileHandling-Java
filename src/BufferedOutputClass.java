import java.io.*;
/*
BufferedOutputStream is used with other class to write data more efficiently
It maintains internal buffer of 8192 bytes
During the write operation, the bytes are written to the internal buffer instead of disk
Once the buffer is filled or stream is closed , the whole buffer is written to the disk.
Hence the number of communication to the disk is reduced.

 */
public class BufferedOutputClass {
    public static void main(String[] args) throws IOException{

        BufferedOutputStream r = new BufferedOutputStream( new FileOutputStream("D://Mubashir.txt"));
        // In this step Internal buffer is created
        /*
        the internal buffer created by BufferedOutputStream is not stored on the
         hard disk. Instead, it resides in the computer's memory (RAM).
         When you create a BufferedOutputStream, it creates an internal buffer
         in memory to temporarily hold the data before it's written to the underlying
          output stream, such as a file or a network socket
          A network socket is an endpoint for communication between two machines over a network
         */
        String data = "Happy Birthday Asma";
        r.write(data.getBytes());
        /*
        flushing refers to the process of forcing any buffered data to be written out to the
        underlying output stream immediately, without waiting for the buffer  to be filled completely
         or for the stream to be closed.
         It actually ensures that the data is completely written to the disk from the internal buffer.
         */
        r.flush();
        r.close();

    }

}
