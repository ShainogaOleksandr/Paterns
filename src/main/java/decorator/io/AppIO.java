package decorator.io;

import java.io.*;
import java.util.zip.CheckedOutputStream;

public class AppIO {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));

        writer.write("test");
        writer.flush();

        writer= new JavaIOWriterDecoretor(writer);


        writer.write("test");
        writer.flush();
    }
}
