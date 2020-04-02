import java.util.Formatter;

public class TabMnozeniaPoprawiona {

	public static void main(String[] args) {
		int mnozenie[][] = new int[5][];
		mnozenie[0]= new int[5];
		mnozenie[1]= new int[5];
		mnozenie[2]= new int[5];
		mnozenie[3]= new int[5];
		mnozenie[4]= new int[5];
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<5;j++)
			{
				mnozenie[i][j]=(i+1)*(j+1);
				Formatter liczba =  new Formatter();
				liczba.format("%3d", mnozenie[i][j]);
				System.out.print(liczba);
			}
			System.out.println();
		}
	}
}
