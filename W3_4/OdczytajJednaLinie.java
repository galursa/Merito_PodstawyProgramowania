	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	 
public class OdczytajJednaLinie {
	 public static void main(String[] args) throws FileNotFoundException {
	     File plik = new File("test.txt");
	     Scanner dane = new Scanner(plik);	 
	     String wiersz = dane.nextLine();
	     System.out.println(wiersz);
	     dane.close();
	 }
}
