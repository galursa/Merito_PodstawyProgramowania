import java.util.Formatter;
import java.util.Scanner;

public class formatowanieCiagu {
	public static void main(String[] args) {
		//Wy�wietlamy w p�tli ci�g i wy�wietla sie numer elementu i element.
		
		int rozmiar;
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj rozmiar ci�gu");
		rozmiar = dane.nextInt();
		for(int i=1; i<=rozmiar; i++)
		{
			Formatter ciag = new Formatter();
			ciag.format("%d : %d %n",i,i*2 ); //1 : 1
			System.out.print(ciag);
			ciag.close();
		}
		dane.close();
		
	}
}
