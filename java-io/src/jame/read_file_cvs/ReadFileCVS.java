package jame.read_file_cvs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ReadFileCVS {
    public static void main(String[] args) {
        String filePatch = "E:\\CodeGym\\module_2\\tuan-2\\java-io\\src\\jame\\read_file_cvs\\text.txt";
        LinkedList<String[]> a = readFile(filePatch);
        for (int i = 0; i < a.size(); i++) {
            System.out.print("id " + a.get(i)[0] + " ");
            System.out.print("code " + a.get(i)[1] + " ");
            System.out.print("name " + a.get(i)[2] + " ");
            System.out.println();
        }
    }

    public static LinkedList<String[]> readFile(String filePatch) {
        LinkedList<String[]> arr = new LinkedList<>();
        try {
            File file = new File(filePatch);
            if (!file.exists()) {
                throw new IOException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] data = line.split(",");
                arr.add(data);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc bị lỗi");
        }
        return arr;
    }

}
