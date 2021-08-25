package jame;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        String dataFile = "C:\\Users\\t\\OneDrive\\Desktop\\text.txt";
        String dataWrite = "C:\\Users\\t\\OneDrive\\Desktop\\result.txt";
        String result = readText(dataFile);
        int length = result.length();
        System.out.println(length);
        writeText(dataWrite, result);
    }

    public static void writeText(String dataWrite, String result) {
        try {
            FileWriter fileWriter = new FileWriter(dataWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(result);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Đường đẫn file");
        }
    }

    public static String readText(String dataFile) {
        String result = null;
        try {
            File file = new File(dataFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            result = line;
            while (line != null) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                result += ("\n" + line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Không có file hoặc định dạng file không đúng");
        }
        return result;

    }

}
