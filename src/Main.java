import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//Napisz program, która wylistuje wszystkie pliki w danym folderze:
//public void printDirectory(String directoryPath);

//        Path path = new Path();
        //path.printDirectory("C:\\Users\\Karol\\Desktop");
//        CreateNewFile createNewFile = new CreateNewFile();
//        createNewFile.writeUserInputToFile();
        //createNewFile.readFromFile("pies.txt");


//wygenerowac dwa pliki testowe i sprawdzić czy zostaną porównane
        CheckText checkText = new CheckText();
        System.out.println(checkText.areTextFilesEqual("kot.txt", "kot.txt"));



        }
    }
