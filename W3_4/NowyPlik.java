import java.io.FileWriter;   
import java.io.IOException;  

public class NowyPlik {
	  public static void main(String[] args) {
	    try {
	      FileWriter mojPlik = new FileWriter("Przyslowie.txt");
	      mojPlik.write("Siala baba mak ");
	      mojPlik.write("Nie wiedziala jak \n");
	      mojPlik.write("A dziad wiedzial nie powiedzial\n");
	      mojPlik.close();
	      System.out.println("Zapisano dane w pliku.");
	    } catch (IOException e) {
	      System.out.println("Nie mo¿na utworzyæ pliku lub wyst¹pi³ inny b³¹d");
	      e.printStackTrace();
	    }
	  }
}
