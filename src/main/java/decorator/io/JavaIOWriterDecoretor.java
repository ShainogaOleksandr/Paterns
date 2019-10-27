package decorator.io;

import java.io.*;

public class JavaIOWriterDecoretor extends BufferedWriter {
    BufferedWriter bufferedWriter;
    public JavaIOWriterDecoretor(Writer writer) {
        super(writer);
    }

    public JavaIOWriterDecoretor(Writer writer, int i) {
        super(writer, i);
    }

    @Override
    public void write(String s) throws IOException {
        super.write(s.toUpperCase());
    }
}
