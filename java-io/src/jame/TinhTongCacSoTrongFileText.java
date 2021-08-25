package jame;

import java.io.*;

public class TinhTongCacSoTrongFileText {
    public static void main(String[] args) {
        readFileText("C:\\Users\\t\\OneDrive\\Desktop\\text.txt");

    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            int sum = 0;
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            while (line != null) {
                sum += Integer.parseInt(line);
                line = br.readLine();
            }
            System.out.println("Tông " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc bị lỗi");
        }
    }
}
