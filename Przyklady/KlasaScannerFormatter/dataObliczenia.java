import java.util.Calendar;
import java.util.Formatter;

public class dataObliczenia {
	public static void main(String[] args) {
		//dopisa� swoje warto�ci do dzien miesiac i rok i wykona� obliczenia
		Calendar data = Calendar.getInstance();
		Formatter obiekt = new Formatter();
		obiekt.format("%ta : %te-%tm-%tY , Dzie� roku: %tj",data, data, data, data, data );
		System.out.print(obiekt);
	}
}
