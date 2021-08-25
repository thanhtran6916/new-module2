package jame;

import java.io.*;
import java.util.ArrayList;

public class TimGiaTriLonNhatVaGhiRaFile {
    public static void main(String[] args) {
        String filePatch = "C:\\Users\\t\\OneDrive\\Desktop\\text.txt";
        System.out.println(calculator(filePatch));
        ArrayList<Integer> arrNumber = arrNumber(filePatch);
        int max = maxArrNumber(arrNumber);
        writeNumber("C:\\Users\\t\\OneDrive\\Desktop\\result.txt", max);
        try {
            File file = new File("C:\\Users\\t\\OneDrive\\Desktop\\result.txt");
            if (!file.exists()) {
                throw new IOException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Integer> arrNumber(String filePatch) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            File file = new File(filePatch);
            if (!file.exists()) {
                throw new IOException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String number = bufferedReader.readLine();
            while (number != null) {
                arrayList.add(Integer.parseInt(number));
                number = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static void writeNumber(String filePatch ,int max) {
        try {
            FileWriter writer = new FileWriter(filePatch, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trí lớn nhất là " + max + "\n");
            bufferedWriter.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int maxArrNumber(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int value : arrayList) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static int calculator(String filePatch) {
        int sum = 0;
        try {
            File file = new File(filePatch);
            if (!file.exists()) {
                throw new IOException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                sum += Integer.parseInt(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
