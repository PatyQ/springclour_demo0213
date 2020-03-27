package iotest;

import java.io.*;
import java.util.Properties;

public class IoTestDemo {

    public static void main(String[] args) throws IOException {
        String s = "hs";
        new IoTestDemo().getIO();

    }
    public void getIO() throws IOException {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        String path = "G:\\TEST\\A.text";

//        System.err.println(path);
//        File file = new File(path);

        try {
            inputStream = new BufferedInputStream(new FileInputStream(path));
            outputStream = new BufferedOutputStream(new FileOutputStream("G:\\TEST.B.text",false));
            Properties properties = new Properties();
            properties.load(inputStream);
//            String s = properties.getProperty("stu.name");
            byte[] b = new byte[10];
            int i = inputStream.read(b);
            while (i != -1){
                outputStream.write(b,0,i);
                i = inputStream.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }

    }

}
