import java.util.Calendar;
import java.util.Formatter;

public class OperacjeNaDacie {
	public static void main(String[] args) {
		//Odczytujemy dzisiejsz¹ datê
		//wyœwietlamy datê w kolejnoœci: Rok, dzieñ tygodnia, dzieñ, miesi¹c
		Formatter dane = new Formatter();
		Calendar dzis = Calendar.getInstance();
		dane.format("%1$tY - %1$tA - %1$te - %1$tB ",dzis);
		System.out.println(dane);
	}
}
