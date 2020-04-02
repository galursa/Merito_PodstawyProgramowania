import java.util.Formatter;

public class DzieleniePrecyzja {
	public static void main(String[] args) {
		double dzielenie, liczba = 1.0;
		for(int i=1; i<=10; i++)
		{
			dzielenie=liczba/i;
			Formatter lForm =  new Formatter();
			lForm.format("%3.15f %n", dzielenie);
			System.out.print(lForm);
		}
	}
}
