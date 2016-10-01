package home05.task02;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Hamster4n.
 * Напишите программу, которая примет на вход 2 текстовых файла, а вернёт один.
 * Содержимым этого файла долждны быть слова которые есть и в первом и во втором файле.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file01 = new File("src/home05/task02/file01.txt");
        File file02 = new File("src/home05/task02/file02.txt");

        ArrayList<String> list01 = readFile(file01);
        ArrayList<String> list02 = readFile(file02);

        selectionCommonDataIntoFile(list01, list02);

    }

    public static ArrayList<String> readFile(File file) throws IOException {

        ArrayList<String> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            arr.add(line);
        }
        reader.close();
        return arr;
    }

    public static void selectionCommonDataIntoFile(ArrayList<String > list01, ArrayList<String> list02) throws FileNotFoundException {
        File file03 = new File("src/home05/task02/file03.txt");
        ArrayList<String> list03 = new ArrayList<>();
        for (int i = 0; i < list01.size(); i++) {
            for (int j = 0; j < list02.size(); j++) {
                if (list01.get(i).equals(list02.get(j))){
                    list03.add(list01.get(i));
                }
            }
        }
        PrintWriter pw = new PrintWriter(file03);
        for (String element: list03) {
            pw.println(element);

        }
        pw.close();
    }
}
