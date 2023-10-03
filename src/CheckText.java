import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CheckText {
    //Napisz program, który sprawdzi, czy 2 pliki tekstowe mają taką samą zawartość:
    //public boolean areTextFilesEqual(String filePath1, String filePath2);

    private String filePath;
    private String filePath1;
    private String filePath2;
    public CheckText(){}
    public CheckText(String filePath){
        this.filePath = filePath;
    }
    public CheckText(String filePath1, String filePath2 ){
        this.filePath1 = filePath1;
        this.filePath2 = filePath2;
    }
    public boolean areTextFilesEqual(String filePath1, String filePath2) {

        try {
            BufferedReader firstFile = new BufferedReader(new FileReader(filePath1));
            BufferedReader secondFile = new BufferedReader(new FileReader(filePath2));

            String file1, file2;
            while ((file1 = firstFile.readLine()) != null) {
                file2 = secondFile.readLine();
                if (!file1.equals(file2)) {
                    return false;
                }
            }
            boolean isFile2End = secondFile.readLine() == null;

            firstFile.close();
            secondFile.close();
            return isFile2End;


        } catch (IOException e) {
            System.out.println("Błąd");
        }
        return false;
    }

    public boolean invertFile(String filepath){
        boolean result = false;
        try {
            BufferedReader file = new BufferedReader(new FileReader(filepath));
            String input = "";
            String readLine = "";
            List<String> newList = new LinkedList<>();
            while ( (readLine = file.readLine()) != null) {
                newList.add(readLine);
            }

                File plik = new File("nowyPlik.txt");
                FileWriter fWriter = new FileWriter(plik);

                for (int i = 0; i < newList.size(); i++) {
                    int num = newList.size() - i - 1;
                    input = newList.get(num);
                    fWriter.write(input + "\n");
                }
                fWriter.close();
                result = true;


        }catch (IOException e){
            System.out.println("Błąd");
        }

        return result;
    }

    public boolean invertFile1(String filepath) {
        boolean result = false;
        try {
            BufferedReader file = new BufferedReader(new FileReader(filepath));
            String input1 = file.readLine();
            String[] tabTextFile = input1.split(" ");

            File plik = new File("nowyPlik.txt");
            FileWriter fWriter = new FileWriter(plik);

            for(int i = 0; i < tabTextFile.length; i++){
                int num = tabTextFile.length - i - 1;
                fWriter.write(tabTextFile[num] + " ");
            }
            fWriter.close();
            result = true;


        } catch (IOException e) {
            System.out.println("Błąd");
        }

        return result;
    }

}