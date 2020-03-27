package iotest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest2 {

    public static void main(String[] args) throws IOException {
        //声明流对象
        FileOutputStream fos=null;
        try {
            File file = new File("G:\\TEST\\b\\c\\d");
            if (!file.exists()){
                file.mkdirs();
            }
            //1.创建流对象,第二个参数是否覆盖
            fos=new FileOutputStream(file+File.separator+"b.txt",true);
            //2.用流来写入内容到文件中
            fos.write("我!".getBytes());
            fos.write("你好!".getBytes());
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3.关流
            if (fos!=null) {
                fos.close();
            }
        }

    }
}
