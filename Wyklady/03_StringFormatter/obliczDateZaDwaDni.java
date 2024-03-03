import static java.util.Calendar.DAY_OF_MONTH;

import java.util.Calendar;
import java.util.Formatter;

public class obliczDateZaDwaDni {
	public static void main(String[] args) {
		//pobierzemy datê dzisiejsz¹ i obliczymy datê za dwa dni
		Formatter data =  new Formatter();
		Calendar dzis = Calendar.getInstance();	
		int dzien = Calendar.DAY_OF_MONTH;
		System.out.println("Dzisiejsza data:");
		data.format("%td %th %ty", dzis, dzis, dzis);
		System.out.println(data);
		System.out.println("Za dwa dni:");
		//Wprowadzamy korektê dnia:
		dzien=dzien+2-3;
		data.close();
		Formatter data1 =  new Formatter();
		data1.format("%s %th %ty",dzien, dzis, dzis);
		System.out.println(data1);
	}
}
