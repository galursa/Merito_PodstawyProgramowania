import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytajZPliku {
	public static void main(String[] args) throws FileNotFoundException{
		File odczytPliku = new File("test.txt");
		Scanner dane = new Scanner(odczytPliku);
		while(dane.hasNextLine()) {
			System.out.println(dane.nextLine());
		}
		dane.close();
	}
}
