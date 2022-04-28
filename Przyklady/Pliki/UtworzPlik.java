import java.io.File;
import java.io.IOException;

public class UtworzPlik {
	public static void main(String[] args) {
		try {
		      File plik = new File("liczby.txt");
		      if (plik.createNewFile()) {
		        System.out.println("Utworzono plik: " + plik.getName());
		      } else {
		        System.out.println("Plik ju¿ istnieje");
		      }
		    } catch (IOException e) {
		      System.out.println("Wyst¹pi³ b³¹d.");
		      e.getMessage();
		    }
	}
}
