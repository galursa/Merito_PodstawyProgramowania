import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class linijki {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("test.txt");
        Scanner dane = new Scanner(plik);
        while (dane.hasNextLine()) {
            String data = dane.nextLine();
            System.out.println(data);
          }
        dane.close();
    }
}
