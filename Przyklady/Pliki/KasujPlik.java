import java.io.File;

public class KasujPlik {
	public static void main(String[] args) {
		 File mojPlik = new File("liczby.txt"); 
		    if (mojPlik.delete()) { 
		      System.out.println("Skasowano plik: " + mojPlik.getName());
		    } else {
		      System.out.println("Niestety, nie uda³o siê skasowaæ pliku");
		    } 
	}
}
