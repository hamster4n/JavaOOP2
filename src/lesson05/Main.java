package lesson05;

import java.io.File;
import java.io.IOException;

/**
 * Created by Hamster4n.
 */
public class Main {
    public static void main(String[] args) {
        // точка - это ссылка на каталог моего проекта

        File fileOne = new File("a.txt"); //14-19 создали новый файл
        try {
            fileOne.createNewFile();
        } catch (IOException e){
            System.out.println(e);
        }

        File fileTwo = new File("b.txt");
        fileOne.renameTo(fileTwo); //перемещение файла (не переименование!)

        fileTwo.delete(); //удаляем файл

        File folder = new File("FOLDER"); // создаём папку
        folder.mkdirs();

        File fileTree = new File(folder, "f.exe"); //ложим в папку FOLDER новый файл f.exe
        try {
            fileTree.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }

        fileTree.delete(); //удаляем файл
        folder.delete(); //и только потом папку. Если в папке есть хоть что-то, то ОС не даст удалить папку

        //в пакете IO нет операции копирования. Эта операция пишется вручную.

        File file = new File(".");
        File[] files = file.listFiles();
        for (File file2: files){
            System.out.println(file2);
        }
    }
}
