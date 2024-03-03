import java.util.Calendar;
import java.util.Formatter;

public class OdczytanieBiezacejDaty {
	public static void main(String[] args) {
		Formatter data =  new Formatter();
		Calendar dzis = Calendar.getInstance();
		 data.format("%tr", dzis); 
		 System.out.println(data);
		 data.close();
		 
		//A teraz chcemy pe³n¹ nazwê miesi¹ca tygodnia i rok w postaci liczby czerocyfrowej	 
		 Formatter data2 = new Formatter();
		 data2.format("%td %tB, %tA, %tY", dzis, dzis, dzis, dzis); 
		 System.out.println(data2);
		 data2.close();
	}
}
