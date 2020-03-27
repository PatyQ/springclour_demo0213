package iotest;

import java.io.*;

public class InputDemo {
    public static void main(String[] args) {

        String path = "G:\\TEST\\a.txt";
        InputStream input = null;

        try {
            input = new BufferedInputStream(new FileInputStream(path));
            byte[] b = null;
            int c = 0;
            int len = input.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
