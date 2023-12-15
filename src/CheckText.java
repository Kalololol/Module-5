import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckText {
    //Napisz program, który sprawdzi, czy 2 pliki tekstowe mają taką samą zawartość:
    //public boolean areTextFilesEqual(String filePath1, String filePath2);

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
            String input;
            int lineCount = 0;
            while (file.readLine() != null) {
                lineCount++;
            }
            String[] newLines = new String[lineCount];

        }catch (IOException e){
            System.out.println("Błąd");
        }

        return result;
    }


}