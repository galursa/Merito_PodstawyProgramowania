import java.util.Random;
import java.util.Formatter;

public class PlusMinus {
	public static void main(String[] args) {
		Random los = new Random();
		int liczba;
		for(int i=0;i<10; i++)
		{
			liczba = los.nextInt(10);
			liczba -= 6; //liczba=liczba-6;
			Formatter fmt = new Formatter();
			fmt.format("%+d",liczba);
			System.out.println(fmt);
		}
	}
}
