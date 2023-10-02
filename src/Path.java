import java.io.File;

public class Path {
    //Napisz program, która wylistuje wszystkie pliki w danym folderze:
    //public void printDirectory(String directoryPath);

    public void printDirectory(String directoryPath){
        int i = 1;
        File Paths = new File(directoryPath);
        System.out.println("Lista plików zawartych w folderze " + directoryPath);
        for (String file : Paths.list()){
            System.out.println();
            System.out.println(i + ". " + file);
            i++;
        }

    }
}
