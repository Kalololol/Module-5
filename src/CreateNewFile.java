import java.io.*;
import java.util.Scanner;

public class CreateNewFile {
    private final Scanner sc = new Scanner(System.in);

    //Napisz metodę, która stworzy nowy plik, o nazwie nadanej przez użytkownika i zapisze do niego treść tekstu, który wprowadzi
    // użytkownik. Jeśli operacja zakończy się sukcesem, zwróć true, jeśli nie, zwróć false.
    //
    // Następnie dodaj metodę, która przyjmie w argumencie nazwę
    // pliku (nie musi być podana przez użytkownika) i wydrukuje jego zawartość. Metody:
    //public boolean writeUserInputToFile();
    //public void readFromFile(String fileName);
    //Bonus: Przy zapisaniu co 4 słowo wstawiaj znak nowej linii do zapisywanego pliku.

    public boolean writeUserInputToFile(){
        System.out.println("Podaj nazwę pliku: ");
        String input = sc.nextLine();
        String fileName = input + ".txt";

        File file = new File( fileName );
        boolean fileExists = file.exists();
        if(!fileExists) {
            try {
                fileExists = file.createNewFile();
            }catch (IOException e){
                System.out.println("Nie udało się utworzyć pliku");
                return false;
            }
        }
        try {
            FileWriter fWriter = new FileWriter(fileName);
            System.out.println("Podaj treść do pliku:");
            String textFile = sc.nextLine();
            String[] tabTextFile = textFile.split(" ");
            String result = "";
            int i = 1;
            for(String txt : tabTextFile){
                if(i%4 == 0) {
                    result += " " + txt ;
                    fWriter.write(result + "\n");
                    result = "";

                }
                else {
                    result += " " + txt;
                }
                i++;
            }
            fWriter.write(result);
            fWriter.close();
        }catch (IOException e){
            System.out.println("Wystąpił błąd podczas zapisu do pliku");

        }

        return true;
    }
    public void readFromFile(String fileName){

        FileReader fReader = null;
        BufferedReader bReader = null;
        try {
             fReader = new FileReader(fileName);
             bReader = new BufferedReader(fReader);
            String nextLine = null;
            while ((nextLine = bReader.readLine()) != null) {
                System.out.println(nextLine);
            }
        }catch (IOException e){
            System.out.println("Wystąpił błąd, nie odnaleziono pliku o wskazanej nazwie.");
        }
        finally {
            try {
                if(bReader != null){
                    bReader.close();
                }
            }catch (IOException e){
                System.out.println("Wystąpił błąd.");
            }
        }

    }


}
