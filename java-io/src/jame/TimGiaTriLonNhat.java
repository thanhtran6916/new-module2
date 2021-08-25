package jame;

import java.io.*;
import java.util.ArrayList;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        String dataPatch = "C:\\Users\\t\\OneDrive\\Desktop\\text.txt";
        String dataWrite = "C:\\Users\\t\\OneDrive\\Desktop\\result.txt";
        ArrayList<Integer> listNumber = list(dataPatch);
        int max = maxList(listNumber);
        write(dataWrite, max);
    }

    private static void write(String dataWrite, int max) {
        try {
            FileWriter fileWriter = new FileWriter(dataWrite, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("giá trị lớn nhất là " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int maxList(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int number : list) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    private static ArrayList<Integer> list(String dataPatch) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            File file = new File(dataPatch);
            if (!file.exists()) {
                throw new IOException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
