import java.util.Scanner;

public class MetodyNaStringach {
	public static void main(String[] args) {
	//odczytamy od u¿ytkownika wyraz i zamienimy wszystkie litery na wielkie litery
	//do angielskiego s³owa dodamy suffix - koñcówkê - iness
	Scanner odczyt = new Scanner(System.in);
	System.out.println("Podaj wyraz. Zamieniê na wielkie litery");
	String wyraz = odczyt.next();
	System.out.println(wyraz.toUpperCase());
	String angWyraz = "happy"; //happiness
	int index = angWyraz.indexOf("y");
	String nowAngWyraz;
	nowAngWyraz=angWyraz.substring(0, index);
	nowAngWyraz+="iness";
	System.out.println("Nowy wyraz: "+nowAngWyraz);
	odczyt.close();	
	}
}
