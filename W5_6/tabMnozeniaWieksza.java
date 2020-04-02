import java.util.Formatter;

public class tabMnozeniaWieksza {
	public static void main(String[] args) {
		int mnozenie[][] = new int[5][];
		for(int i=0; i<5;i++)
		{
			mnozenie[i] = new int[5];
			for(int j=0; j<5;j++)
			{
				mnozenie[i][j]=(i+10)*(j+10);
				Formatter liczba =  new Formatter();
				liczba.format("%5d", mnozenie[i][j]);
				System.out.print(liczba);
			}
			System.out.println();
		}
	}
}
