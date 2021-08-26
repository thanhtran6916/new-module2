package jame;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\t\\OneDrive\\Desktop\\text.txt");
        File dist = new File("C:\\Users\\t\\OneDrive\\Desktop\\result.txt");

        copy("C:\\Users\\t\\OneDrive\\Desktop\\text.txt", "C:\\Users\\t\\OneDrive\\Desktop\\result.txt");
    }

    public static void copy(String source, String dist) {
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(dist);
            byte[] b = new byte[1024];
            int length = fileInputStream.read(b);
            while (length > 0) {
                fileOutputStream.write(b, 0, length);
                length = fileInputStream.read(b);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
