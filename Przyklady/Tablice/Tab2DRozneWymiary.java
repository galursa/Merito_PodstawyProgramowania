import java.util.Random;

/*
 * Generujemy tablice dwuwymiarowa z losowymi wartosciami
 * gdzie kazdy wiersz jest o jeden wiekszy od poprzedniego
 */

public class Tab2DRozneWymiary {
	public static void main(String[] args) {
		int rows = 5;
		int array2D[][] = new int[rows][];
		Random rnd = new Random();
		for(int i=0; i<array2D.length; i++)
		{
			array2D[i] = new int[i+1];
			for(int j=0; j<array2D[i].length; j++)
			{
				array2D[i][j] = rnd.nextInt(100);
				System.out.format("%3d",array2D[i][j]);
			}
			System.out.println();
		}
	}
}
