import java.util.Formatter;

public class LiczbaRzeczywistaPomnozona {
	public static void main(String[] args) {
		double liczba = 0.123456789;
		for(int i=1; i<=9; i++)
		{
			Formatter liczFormat = new Formatter();
			liczFormat.format("%5.9f",liczba*i);
			System.out.println(liczFormat);
			liczFormat.close();
		}
	}
}
