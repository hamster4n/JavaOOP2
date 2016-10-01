package home05.task01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Hamster4n.
 * Напишите программу, которая скопирует файлы (с заранее определённым расширением - например только doc)
 * из каталога источника в каталог приёмник
 */
public class Main {
    public static void main(String[] args) {
        String source = "src/home05/task01/source";
        String receiver = "src/home05/task01/receiver";
        String extension = "txt";

        File fSource = new File(source);
        File fReceiver = new File(receiver);
//        if (fSource.isDirectory()){
//            String[] filenames = fSource.list();
//            for (String filename: filenames) {
//                System.out.println(filename);
//            }
//        }

        File[] files = fSource.listFiles();
        for (File file:files) {
            if (checkForExtension(extension, file)){
                System.out.println(file);

                try {
                    copy(fSource, fReceiver);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
    public static void copy(File source, File receiver) throws IOException {
        Files.copy(source.toPath(), receiver.toPath());
    }
    public static boolean checkForExtension(String extension, File pathname){
        return pathname.isFile() && pathname.getName().endsWith(extension);
    }
}
