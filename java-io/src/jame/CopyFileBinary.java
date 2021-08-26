package jame;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class CopyFileBinary {
    public static void main(String[] args) {
        String source = "C:\\Users\\t\\OneDrive\\Desktop\\text.txt";
        String dist = "C:\\Users\\t\\OneDrive\\Desktop\\result.txt";
        File sourceFile = null;
        File distFile = null;
        try {
            sourceFile = new File(source);
            distFile = new File(dist);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            if (distFile.exists()) {
                throw new FileAlreadyExistsException("");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File nguồn không tồn tại");
            ;
        } catch (FileAlreadyExistsException e) {
            System.err.println("File đích đã tồn tại");
        }
        copy(sourceFile, distFile);
    }

    public static void copy(File source, File dist) {
        try {
            OutputStream fileOutputStream = new FileOutputStream(dist);
            InputStream fileInputStream = new FileInputStream(source);
            byte[] bytes = new byte[1024];
            int length = fileInputStream.read(bytes);
            int countLength = length;
            while (length > 0) {
                fileOutputStream.write(bytes, 0, length);
                length = fileInputStream.read(bytes);
                countLength += length;
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println("Lỗi copy");
            ;
        }
    }
}
