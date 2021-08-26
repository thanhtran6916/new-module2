package jame;

import java.io.*;

public class CopyFileCoDungLuong {
    public static void main(String[] args) {
        File source = new File("E:\\CodeGym\\module_2\\tuan-2\\java-io\\src\\jame\\text.txt");
        File dest = new File("E:\\CodeGym\\module_2\\tuan-2\\java-io\\src\\jame\\result.txt");
        copyFile(source, dest);

    }

    public static void copyFile(File source, File dest) {
        try {
            InputStream inputStream = new FileInputStream(source);
            OutputStream outputStream = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length = inputStream.read(bytes);
            while (length > 0) {
                outputStream.write(bytes, 0, length);
                length = inputStream.read(bytes);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
