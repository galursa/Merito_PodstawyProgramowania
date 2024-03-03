import java.util.Calendar;
import java.util.Formatter;

public class dataObliczenia {
	public static void main(String[] args) {
		//dopisaæ swoje wartoœci do dzien miesiac i rok i wykonaæ obliczenia
		Calendar data = Calendar.getInstance();
		Formatter obiekt = new Formatter();
		obiekt.format("%ta : %te-%tm-%tY , Dzieñ roku: %tj",data, data, data, data, data );
		System.out.print(obiekt);
	}
}
